package com.example.market.persistence.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table(name = "compras_productos")
@Getter
@Setter
@Data
public class ComprasProducto {

  @EmbeddedId
  private ComprasProductoPk id;

  private Integer cantidad;
  private BigDecimal total;
  private Boolean estado;

  @ManyToOne
  @MapsId("idCompra")
  @JoinColumn(name = "id_compra", insertable = false, updatable = false)
  private Compra compra;

  @ManyToOne
  @JoinColumn(name = "id_producto", insertable = false, updatable = false)
  private Producto producto;

  public Integer getCantidad() {
    return cantidad;
  }

  public void setCantidad(Integer cantidad) {
    this.cantidad = cantidad;
  }

  public Compra getCompra() {
    return compra;
  }

  public void setCompra(Compra compra) {
    this.compra = compra;
  }

  public Boolean getEstado() {
    return estado;
  }

  public void setEstado(Boolean estado) {
    this.estado = estado;
  }

  public ComprasProductoPk getId() {
    return id;
  }

  public void setId(ComprasProductoPk id) {
    this.id = id;
  }

  public Producto getProducto() {
    return producto;
  }

  public void setProducto(Producto producto) {
    this.producto = producto;
  }

  public BigDecimal getTotal() {
    return total;
  }

  public void setTotal(BigDecimal total) {
    this.total = total;
  }
}
