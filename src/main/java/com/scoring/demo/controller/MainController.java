package com.scoring.demo.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.scoring.demo.entity.ApprovedCredit;
import com.scoring.demo.entity.Salary;
import com.scoring.demo.entity.UserInfo;
import com.scoring.demo.util.ResponseUtil;
import org.apache.catalina.User;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import static com.scoring.demo.util.ResponseUtil.getSums;

@RestController
@CrossOrigin
@RequestMapping(path = "/api", consumes = MediaType.APPLICATION_JSON_VALUE)
public class MainController {


  @PostMapping(value = "/calculate")
  public void getCredit(@RequestBody UserInfo userInfo) throws IOException {
    ResponseUtil.toJson(userInfo);
  }

  @PostMapping(value = "/result")
  @ResponseBody
  public ApprovedCredit getResult() throws IOException {
    List<UserInfo> users = new ArrayList<>();
    try (Reader reader = new FileReader("src/main/resources/userInfo.json")) {
      Type listType = new TypeToken<List<UserInfo>>() {
      }.getType();
      Gson gson1 = new GsonBuilder().setLenient().create();
      users = gson1.fromJson(reader, listType);
    }
    UserInfo userInfo = users.get(users.size() - 1);
    List<Double> sums = new ArrayList<>();
    for (Salary d : userInfo.getSalary()) {
      sums.add(d.getValue());
    }
      List<Double> yearlyProc = getSums(sums);
    ApprovedCredit approvedCredit =
        new ApprovedCredit(userInfo.getFirstName(), userInfo.getLastName(),
            yearlyProc.get(0), yearlyProc.get(1), yearlyProc.get(2), yearlyProc.get(3));
    return approvedCredit;
  }

  @PostMapping(value = "/stats")
  @ResponseBody
  public List<UserInfo> getStats() throws IOException {
    List<UserInfo> users = new ArrayList<>();
    try (Reader reader = new FileReader("src/main/resources/userInfo.json")) {
      Type listType = new TypeToken<List<UserInfo>>() {
      }.getType();
      Gson gson1 = new GsonBuilder().setLenient().create();
      users = gson1.fromJson(reader, listType);
    }
    return users;
  }
}
