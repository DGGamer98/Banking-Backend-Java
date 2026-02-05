/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.systembankmanagment.DAO.ContoCorrenteDAO;
import com.mycompany.systembankmanagment.DAO.ContoCorrenteImplementDAO;
import com.mycompany.systembankmanagment.DTO.ContoCorrenteDTO;
import com.mycompany.systembankmanagment.Transformer.Transformer;
import com.mycompany.systembankmanagment.model.ContoCorrente;
import com.mycompany.systembankmanagment.service.ServiceForContoCorrente;
import java.util.List;
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
public class TestContiCorrenti {

    ContoCorrenteDTO contoDTO;
    ServiceForContoCorrente service;

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
        contoDTO = new ContoCorrenteDTO();
        service = new ServiceForContoCorrente();
    }

    @AfterEach
    public void tearDown() {
    }

    @Test
    public void createConto() {
        contoDTO.setAttivo(true);
        contoDTO.setIntestatario("Davide");

        service.create(contoDTO);

        ContoCorrenteDTO risultato = service.findById(1);

        //Controllo se non è null oppure se il risulato della ricerca si aspetta qualcos'altro
        Assertions.assertNotNull(risultato);
        Assertions.assertEquals(risultato.getIntestatario(), contoDTO.getIntestatario());
        Assertions.assertEquals(risultato.isAttivo(), contoDTO.isAttivo());

    }

    @Test
    public void findId() {
        contoDTO.setAttivo(true);
        contoDTO.setIntestatario("Davide");

        service.create(contoDTO);

        ContoCorrenteDTO risultato = service.findById(1);

        System.out.println(risultato);
    }

    @Test
    public void findAll() {
        contoDTO.setAttivo(true);
        contoDTO.setIntestatario("Davide");

        service.create(contoDTO);
        //Prendo i valori dal service e li racchiudo dentro alla mia variabile di tipo lista "resultAll"
        List<ContoCorrenteDTO> resultAll = service.findAll();

        for (ContoCorrenteDTO contoCorrenteDTO : resultAll) {
            System.out.println(contoCorrenteDTO);
        }
    }

    //I Test a basso livello "Non si dovrebbe fare" ma è solo per vedere se l'update funziona
    //Qui si lavora solo a livello di business e DTO
    @Test
    public void updateBassoLivelloDAO() {
        ContoCorrente conto1 = new ContoCorrente();
        ContoCorrente conto2 = new ContoCorrente();
        ContoCorrenteDAO imp = new ContoCorrenteImplementDAO();

        conto1.setId(1);
        conto1.setIntestatario("Luca");
        conto1.setSaldo(125);
        conto1.setAttivo(true);

        conto2.setId(1);
        conto2.setIntestatario("Davide");
        conto2.setSaldo(130);
        conto2.setAttivo(false);

        imp.save(conto1);

        imp.update(conto2);

    }

    @Test
    public void delete() {
        Transformer transormer = new Transformer();
        ContoCorrente conto1 = new ContoCorrente();
        ContoCorrente conto2 = new ContoCorrente();
        ContoCorrenteDAO imp = new ContoCorrenteImplementDAO();

        conto1.setId(1);
        conto1.setIntestatario("Luca");
        conto1.setSaldo(125);
        conto1.setAttivo(true);

        conto2.setId(2);
        conto2.setIntestatario("Davide");
        conto2.setSaldo(130);
        conto2.setAttivo(false);

        imp.save(conto1);
        imp.delete(1);
        
        imp.findAll();

        /*
        //Ulteriore controllo per vedere se il transformer funziona e se i dati sensibili vengono nascosti
        ContoCorrenteDTO contoDTO1 = transormer.fromModelToDto(conto1);
        ContoCorrenteDTO contoDTO2 = transormer.fromModelToDto(conto2);
        
        service.create(contoDTO1);
        service.findAll();
         */
    }

}
