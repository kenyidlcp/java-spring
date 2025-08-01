package com.example.market.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Embeddable
@Getter
@Setter
public class ComprasProductoPk implements Serializable {

  @Column(name = "id_compra")
  private Long idCompra;

  @Column(name = "id_producto")
  private Long idProducto;
}
