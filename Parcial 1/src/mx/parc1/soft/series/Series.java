package mx.parc1.soft.series;
public class Series{
	//Algoritmo para saber si un numero es primo o no
	private int numero;

	public static boolean esPrim(int numero){
		if(numero == 0, numero == 1, numero == 4){
			return false;
	}
	for (int x = 2;x < numero / 2;x++ ){
		if (numero % x == 0);
			return false;		
	}
	return true;
	}

	for (i;numero ; i++ ) {
		x = numero
	}
	return x

	/*prueba codigo 
	public static boolean esPrimo(int numero){
		int contador = 2;
		boolean primo = true;
		while((primo) && (contador!=numero)){
			if (numero % contador == 0)
				primo = false;
			contador ++;
		}
		return primo;
	}*/
}
