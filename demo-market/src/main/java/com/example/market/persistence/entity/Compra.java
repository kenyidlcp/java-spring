package com.example.market.persistence.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "compras")
@Getter
@Setter
@Data
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

  @OneToMany(mappedBy = "compra", cascade = {CascadeType.ALL})
  private List<ComprasProducto> productos;

  public Cliente getCliente() {
    return cliente;
  }

  public void setCliente(Cliente cliente) {
    this.cliente = cliente;
  }

  public String getComentario() {
    return comentario;
  }

  public void setComentario(String comentario) {
    this.comentario = comentario;
  }

  public String getEstado() {
    return estado;
  }

  public void setEstado(String estado) {
    this.estado = estado;
  }

  public LocalDateTime getFecha() {
    return fecha;
  }

  public void setFecha(LocalDateTime fecha) {
    this.fecha = fecha;
  }

  public String getIdCliente() {
    return idCliente;
  }

  public void setIdCliente(String idCliente) {
    this.idCliente = idCliente;
  }

  public Long getIdCompra() {
    return idCompra;
  }

  public void setIdCompra(Long idCompra) {
    this.idCompra = idCompra;
  }

  public String getMedioPago() {
    return medioPago;
  }

  public void setMedioPago(String medioPago) {
    this.medioPago = medioPago;
  }

  public List<ComprasProducto> getProductos() {
    return productos;
  }

  public void setProductos(List<ComprasProducto> productos) {
    this.productos = productos;
  }
}
