package com.caio.produto_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.caio.produto_api.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{
    
}
