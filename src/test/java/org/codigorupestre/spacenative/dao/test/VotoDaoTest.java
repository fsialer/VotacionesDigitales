package org.codigorupestre.spacenative.dao.test;

import static org.junit.jupiter.api.Assertions.*;

import org.codigorupestre.spacenative.votodigital.config.AppConfig;
import org.codigorupestre.spacenative.votodigital.dao.VotoDAO;
import org.codigorupestre.spacenative.votodigital.model.Votos;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes= {AppConfig.class})
class VotoDaoTest {

	@Autowired
	private VotoDAO votoDAO;
	
	@Test
	public void testDaoNotNull() {
		assertNotNull(votoDAO);
	}
	
	@Test
	public void testDaoInsert() {
		Votos voto=new Votos();
		voto.setCedula("46987744");
		voto.setNumeroActa("355644");
		voto.setNumeroJuntaReceptora("4588");
		voto.setPartido("Partido tests2");
		int resultado=votoDAO.realizarVoto(voto);
		assertTrue(resultado>0);
	}

}
