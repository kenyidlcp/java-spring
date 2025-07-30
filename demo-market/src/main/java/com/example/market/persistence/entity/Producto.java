package com.example.market.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table(name = "productos")
@Getter
@Setter
public class Producto {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id_producto")
  private Long idProducto;

  @Column(name = "nombre")
  private String nombre;

  @Column(name = "id_categoria")
  private Integer idCategoria;

  @Column(name = "codigo_barras")
  private String codigoBarras;

  @Column(name = "precio_venta")
  private BigDecimal precioVenta;

  @Column(name = "cantidad_stock")
  private Integer cantidadStock;

  @Column(name = "estado")
  private Boolean estado;

  @ManyToOne
  @JoinColumn(name = "id_categoria", insertable = false, updatable = false)
  private Categoria categoria;
}
