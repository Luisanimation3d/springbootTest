package com.example.javacrud.interfaces;

import com.example.javacrud.modelo.Producto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProducto extends CrudRepository<Producto, Integer> {

}
