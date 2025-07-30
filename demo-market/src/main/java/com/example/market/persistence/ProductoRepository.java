package com.example.market.persistence;

import com.example.market.persistence.crud.ProductoCrudRepository;
import com.example.market.persistence.entity.Producto;

import java.util.List;
import java.util.Optional;

public class ProductoRepository {

  private ProductoCrudRepository productoCrudRepository;

  public List<Producto> getAll() {
    return (List<Producto>) productoCrudRepository.findAll();
  }

  public List<Producto> getByCategoria(Integer idCategoria) {
    return productoCrudRepository.findByIdCategoriaOrderByNombreAsc(idCategoria);
  }

  public Optional<List<Producto>> getEscasos(Integer cantidadStock) {
    return productoCrudRepository.findByCantidadStockLessThanAndEstado(cantidadStock, true);
  }
}
