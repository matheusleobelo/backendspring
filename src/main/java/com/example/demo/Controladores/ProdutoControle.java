package com.example.demo.Controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Modelos.Produto;
import com.example.demo.Repositorio.RepositorioProduto;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="/controladorbasico")
public class ProdutoControle {
	
	@Autowired
	RepositorioProduto repositorioProduto;
	
	@GetMapping("/produtos")
	public List<Produto> listaProdutos(){
		return (List<Produto>) repositorioProduto.findAll();	

	}
}


