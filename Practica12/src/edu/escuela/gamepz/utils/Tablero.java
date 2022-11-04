package edu.escuela.gamepz.utils;
import edu.escuela.gamepz.utils.PersException;
public class Tablero{
	public static int MAX_SIZE = 10;
	Personaje[] personajes = new Personaje[MAX_SIZE];
	private Tablero(int MAX_SIZE){
		this.MAX_SIZE = MAX_SIZE;
	} 

}