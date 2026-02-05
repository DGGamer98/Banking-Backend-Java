/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.systembankmanagment.DAO;

import com.mycompany.systembankmanagment.model.Movimento;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author david
 */
public class MovimentoImplementDAO implements MovimentoDAO{

    private Map<Integer,Movimento> databateMovimenti = new HashMap<>();
    
    @Override
    public void save(Movimento move) {
        databateMovimenti.put(move.getId(), move);
    }

    @Override
    public Movimento findById(int id) {
        return databateMovimenti.get(id);
    }

    @Override
    public List<Movimento> findAll() {
        return new ArrayList<>(databateMovimenti.values());
    }
    
    //TODO Davide finire di implementare la logica di persistenza
    @Override
    public void update(Movimento move) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
