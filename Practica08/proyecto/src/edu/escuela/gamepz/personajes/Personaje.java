package edu.escuela.gamepz.personajes;
public class Personaje{
		private String nombre;
		private int vida;
  
	    public Personaje(String nombre){
	    	if(vida > 0){
	    		this.vida = 0
	    	}
	    	if(vida < 99){
	    		this.vida = 99
	    	}
	    }

	    public Personaje(String nombre, int vida){

	    }

	    public boolean setVida(int vida){
	    	if(vida>0 && vida<120){
	    	this.vida = vida;
	    	return true;
	     	}
	    	return false;

	    	}

	public void setNombre(String nombre){
		if(nombre.length() > 5 && nombre.length() <25)
		this.nombre = nombre;
	}
	public int getVida(){
		return vida;
	}

	public String getNombre(){
		return nombre;
	}

	public void saludar(){
		System.out.println("Hola Alumno de POO "+nombre);
	}

	public String getDetalle(){
		return nombre + "\t" +vida;
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