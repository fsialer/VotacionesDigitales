package org.codigorupestre.spacenative.votodigital.main;

import org.codigorupestre.spacenative.votodigital.config.AppConfig;
import org.codigorupestre.spacenative.votodigital.model.Votos;
import org.codigorupestre.spacenative.votodigital.service.VotoService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class VotoDigitalMain {

	public static void main(String[] args) {
		ApplicationContext appContext=new AnnotationConfigApplicationContext(AppConfig.class);
		
		VotoService votoService=appContext.getBean(VotoService.class);
		
		Votos voto=new Votos();
		voto.setCedula("46821894");
		voto.setNumeroActa("3213");
		voto.setNumeroJuntaReceptora("417558");
		voto.setPartido("PARTIDO NACIONAL");
		
		votoService.realizarVoto(voto);
		
	}
}
