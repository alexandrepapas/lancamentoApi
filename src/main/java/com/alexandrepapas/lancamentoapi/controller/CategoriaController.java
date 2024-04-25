package com.alexandrepapas.lancamentoapi.controller;

import com.alexandrepapas.lancamentoapi.model.Categoria;
import com.alexandrepapas.lancamentoapi.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.servlet.http.HttpServletResponse;
import java.net.URI;
import java.util.List;
import javax.validation.Valid;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {



    @Autowired
    public CategoriaRepository categoriaRepository;

    @GetMapping
    public List<Categoria> listar() {
        return categoriaRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Categoria> criarCategoria( @RequestBody Categoria categoria, HttpServletResponse response) {
        if(categoria.getNome() == null) {
            throw new IllegalArgumentException("Nome da categoria não pode ser nulo");
        }
        Categoria categoriaSalva = categoriaRepository.save(categoria);

        URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{codigo}")
                .buildAndExpand(categoriaSalva.getCodigo()).toUri();
        response.setHeader("Location", uri.toASCIIString());
        return ResponseEntity.created(uri).body(categoriaSalva);

    }

    @GetMapping("/{codigo}")
    public ResponseEntity<Categoria> buscarPeloCodigo(@PathVariable Long codigo) {
        Categoria buscarCategoria = categoriaRepository.findById(codigo).orElse(null);
        if(buscarCategoria != null) {
            return ResponseEntity.ok(buscarCategoria);
        }else{
            return ResponseEntity.notFound().build();
        }
    }



}