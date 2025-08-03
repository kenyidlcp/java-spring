package com.example.market.domain;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class PurchaseItem {

  private Long productId;
  private int quantity;
  private BigDecimal total;
  private Boolean active;
}
