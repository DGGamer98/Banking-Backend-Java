/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.systembankmanagment.DAO;

import com.mycompany.systembankmanagment.model.ContoCorrente;
import java.util.List;

/**
 *
 * @author david
 */
public interface ContoCorrenteDAO {
    void save(ContoCorrente c);
    ContoCorrente findById(int id);
    List<ContoCorrente> findAll();
    void update(ContoCorrente c);
    void delete(int id);
}
