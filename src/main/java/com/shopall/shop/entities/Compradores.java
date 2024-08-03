package com.shopall.shop.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "compradores")
public class Compradores {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idusuario")
    private Long idusuario;

    @Column(name = "nombreusuario")
    private String nombreusuario;

    @Column(name = "correousuario")
    private String correousuario;

    @Column(name = "direccionusuario")
    private String direccionusuario;


    // No-argument constructor
    public Compradores() {
    }

    public Compradores(Long idusuario, String nombreusuario, String correousuario, String direccionusuario) {
        this.idusuario = idusuario;
        this.nombreusuario = nombreusuario;
        this.correousuario = correousuario;
        this.direccionusuario = direccionusuario;
    }


    @Override
    public String toString() {
        return "Compradores{" +
                "id=" + idusuario +
                ", nombreusuario='" + nombreusuario + '\'' +
                ", correousuario='" + correousuario + '\'' +
                ", direccionusuario='" + direccionusuario + '\'' +
                '}';
    }

    public Long getId() {
        return idusuario;
    }

    public void setId(Long id) {
        this.idusuario = id;
    }

    public String getNombreusuario() {
        return nombreusuario;
    }

    public void setNombreusuario(String nombreusuario) {
        this.nombreusuario = nombreusuario;
    }

    public String getCorreousuario() {
        return correousuario;
    }

    public void setCorreousuario(String correousuario) {
        this.correousuario = correousuario;
    }

    public String getDireccionusuario() {
        return direccionusuario;
    }

    public void setDireccionusuario(String direccionusuario) {
        this.direccionusuario = direccionusuario;
    }
}
