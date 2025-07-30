package com.example.market.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "compras_productos")
@Getter
@Setter
public class ComprasProducto {

  @EmbeddedId
  private ComprasProductoPk id;

  private Integer cantidad;
  private BigDecimal total;
  private Boolean estado;

  @ManyToOne
  @JoinColumn(name = "id_compra", insertable = false, updatable = false)
  private Compra compra;

  @ManyToOne
  @JoinColumn(name = "id_producto", insertable = false, updatable = false)
  private Producto producto;

  //@OneToMany(mappedBy = "producto")
  //private List<ComprasProducto> productos;

}
