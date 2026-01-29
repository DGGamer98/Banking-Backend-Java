/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.systembankmanagment.DAO;

import com.mycompany.systembankmanagment.model.Cliente;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author david
 */
public class ClienteImplementDAO implements ClienteDAO {
    
    //Logica di "persistenza"
    private Map<Integer, Cliente> databaseClienti = new HashMap<>();

    //Operazioni CRUD per lavorare sulla persistenza dei clienti
    @Override
    public void save(Cliente c) {
        if(databaseClienti.containsKey(c.getId())) {
            throw new RuntimeException("L'utente è già registrato"); 
        }
        
        databaseClienti.put(c.getId(), c);
        System.out.println("Cliente aggiunto con successo");
        
    }
    
    @Override
    public Cliente findById(int id) {
        return databaseClienti.get(id);
    }

    @Override
    public List<Cliente> findAll() {
        return new ArrayList<>(databaseClienti.values());
    }

    @Override
    public void update(Cliente c) {
        if(!databaseClienti.containsKey(c.getId())) {
            throw new RuntimeException("impossibile aggiornale il databse");
        }
        databaseClienti.put(c.getId(), c);
        System.out.println("Cliente aggiornato con sucesso");
    }

    @Override
    public void delete(int id) {
        databaseClienti.remove(id);
    }  
}
