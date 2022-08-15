package com.johimesa.beans;

import com.johimesa.interfaces.IEquipo;

public class Jugador {
	
	private int number;
	private String name;
	private IEquipo team;
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public IEquipo getTeam() {
		return team;
	}
	public void setTeam(IEquipo team) {
		this.team = team;
	}
	
	@Override
	public String toString() {
		return "Jugador [number=" + number + ", name=" + name + ", team=" + team + "]";
	}
}
