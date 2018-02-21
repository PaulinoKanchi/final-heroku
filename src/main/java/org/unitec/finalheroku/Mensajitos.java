/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unitec.finalheroku;

import java.time.LocalDate;
import java.time.LocalTime;
import org.springframework.data.annotation.Id;

/**
 *
 * @author T-107
 */
public class Mensajitos {
   @Id
   private String id;
    private String titulo;
    private String cuerpo;
    private LocalDate fecha;
    private LocalTime hora;
        
    public Mensajitos(String id) {
        this.id = id;
    }



    public Mensajitos() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    public Mensajitos(String titulo, String cuerpo) {
        this.titulo = titulo;
        this.cuerpo = cuerpo;
        fecha=LocalDate.now();
        hora=LocalTime.now();
    }

    public String getId() {
        return id;
    }

    public Mensajitos(String id, String titulo, String cuerpo) {
        this.id = id;
        this.titulo = titulo;
        this.cuerpo = cuerpo;
        fecha=LocalDate.now();
        hora=LocalTime.now();
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }
    
}
