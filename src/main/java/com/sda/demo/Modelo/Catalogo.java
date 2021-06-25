package com.sda.demo.Modelo;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "catalogo")
public class Catalogo {
	
	@Id	
	@Column(name = "id")
	private int id;
	
	private String nombre;
	private String NABREVIADO;
    private String DESCRIPCION;
    private String USUARIO;
    private String ID_DOMINIO;
    //private ArrayList<Catalogo_item> catalogoItem = new ArrayList<>();
    
      
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNABREVIADO() {
		return NABREVIADO;
	}
	public void setNABREVIADO(String nABREVIADO) {
		NABREVIADO = nABREVIADO;
	}
	public String getDESCRIPCION() {
		return DESCRIPCION;
	}
	public void setDESCRIPCION(String dESCRIPCION) {
		DESCRIPCION = dESCRIPCION;
	}
	public String getUSUARIO() {
		return USUARIO;
	}
	public void setUSUARIO(String uSUARIO) {
		USUARIO = uSUARIO;
	}
	public String getID_DOMINIO() {
		return ID_DOMINIO;
	}
	public void setID_DOMINIO(String iD_DOMINIO) {
		ID_DOMINIO = iD_DOMINIO;
	}
	@Override
	public String toString() {
		return "Catalogo [id=" + id + ", nombre=" + nombre + ", NABREVIADO=" + NABREVIADO + ", DESCRIPCION="
				+ DESCRIPCION + ", USUARIO=" + USUARIO + ", ID_DOMINIO=" + ID_DOMINIO + "]";
	}

	

	
	
	
	
    
}
