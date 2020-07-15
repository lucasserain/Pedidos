package com.serain.pedidos.services;

import com.serain.pedidos.core.model.Categoria;
import com.serain.pedidos.adapter.datastore.entity.CategoriaEntity;
import com.serain.pedidos.mapper.CategoriaMapper;
import com.serain.pedidos.repository.CategoriaRepository;

import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public Categoria find(Integer id){

        return CategoriaMapper.INSTANCE.categoriaEntityToCategoria(categoriaRepository.findById(id).orElseThrow(
                () -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName(),"")
        ));
    }

    public void create(Categoria categoria) {
        categoria.setId(null);

        categoriaRepository.save(CategoriaMapper.INSTANCE.categoriaToCategoriaEntity(categoria));
    }

    public void update(Integer id, Categoria categoria) {
        CategoriaEntity categoriaEntity  = CategoriaMapper.INSTANCE.categoriaToCategoriaEntity(find(id));
        CategoriaMapper.INSTANCE.updateCategoriaFromEntity(categoria, categoriaEntity);
        categoriaRepository.save(categoriaEntity);
    }

    public void delete(Integer id) {
        categoriaRepository.delete(CategoriaMapper.INSTANCE.categoriaToCategoriaEntity(find(id)));
    }
}
