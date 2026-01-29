/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.systembankmanagment.DTO;

/**
 *
 * @author david
 */
public class ContoCorrenteDTO {

    private String intestatario;
    private boolean attivo;

    public String getIntestatario() {
        return intestatario;
    }

    public void setIntestatario(String intestatario) {
        this.intestatario = intestatario;
    }

    public boolean isAttivo() {
        return attivo;
    }

    public void setAttivo(boolean attivo) {
        this.attivo = attivo;
    }

    @Override
    public String toString() {
        return "ContoCorrenteDTO{" + "intestatario=" + intestatario + ", attivo=" + attivo + '}';
    }
    
    
}
