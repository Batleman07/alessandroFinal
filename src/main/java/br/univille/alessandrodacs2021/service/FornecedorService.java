package br.univille.alessandrodacs2021.service;
import java.util.List;
import org.springframework.stereotype.Service;
import br.univille.alessandrodacs2021.model.Fornecedor;

@Service
public interface FornecedorService {
    public List<Fornecedor> getAllFornecedor();    
    public Fornecedor save(Fornecedor fornecedor);
    public void delete(Fornecedor fornecedor);
}
