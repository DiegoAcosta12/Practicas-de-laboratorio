package edu.escuela.gamepz.utils;
import edu.escuela.gamepz.personajes.Personaje;
import edu.escuela.gamepz.utils.Muerto;
public enum Escudo{
	SUPER(0),
	MEDIO(1),
	BAJO(2),
	NULO(3);
	private int nivel;

	private Escudo(int nivel){
		this.nivel = nivel;
	}

	public int getNivel(){
		return nivel;
	}
}