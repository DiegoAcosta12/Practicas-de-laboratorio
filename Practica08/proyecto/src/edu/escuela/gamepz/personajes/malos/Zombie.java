package edu.escuela.gamepz.personajes.malos;
public class Zombie extends Personaje{
	private boolean ataque;

	public Zombie(String nombre, int vida, boolean ataque){
		super(nombre,vida);
		this.ataque = ataque;
	}
	public Zombie(String nombre, boolean ataque){
		super(nombre,3);
		this.ataque = ataque;
	}
	public Zombie(String nombre){
		super(nombre,3);
		this.ataque = false;

	}

	//Metodos
	public String getDetalle(){
		return super.getDetalle()+ " " + ataque;
	}

	public boolean getAtaque{
		return ataque;
	}

	public 
}