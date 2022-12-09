package com.example.javacrud.controller;

import com.example.javacrud.interfaceservice.IProductoService;
import com.example.javacrud.modelo.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping
public class ProductController {
    @Autowired
    private IProductoService service;

    @GetMapping("/producto")
    public String listarProductos(Model model){
        List<Producto> productos=service.listar();
        model.addAttribute("productos", productos);
        return "listarProducto";
    }

    @GetMapping("/catalogo")
    public String catalogo(Model model){
        List<Producto> productos=service.listar();
        model.addAttribute("productos", productos);
        return "catalogo";
    }

    @GetMapping("/producto/new")
    public String crearProducto(Model model){
        model.addAttribute("producto", new Producto());
        return "crearProducto";
    }
    @PostMapping("/producto/save")
    public String save(Producto p, Model model){
        service.save(p);
        return "redirect:/producto";
    }

    @GetMapping("/producto/edit/{id}")
    public String editarProducto(@PathVariable int id, Model model){
        Optional<Producto>producto=service.listarId(id);
        model.addAttribute("producto", producto);
        return "crearProducto";
    }

    @GetMapping("/producto/delete/{id}")
    public String deleteProduct(Model model, @PathVariable int id){
        service.delete(id);
        return "redirect:/producto";
    }
}
