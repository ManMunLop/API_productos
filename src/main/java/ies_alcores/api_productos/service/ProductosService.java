package ies_alcores.api_productos.service;

import ies_alcores.api_productos.model.Producto;
import ies_alcores.api_productos.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductosService {

    //Pruebas
    @Autowired
    private ProductoRepository productoRepository;

    public List<Producto> findAll(){
        return this.productoRepository.findAll();
    }

    public List<Producto> findByCategoria(final String categoria){
        List<Producto> result = new ArrayList<>();
        List<Producto> totales = this.findAll();

        for (Producto p : totales){
            if(p.getCategoria().getNombre().equals(categoria)){
                result.add(p);
            }
        }

        return result;
    }
}