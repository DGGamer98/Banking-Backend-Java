/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.systembankmanagment.DAO;

import com.mycompany.systembankmanagment.model.ContoCorrente;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author david
 */
public class ContoCorrenteImplementDAO implements ContoCorrenteDAO {

    private Map<Integer, ContoCorrente> databaseConti = new HashMap<>();

    //Operazioni CRUD per lavorare sulla persistenza dei conti
    @Override
    public void save(ContoCorrente c) {
        if (databaseConti.containsKey(c.getId())) {
            throw new RuntimeException("Il conto già esiste nel database");
        }
        databaseConti.put(c.getId(), c);
        System.out.println("conto creato con successo");
    }

    @Override
    public ContoCorrente findById(int id) {
        return databaseConti.get(id);
    }

    @Override
    public List<ContoCorrente> findAll() {
        return new ArrayList<>(databaseConti.values());
    }

    @Override
    public void update(ContoCorrente c) {
        if (!databaseConti.containsKey(c.getId())) {
            throw new RuntimeException("impossibile aggiornale il conto");
        }

        databaseConti.put(c.getId(), c);
        System.out.println("Conto Aggiornato con sucesso");
    }

    @Override
    public void delete(int id) {
        System.out.println("Entro nel metodo");
        databaseConti.remove(id);
        System.out.println("Conto eliminato con successo");
    }

}
