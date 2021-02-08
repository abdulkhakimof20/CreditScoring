package com.scoring.demo.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class UserInfo {
  @JsonProperty("firstname")
  private String firstName;
  @JsonProperty("lastname")
  private String lastName;
  @JsonProperty("fathername")
  private String fatherName;
  @JsonProperty("pasport")
  private String passport;
  @JsonProperty("birthDate")
  private String dateBirth;
  @JsonProperty("salary")
  private Salary[] salary;
}
