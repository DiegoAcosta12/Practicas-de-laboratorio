package mx.parcial1.soft.series;
public class Series{
	//Algoritmo para saber si un numero es primo o no
	private int numero;
	public static boolean esPar(int numero){
		if(numero == 0, numero == 1, numero == 4){
			return false;
	}
	for (int x = 2;x < numero / 2;x++ ) {
		if (numero % x == 0)
			return false;		
	}
	return true;
	

}
