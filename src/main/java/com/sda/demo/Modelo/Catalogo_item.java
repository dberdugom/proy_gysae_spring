package com.sda.demo.Modelo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "catalogo_item")
public class Catalogo_item {
	
	@Id
	private String ID;
    private String NOMBRE;
    private String DESCRIPCION;
    private String ESTADO;
    private String ORDEN;
   // @ManyToOne
   // @JoinColumn (name="id_catalogo")
    private Catalogo ID_CATALOGO;
   // private ArrayList<modelo.CatalogoItemRta> catalogoItemRta = new ArrayList<>();

}
