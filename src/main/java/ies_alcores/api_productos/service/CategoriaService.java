package ies_alcores.api_productos.service;

import ies_alcores.api_productos.model.Categoria;
import ies_alcores.api_productos.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public List<Categoria> findAll(){
        return this.categoriaRepository.findAll();
    }

    public Categoria findById(final Long id){
        return this.categoriaRepository.findById(id).get();
    }
}
