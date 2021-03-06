package br.univille.alessandrodacs2021.controller;

import java.util.List;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.univille.alessandrodacs2021.model.Produto;
import br.univille.alessandrodacs2021.service.ProdutoService;
import br.univille.alessandrodacs2021.model.Categoria;
import br.univille.alessandrodacs2021.service.CategoriaService;

@Controller
@RequestMapping("/produto")
public class ProdutoController {
    

    @Autowired
    private ProdutoService service;
    @Autowired
    private CategoriaService categoriaService;
    @GetMapping
    public ModelAndView index(){
        
       
        List<Produto> listaProdutos = service.getAllProdutos();
        

        return new ModelAndView("produto/index","listaProdutos",listaProdutos);

    }
    @GetMapping("/novo")
    public ModelAndView novo(@ModelAttribute Produto produto ){
        HashMap<String,Object> dados = new HashMap<>();
        dados.put("produto",produto);        
        
        List<Categoria> listaCategorias = categoriaService.getAllCategorias();
        dados.put("listaCategorias",listaCategorias);
        return new ModelAndView("produto/form",dados); 

    }
    @PostMapping(params = "form")
    public ModelAndView save(Produto produto) {
        service.save(produto);
        return new ModelAndView("redirect:/produto");

    }
    @GetMapping(value = "/alterar/{id}")
    public ModelAndView alterar(@PathVariable("id") Produto produto){

        HashMap<String,Object> dados = new HashMap<>();
        dados.put("produto",produto);
        List<Categoria> listaCategorias = categoriaService.getAllCategorias();
        dados.put("listaCategorias",listaCategorias);

        return new ModelAndView("produto/form",dados);
    }
    @GetMapping(value="/delete/{id}")
    public ModelAndView delete(@PathVariable("id") Produto produto){
        service.delete(produto);
        return new ModelAndView("redirect:/produto");
    }
    
  
} 
