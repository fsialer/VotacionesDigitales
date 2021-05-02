package org.codigorupestre.spacenative.votodigital.dao.impl;

import java.util.logging.Logger;

import javax.sql.DataSource;

import org.codigorupestre.spacenative.votodigital.dao.VotoDAO;
import org.codigorupestre.spacenative.votodigital.model.Votos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository
public class VotoDAOImpl implements VotoDAO{

	private final Logger LOG=Logger.getLogger(VotoDAOImpl.class.getName());
	
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate=new JdbcTemplate(dataSource);
	}
	
	@Override
	public int realizarVoto(Votos voto) {
		LOG.info("SE REGISTRA VOTACION DE FORMA EXITOSA.");
		String query="INSERT INTO votos (cedula,numeroActa,numeroJuntaReceptora,partido,fecha) VALUES (?,?,?,?,?);";
		int confirmacion= this.jdbcTemplate.update(query,new Object[] {voto.getCedula(),voto.getNumeroActa(),voto.getNumeroJuntaReceptora(),voto.getPartido(),voto.getFecha()});
		LOG.info(voto.toString());
		return confirmacion;
	}

}
