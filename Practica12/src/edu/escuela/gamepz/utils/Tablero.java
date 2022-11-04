package edu.escuela.gamepz.utils;
import edu.escuela.gamepz.personajes.Personaje;
public class Tablero{
	public static int MAX_SIZE = 10;
	Personaje[] personajes = new Personaje[MAX_SIZE];

	private Tablero(int MAX_SIZE){
		this.MAX_SIZE = MAX_SIZE;
	} 
	public static void Mostrar(){
		System.out.println("\nInicio * * * Contenido del arreglo en el tablero\n");
		for (Personaje tmp:personajes ) {
			if(tmp = null ){
				System.out.println();
			}else{
				System.out.println();
			}
			System.out.println("\nFin * * * Contenido del arreglo en Tablero\n");
		}
	}
}