package com.shopall.shop.controller;

import com.shopall.shop.entities.Compradores;
import com.shopall.shop.service.ServiceIntComprador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/compradores")
public class CompradorController {

    @Autowired
    private ServiceIntComprador serviceIntComprador;

    @GetMapping("/Usuario")
    public List<Compradores> usuarioComprador() {

        return serviceIntComprador.obtenerCompradores();

    }
}
