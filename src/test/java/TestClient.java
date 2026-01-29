/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.systembankmanagment.DTO.ClienteDTO;
import com.mycompany.systembankmanagment.service.ServiceForCliente;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author david
 */
public class TestClient {
    
    ClienteDTO clienteDTO;
    ServiceForCliente service;
    
    @BeforeAll
    public static void setUpClass() {
        System.out.println("Stared");
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        clienteDTO = new ClienteDTO();
        service = new ServiceForCliente();
    }
    
    @AfterEach
    public void tearDown() {
        System.out.println("Stop");
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void CreateClien() {
        clienteDTO.setId(1);
        clienteDTO.setNome("Davide");
        clienteDTO.setCognome("Gatta");
        clienteDTO.setEta(23);
        
        service.createClient(clienteDTO);
        service.findAll();
       
        ClienteDTO risultato = service.findById(1);
        
        Assertions.assertNotNull(risultato);
        
        Assertions.assertEquals(risultato.getId(), clienteDTO.getId());
        Assertions.assertEquals(risultato.getNome(), clienteDTO.getNome());
        Assertions.assertEquals(risultato.getCognome(), clienteDTO.getCognome());
        Assertions.assertEquals(risultato.getEta(), clienteDTO.getEta());
        

        service.controlAge(clienteDTO);
  
    }
}
