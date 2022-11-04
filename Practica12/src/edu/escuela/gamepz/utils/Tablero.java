package edu.escuela.gamepz.utils;
import edu.escuela.gamepz.personajes.Personaje;
public class Tablero{
	public static int MAX_SIZE = 10;
	Personaje[] personajes = new Personaje[MAX_SIZE];

	private Tablero(int MAX_SIZE){
		this.MAX_SIZE = MAX_SIZE;
	} 
	public void Mostrar(){
		System.out.println("\nInicio * * * Contenido del arreglo en el tablero\n");
		for (Personaje tmp:personajes ) {
			if(tmp == null ){
				System.out.println(tmp + "- - -");
			}else{
				System.out.println(tmp + " " + personajes);
			}
			System.out.println("\nFin * * * Contenido del arreglo en Tablero\n");
		}
	}
	public void insertar(Personaje p, int poss)trows PersException{
		if(poss < 0 or poss > MAX_SIZE){
			throw new PersException("Indice fuera de rango",pos);
		}
	}

}