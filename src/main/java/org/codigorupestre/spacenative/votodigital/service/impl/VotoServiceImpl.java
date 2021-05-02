package org.codigorupestre.spacenative.votodigital.service.impl;

import org.codigorupestre.spacenative.votodigital.dao.BitacoraDAO;
import org.codigorupestre.spacenative.votodigital.dao.VotoDAO;
import org.codigorupestre.spacenative.votodigital.model.Bitacora;
import org.codigorupestre.spacenative.votodigital.model.Votos;
import org.codigorupestre.spacenative.votodigital.service.VotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VotoServiceImpl implements VotoService{

	@Autowired
	private VotoDAO votoDAO;
	
	@Autowired
	private BitacoraDAO bitacoraDAO;
	
	@Override
	public int realizarVoto(Votos voto) {
		int resultado=votoDAO.realizarVoto(voto);
		
		Bitacora bitacora=new Bitacora();
		
		bitacora.setOperacion("se realizo el voto");
		bitacora.setUsuario("nombre del usuario");
		bitacora.setIp("xxx.xxx.xxx.xxxx");
		bitacora.setMacAddress("0000:xxxx:aaaa:00aa:zzaa");
		
		bitacoraDAO.registrarOperacion(bitacora);
		return resultado;
		
		
	}

}
