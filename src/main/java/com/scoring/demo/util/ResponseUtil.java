package com.scoring.demo.util;

import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import com.scoring.demo.entity.UserInfo;
import org.apache.catalina.User;

import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class ResponseUtil {
  public static void toJson(UserInfo userInfo) throws IOException {
    List<UserInfo> users = new ArrayList<>();
    try (Reader reader = new FileReader("src/main/resources/userInfo.json")) {
      Type listType = new TypeToken<List<UserInfo>>() {}.getType();
      Gson gson1 = new GsonBuilder().setLenient().create();
        users = gson1.fromJson(reader, listType);
      try (Writer writer = new FileWriter("src/main/resources/userInfo.json")) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.create();
        users.add(userInfo);
        gson.toJson(users, writer);
      }
    }
  }

  public static List<Double> getSums(List<Double> salary){
    List<Double> sums = new ArrayList<>();
    double sum = 0.0;
    for(double sal : salary) {
      sum += sal*0.13;
    }
    sums.add((sum/2)*((1+22/100)*(36/12))); //Сумма кредита на 3 года
    sums.add(sums.get(0)*(22 + (22/(1+22)*36-1))); //Ежемесячный платеж 3 года
    sums.add((sum/2)*((1+22/100)*(48/12))); //Сумма кредита на 3 года
    sums.add(sums.get(2)*(22 + (22/(1+22)*48-1))); //Ежемесячный платеж 3 года
    return sums;
  }
}
