package com.serain.pedidos.services;

import com.serain.pedidos.domain.Categoria;
import com.serain.pedidos.entity.CategoriaEntity;
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
        //TODO AO ATULIZAR CRIA UM NOVO
        CategoriaEntity categoriaEntity  = CategoriaMapper.INSTANCE.categoriaToCategoriaEntity(find(id));
        CategoriaMapper.INSTANCE.updateCategoriaFromEntity(categoria, categoriaEntity);
        categoriaRepository.save(categoriaEntity);
    }
}
