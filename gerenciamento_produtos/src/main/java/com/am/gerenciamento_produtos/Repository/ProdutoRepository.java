package com.am.gerenciamento_produtos.Repository;

import com.am.gerenciamento_produtos.Model.ProdutoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface ProdutoRepository extends JpaRepository<ProdutoModel, Long > {
}
