package edu.escuela.gamepz.personajes.malos;
import edu.escuela.gamepz.personajes.*;
public class Zombie extends Personaje{
	private boolean ataque;

	public Zombie(String nombre, int vida, boolean ataque){
		super(nombre,vida);
		this.ataque = ataque;
	}
	public Zombie(String nombre, boolean ataque){
		super(nombre,3,ataque);
	}
	public Zombie(String nombre){
		super(nombre,3,false);
	}

	//Metodos
	public String getDetalle(){
		return super.getDetalle()+ " " + ataque;
	}

	public boolean getAtaque{
		return ataque;
	}

	public void decVida(){
		if(!ataque){
			super.decVida(3);
		}else{
			super.decVida(2);
		}
	}

	public void decVida(int d){
		if(!ataque){
			super.decVida(3*d);
		}else{
			super.decVida(2*d)
		}
	}

	public void addVida(){
		if(ataque){
			super.addVida(3);
		}
	}

	public void addVida(int add){
		if(ataque){
			super.addVida(3*add);
		}//llave if
	}//llave metodo
}//llave clase principal