package org.codigorupestre.spacenative.votodigital.datasource;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class DataSourceMariaDB {
	@Value("${datasource.driverclassname}")
	private String driverClassName;
	
	@Value("${datasource.url}")
	private String url;
	
	@Value("${datasource.username}")
	private String userName;
	
	@Value("${datasource.password}")
	private String password;
	
	
	@Value("${datasource.basedatos.votos}")
	private String baseDatosVotos;
	
	@Value("${datasource.basedatos.bitacora}")
	private String baseDatosBitacora;
	
	@Bean
	@Primary
	public BasicDataSource dataSourceVotoDigital() {
		return getConnection(baseDatosVotos);
	}
	
	@Bean(name="bitacora")
	public BasicDataSource dataSourceBitacora() {
		return getConnection(baseDatosBitacora);
	}
	
	
	private BasicDataSource getConnection(String dataBase) {
		BasicDataSource dataSource=new BasicDataSource();
		dataSource.setDriverClassName(driverClassName);
		dataSource.setUrl(url+dataBase);
		dataSource.setUsername(userName);
		dataSource.setPassword(password);
		return dataSource;
	}
}
