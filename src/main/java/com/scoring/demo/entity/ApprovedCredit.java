package com.scoring.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class ApprovedCredit {
  private String firtName;
  private String lastName;
  private Double threeYear;
  private Double threeYearMonthly;
  private Double fourYear;
  private Double fourYearMonthly;
}
