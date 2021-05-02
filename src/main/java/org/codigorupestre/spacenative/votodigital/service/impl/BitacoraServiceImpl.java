package org.codigorupestre.spacenative.votodigital.service.impl;

import org.codigorupestre.spacenative.votodigital.dao.BitacoraDAO;
import org.codigorupestre.spacenative.votodigital.model.Bitacora;
import org.codigorupestre.spacenative.votodigital.service.BitacoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class BitacoraServiceImpl implements BitacoraService {
	
	@Autowired
	private BitacoraDAO bitacoraDAO;
	
	@Override
	public void registrarOperacion(Bitacora bitacora) {
		bitacoraDAO.registrarOperacion(bitacora);
		
	}

}
