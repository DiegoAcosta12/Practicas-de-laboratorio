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
		}else{
			super.addVida(0);
		}
	}

	public void addVida(int vida){
		if(ataque == true){
			super.addVida(vida *3);
		}else if(ataque == false){
			super.addVida(0);
		}//llave if
	}//llave metodo
}//llave clase principal