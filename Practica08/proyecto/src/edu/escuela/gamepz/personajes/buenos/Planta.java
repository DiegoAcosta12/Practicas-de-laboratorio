package edu.escuela.gamepz.personajes.buenos;
public class Planta extends Personaje{
	private char escudo;

	public Planta(String nombre, int vida, char escudo){
		super(nombre,vida);
		this.escudo = escudo;
	}
	public Planta(String nombre, char escudo){
		super(nombre, 3);
		this.escudo = escudo;
	}
	public Planta(String nombre, int vida){
		super(nombre,vida);
		escudo = 'A';

	}
	public Planta(String nombre){

	}


	public char getEscudo(){
		return escudo;

	}
	
	public void decVida(){

	}
	public void decVida(int d){

	}
	public void addVida(){

	}
	public void addVida(int d){

	}
}