package edu.escuela.gamepz.personajes.buenos;
import edu.escuela.gamepz.personajes.buenos;
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
		super(nombre, 3);
		escudo = 'A';
	}
	
	//Metodos
	public String getDetalle(){
		return super.getDetalle()+ " " + escudo;
	}


	public char getEscudo(){
		return escudo;

	}
	
	public void decVida(){
		if (escudo == 'A'){
			super.decVida(2);
		}else{
			super.decVida();
		}

	}
	public void decVida(int d){
		if(escudo == 'A'){
			super.addVida(d/2);
		}else{
			super.decVida();
		}

	}
	public void addVida(){
		if(escudo =='A'){
			super.addVida(2);
		}else{
			super.decVida();
		}

	}
	public void addVida(int d){
		if(escudo == 'A'){
			super.addVida(d*2)
		}else{
			super.decVida();
		}

	}
}