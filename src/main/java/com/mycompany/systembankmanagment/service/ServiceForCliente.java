/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.systembankmanagment.service;

import com.mycompany.systembankmanagment.DAO.ClienteDAO;
import com.mycompany.systembankmanagment.DAO.ClienteImplementDAO;
import com.mycompany.systembankmanagment.DTO.ClienteDTO;
import com.mycompany.systembankmanagment.Transformer.Transformer;
import com.mycompany.systembankmanagment.model.Cliente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author david
 */
public class ServiceForCliente {

    private Transformer transformer = new Transformer();
    private ClienteDAO clienteDAO = new ClienteImplementDAO();

    public void createClient(ClienteDTO c) {
        clienteDAO.save(transformer.fromDtoToModel(c));
    }

    //ClienteDTO --> usiamo questo perché il service non lavora nel pattern DAO 
    public ClienteDTO findById(int id) {
        Cliente clienteModel = clienteDAO.findById(id);

        if (clienteModel == null) {
            System.out.println("nessun utente trovato");
        }
        return transformer.fromModelToDto(clienteModel);
    }

    public List<ClienteDTO> findAll() {
        List<Cliente> clientDAO = clienteDAO.findAll();
        List<ClienteDTO> clientDTO = new ArrayList<>();

        for (Cliente client : clientDAO) {
            clientDTO.add(transformer.fromModelToDto(client));
        }
        System.out.println(clientDTO);
        return clientDTO;
    }
    
    public void update(ClienteDTO clientDTO) {   
        Cliente clientDAO =  transformer.fromDtoToModel(clientDTO);
        clienteDAO.update(clientDAO);
    }
    
    public void delete(int id) {
        clienteDAO.delete(id);
    }
    
    public ClienteDTO controlAge(ClienteDTO clientDTO) {
        int ageconsented = 18;
        if(clientDTO.getEta() >= ageconsented) {
            System.out.println("Control age ok!");
        } else {
            throw new RuntimeException("Control age failuer");
        }
        
        return clientDTO;
    }
}
