package edu.escuela.gamepz.utils;
import edu.escuela.gamepz.personajes.Personaje;
import edu.escuela.gamepz.utils.PersException;
public class Tablero{
	public static int MAX_SIZE = 10;
	Personaje[] personajes = new Personaje[MAX_SIZE];

	private Tablero(int MAX_SIZE){
		this.MAX_SIZE = MAX_SIZE;
	} 
	public void Mostrar(){
		System.out.println("\nInicio * * * Contenido del arreglo en el tablero\n");
		int contar = 0
		for (Personaje tmp:personajes ) {
			if(tmp == null ){
				System.out.println(tmp + "- - -");
			}else{
				System.out.println(tmp + " " + personajes);
			}
			contar++;
			System.out.println("\nFin * * * Contenido del arreglo en Tablero\n");
		}
	}
	public void insertar(Personaje p, int poss)throws PersException{
		if(poss < 0 or poss > MAX_SIZE){
			throw new PersException("Indice fuera de rango",poss);
		}
		Personaje[poss] = p;
	}
	public void borrar(int poss)throws PersException{
		if(poss < 0 or poss > MAX_SIZE){
			throw new PersException("Indice fuera de rango",poss);
		}
	}
}