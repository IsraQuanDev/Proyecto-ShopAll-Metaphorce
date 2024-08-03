package com.shopall.shop.service;

import com.shopall.shop.entities.Compradores;
import com.shopall.shop.repository.CompradorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceComprador implements ServiceIntComprador {


    @Autowired
    CompradorRepository compradorRepository;

    @Override
    public  List<Compradores> obtenerCompradores() {
        return compradorRepository.findAll();
    }
}
