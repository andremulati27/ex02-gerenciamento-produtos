package com.am.gerenciamento_produtos.Services;

import com.am.gerenciamento_produtos.Model.ProdutoModel;
import com.am.gerenciamento_produtos.Repository.ProdutoRepository;
import jakarta.persistence.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoServices {

    @Autowired
    private ProdutoRepository produtoRepository;

    public List<ProdutoModel> findAll(){return produtoRepository.findAll();}

    public ProdutoModel criarProduto(ProdutoModel produtoModel){return produtoRepository.save(produtoModel);}

    public Optional<ProdutoModel> buscarId(Long id){
        return produtoRepository.findById(id);
    }

    public ProdutoModel atualizar(Long id, ProdutoModel produtoModel){
        ProdutoModel model = produtoRepository.findById(id).get();
        model.setNome(produtoModel.getNome());

        return produtoRepository.save(model);
    }

    public void deletar(Long id){
        produtoRepository.deleteById(id);
    }
}
