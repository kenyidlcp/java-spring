package com.example.market.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "compras")
@Getter
@Setter
public class Compra {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id_compra")
  private Long idCompra;

  @Column(name = "id_cliente")
  private String idCliente;

  @Column(name = "fecha")
  private LocalDateTime fecha;

  @Column(name = "medio_pago")
  private String medioPago;

  @Column(name = "comentario")
  private String comentario;

  @Column(name = "estado")
  private String estado;

  @ManyToOne
  @JoinColumn(name = "id_cliente", insertable = false, updatable = false)
  private Cliente cliente;
}
