/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.systembankmanagment.service;

import com.mycompany.systembankmanagment.DAO.ContoCorrenteDAO;
import com.mycompany.systembankmanagment.DAO.ContoCorrenteImplementDAO;
import com.mycompany.systembankmanagment.DTO.ClienteDTO;
import com.mycompany.systembankmanagment.DTO.ContoCorrenteDTO;
import com.mycompany.systembankmanagment.Transformer.Transformer;
import com.mycompany.systembankmanagment.model.ContoCorrente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author david
 */

//ilù service si occuperà di gestire le regole di business del nostro software
public class ServiceForContoCorrente {
    
    private Transformer transformer = new Transformer();
    private ContoCorrenteDAO contoDAO = new ContoCorrenteImplementDAO();
    
    public void create(ContoCorrenteDTO contoDTO) {
        
        
        contoDAO.save(transformer.fromDtoToModel(contoDTO));
        
        System.out.println("Dati caricati nella persistenza correttamente");
    }
    
    public ContoCorrenteDTO findById(int id) {
        ContoCorrente contoModel = contoDAO.findById(id);
        
        if(contoModel == null) {
            throw new RuntimeException("Conto corrrente non trovato");
        }
        
        return transformer.fromModelToDto(contoModel);
    }
    
    
    public List<ContoCorrenteDTO> findAll() {
        List<ContoCorrente> contiModel = contoDAO.findAll();
        List<ContoCorrenteDTO> contiDTO = new ArrayList<>();
        
        for (ContoCorrente contoCorrenteModel : contiModel) {
            contiDTO.add(transformer.fromModelToDto(contoCorrenteModel));
        }
        
        System.out.println(contiDTO);
        return contiDTO;
    }
    
    public void update (ContoCorrenteDTO contoDTO) {
        ContoCorrente conto = transformer.fromDtoToModel(contoDTO);
        contoDAO.update(conto);
    }
    
    public void delete(int id) {
        contoDAO.delete(id);
    }

}
