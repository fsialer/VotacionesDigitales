package org.codigorupestre.spacenative.votodigital.dao.impl;

import java.util.logging.Logger;

import javax.sql.DataSource;

import org.codigorupestre.spacenative.votodigital.dao.BitacoraDAO;
import org.codigorupestre.spacenative.votodigital.model.Bitacora;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository
public class BitacoraDAOImpl implements BitacoraDAO{

	private final Logger LOG=Logger.getLogger(BitacoraDAOImpl.class.getName());
	
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	@Qualifier("bitacora")
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate=new JdbcTemplate(dataSource);
	}
	
	@Override
	public void registrarOperacion(Bitacora bitacora) {
		LOG.info("SE REGISTRA BITACORA DE FORMA EXITOSA.");
		String query="INSERT INTO bitacoraVotaciones (operacion,usuario,ip,macaddress,fecha) VALUES (?,?,?,?,?);";
		this.jdbcTemplate.update(query,new Object[] {bitacora.getOperacion(),bitacora.getUsuario(),bitacora.getIp(),bitacora.getMacAddress(),bitacora.getFecha()});
		LOG.info(bitacora.toString());
		

		
	}

}
