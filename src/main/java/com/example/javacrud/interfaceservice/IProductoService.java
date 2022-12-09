package com.example.javacrud.interfaceservice;

import com.example.javacrud.interfaces.IProducto;
import com.example.javacrud.modelo.Producto;

import java.util.List;
import java.util.Optional;

public interface IProductoService {
    public List<Producto>listar();
    public Optional<Producto>listarId(int id);
    public int save(Producto p);
    public void delete(int id);
}
