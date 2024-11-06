package com.caio.produto_api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.caio.produto_api.model.Produto;
import com.caio.produto_api.repository.ProdutoRepository;

@Service
public class ProdutoService {

    @Autowired //Spring injeta automaticamente as dependencias. Não preciso criar uma instância manualmente
    private ProdutoRepository repository;

    public List<Produto> listarTodos(){
        return repository.findAll();
    }

    public Produto salvar(Produto produto){
        return repository.save(produto);
    }

    public Produto buscar(Long id){
        return repository.findById(id).orElse(null);
    }

    public void deletar(Long id){
        repository.deleteById(id);
    }
}
