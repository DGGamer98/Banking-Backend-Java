/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.systembankmanagment.Transformer;

import com.mycompany.systembankmanagment.DTO.ClienteDTO;
import com.mycompany.systembankmanagment.DTO.ContoCorrenteDTO;
import com.mycompany.systembankmanagment.model.Cliente;
import com.mycompany.systembankmanagment.model.ContoCorrente;
import java.util.logging.Logger;

/**
 *
 * @author david
 */
public class Transformer {

    private static final Logger LOGGER = Logger.getLogger(Transformer.class.getName());

    //Conversione da DTO in Model
    public Cliente fromDtoToModel(ClienteDTO c) {
        Cliente cliente = new Cliente();

        cliente.setId(c.getId());
        cliente.setNome(c.getNome());
        cliente.setCognome(c.getCognome());
        cliente.setEta(c.getEta());

        LOGGER.info("Conversione in Model avvenuta con successo");
        return cliente;
    }
    
    //Conversione da Model in DTO
    public ClienteDTO fromModelToDto(Cliente cDAO) {
        ClienteDTO clienteDto = new ClienteDTO();
        
        clienteDto.setId(cDAO.getId());
        clienteDto.setNome(cDAO.getNome());
        clienteDto.setCognome(cDAO.getCognome());
        clienteDto.setEta(cDAO.getEta());
        
        LOGGER.info("Conversione in DTO avvenuta con successo");
        return clienteDto;
    }
    
    //Metodi per i conti
    
    public ContoCorrente fromDtoToModel(ContoCorrenteDTO contoConto) {
        ContoCorrente conto = new ContoCorrente();
        
        
        conto.setIntestatario(contoConto.getIntestatario());
        conto.setAttivo(contoConto.isAttivo());
        
        
        return conto;
    }
    
    
    public ContoCorrenteDTO fromModelToDto(ContoCorrente c) {
        ContoCorrenteDTO contoDTO = new ContoCorrenteDTO();
        
        contoDTO.setIntestatario(c.getIntestatario());
        contoDTO.setAttivo(c.isAttivo());
        
        return contoDTO;
    }
    
}
