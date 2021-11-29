package br.univille.alessandrodacs2021.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.univille.alessandrodacs2021.model.Fornecedor;
import br.univille.alessandrodacs2021.repository.FornecedorRepository;
import br.univille.alessandrodacs2021.service.FornecedorService;

@Service
public class FornecedorServiceImpl implements FornecedorService{
    @Autowired
    private FornecedorRepository repository;
    @Override
    public List<Fornecedor> getAllFornecedor() {
        
        return repository.findAll();
    }
    @Override
    public Fornecedor save(Fornecedor fornecedor) {
        
        return repository.save(fornecedor);
    }
    @Override
    public void delete(Fornecedor fornecedor) {
        repository.delete(fornecedor);
        
    }
    
}
