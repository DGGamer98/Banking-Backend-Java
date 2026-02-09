/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.systembankmanagment.Transformer;

import com.mycompany.systembankmanagment.DTO.MovimentoDTO;
import com.mycompany.systembankmanagment.model.Movimento;

/**
 *
 * @author david
 */
public class TransformerMovimento {

    public Movimento fromDtoToModel(MovimentoDTO move) {
        Movimento moveDAO = new Movimento();

        move.setId(moveDAO.getId());
        move.setTipo(moveDAO.getTipo());
        move.setImporto(moveDAO.getImporto());
        move.setData(moveDAO.getData());

        return moveDAO;
    }

    public MovimentoDTO fromModelToDto(Movimento moveDao) {
        MovimentoDTO moveDTO = new MovimentoDTO();

        moveDao.setId(moveDTO.getId());
        moveDao.setTipo(moveDTO.getTipo());
        moveDao.setImporto(moveDao.getImporto());
        moveDao.setData(moveDao.getData());

        return moveDTO;
    }
}
