/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.systembankmanagment.model;

import java.time.LocalDateTime;

/**
 *
 * @author david
 */
public class Movimento {

    private int id;
    private double importo;
    private String tipo; // DEPOSITO / PRELIEVO
    private LocalDateTime data;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getImporto() {
        return importo;
    }

    public void setImporto(double importo) {
        this.importo = importo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Movimento{" + "id=" + id + ", importo=" + importo + ", tipo=" + tipo + ", data=" + data + '}';
    }
    
    
}

