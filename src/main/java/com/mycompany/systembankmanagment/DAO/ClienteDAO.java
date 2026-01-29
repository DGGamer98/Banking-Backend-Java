/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.systembankmanagment.DAO;

import com.mycompany.systembankmanagment.model.Cliente;
import java.util.List;

/**
 *
 * @author david
 */
/*
void save
clienteDao findById
List findAll
void update
void delete
*/
public interface ClienteDAO {
    void save(Cliente c);
    Cliente findById(int id);
    List<Cliente> findAll();
    void update(Cliente c);
    void delete(int id);
}
