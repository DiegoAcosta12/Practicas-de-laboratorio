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

	public void decVida(){
		if(ataque == ){
			super.decVida(3);
		}else{
			super.decVida(2);
		}
	}

	public void decVida(int d){
		if(ataque == ){
			super.decVida(d*3);
		}else if(ataque ==){
			super.decVida(d*2)
		}
	}

	public void addVida(){
		if(ataque == ){
			super.addVida(0);
		}else if(ataque == ){
			super.addVida(0);
		}
	}

	public void addVida(int vida){
		if(ataque == ){
			super.addVida(vida *3);
		}else if(ataque ==){
			super.addVida(0);
		}//llave if
	}//llave metodo
}//llave clase principal