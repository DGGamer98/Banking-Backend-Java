/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.systembankmanagment.Transformer;

import com.mycompany.systembankmanagment.DTO.ContoCorrenteDTO;
import com.mycompany.systembankmanagment.model.ContoCorrente;
import java.util.logging.Logger;

/**
 *
 * @author david
 */
public class TransformerConti {

    private static final Logger LOGGER = Logger.getLogger(TransformerConti.class.getName());
    
    public ContoCorrente fromDtoToModel(ContoCorrenteDTO contoDTO) {
        ContoCorrente conto = new ContoCorrente();
        
        conto.setIntestatario(contoDTO.getIntestatario());
        conto.setAttivo(contoDTO.isAttivo());
        
        LOGGER.info("Conversione in model avvenuta con successo");
        
        return conto;
        
    }
    
    public ContoCorrenteDTO fromModelToDTO(ContoCorrente c) {
        ContoCorrenteDTO contoDTO = new ContoCorrenteDTO();
        
        contoDTO.setIntestatario(c.getIntestatario());
        contoDTO.setAttivo(c.isAttivo());
        
        LOGGER.info("Conversione in DTO avvenuta con successo");
        
        return contoDTO;
    }
    
    

}
