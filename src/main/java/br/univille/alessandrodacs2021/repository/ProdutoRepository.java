package br.univille.alessandrodacs2021.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import br.univille.alessandrodacs2021.model.Produto;

public interface ProdutoRepository extends JpaRepository < Produto, Long>{
    
    
}
 