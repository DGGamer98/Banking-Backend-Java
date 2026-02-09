/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.systembankmanagment.DAO;

import com.mycompany.systembankmanagment.model.Movimento;
import java.util.List;

/**
 *
 * @author david
 */
public interface MovimentoDAO {
    void save(Movimento move);
    Movimento findById(int id);
    List<Movimento> findAll();
    void delete(int id);
      
}
