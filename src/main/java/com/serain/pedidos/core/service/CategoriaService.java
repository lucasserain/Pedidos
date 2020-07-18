package com.serain.pedidos.core.service;

import com.serain.pedidos.core.model.Categoria;
import com.serain.pedidos.adapter.datastore.entity.CategoriaEntity;
import com.serain.pedidos.adapter.datastore.mapper.CategoriaMapper;
import com.serain.pedidos.adapter.datastore.repository.CategoriaRepository;
import com.serain.pedidos.core.service.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public Categoria find(Integer id){


        return CategoriaMapper.INSTANCE.categoriaEntityToCategoria(categoriaRepository.findById(id).orElseThrow(
                () -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName())
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

    public List<Categoria> findAll() {
        return CategoriaMapper.INSTANCE.categoriaEntityListToCategoriaList(categoriaRepository.findAll());
    }

    public Page<Categoria> findPage(Integer page, Integer linesPerPage, String orderBy, String direction){
        PageRequest pageRequest = PageRequest.of(page, linesPerPage, Sort.Direction.valueOf(direction), orderBy);
        Page<Categoria> jooj = categoriaRepository.findAll(pageRequest).map(CategoriaMapper.INSTANCE::categoriaEntityToCategoria);
        return jooj;
    }
}
