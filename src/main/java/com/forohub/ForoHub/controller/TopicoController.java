package com.forohub.ForoHub.controller;

import com.forohub.ForoHub.domain.DatosListadoTopicos;
import com.forohub.ForoHub.domain.DatosRegistroTopico;
import com.forohub.ForoHub.domain.Topico;
import com.forohub.ForoHub.domain.TopicoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/topicos")
public class TopicoController {

    @Autowired
    private TopicoRepository topicoRepository;

    @PostMapping
    public void registrarTopico(@RequestBody @Valid DatosRegistroTopico datosRegistroTopico) {
        topicoRepository.save(new Topico(datosRegistroTopico));
    }

    @GetMapping
    public List<DatosListadoTopicos> listadoTopicos(){
        return topicoRepository.findAll().stream().map(DatosListadoTopicos::new).toList();

    }
}
