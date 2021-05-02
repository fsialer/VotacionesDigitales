package org.codigorupestre.spacenative.votodigital.model;

import java.time.LocalDateTime;

public class Bitacora {

	private int id;
	private String operacion;
	private String usuario;
	private String fecha;
	private String ip;
	private String macAddress;
	
	@Override
	public String toString() {
		return "Bitacora [id=" + id + ", operacion=" + operacion + ", usuario=" + usuario + ", fecha=" + getFecha() + ", ip="
				+ ip + ", macAddress=" + macAddress + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getOperacion() {
		return operacion;
	}
	public void setOperacion(String operacion) {
		this.operacion = operacion;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getFecha() {
		return LocalDateTime.now().toString();
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getMacAddress() {
		return macAddress;
	}
	public void setMacAddress(String macAddress) {
		this.macAddress = macAddress;
	}
	
	
	
}
