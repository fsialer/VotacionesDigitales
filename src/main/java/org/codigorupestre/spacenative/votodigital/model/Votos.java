package org.codigorupestre.spacenative.votodigital.model;

import java.time.LocalDateTime;

public class Votos {
	private int id;
	private String cedula;
	private String numeroActa;
	private String numeroJuntaReceptora;
	private String partido;
	private String fecha;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getNumeroActa() {
		return numeroActa;
	}
	public void setNumeroActa(String numeroActa) {
		this.numeroActa = numeroActa;
	}
	public String getNumeroJuntaReceptora() {
		return numeroJuntaReceptora;
	}
	public void setNumeroJuntaReceptora(String numeroJuntaReceptora) {
		this.numeroJuntaReceptora = numeroJuntaReceptora;
	}
	public String getPartido() {
		return partido;
	}
	public void setPartido(String partido) {
		this.partido = partido;
	}
	public String getFecha() {
		return LocalDateTime.now().toString();
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	@Override
	public String toString() {
		return "Votos [id=" + id + ", cedula=" + cedula + ", numeroActa=" + numeroActa + ", numeroJuntaReceptora="
				+ numeroJuntaReceptora + ", partido=" + partido + ", fecha=" + getFecha() + "]";
	}
}
