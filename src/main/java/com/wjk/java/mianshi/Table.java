package com.wjk.java.mianshi;

public class Table {
	private String id;
	private String cola;
	private String colb;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCola() {
		return cola;
	}
	public void setCola(String cola) {
		this.cola = cola;
	}
	public String getColb() {
		return colb;
	}
	public void setColb(String colb) {
		this.colb = colb;
	}
	public Table(String id, String cola, String colb) {
		super();
		this.id = id;
		this.cola = cola;
		this.colb = colb;
	}

	
}
