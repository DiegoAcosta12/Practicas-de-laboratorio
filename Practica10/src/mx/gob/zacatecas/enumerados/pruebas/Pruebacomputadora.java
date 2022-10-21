package mx.gob.zacatecas.enumerados.pruebas;
import mx.gob.zacatecas.enumerados.utilerias.*;
import mx.gob.zacatecas.enumerados.equipos.*;
public class Pruebacomputadora{
	public static void main(String[] args) {
		Computadora c1 = new Computadora("Lenovo",Tipo.LAPTOP,Memoria.DDR2);
		Computadora c2 = new Computadora("HP",Tipo.DESKTOP,Memoria.DDR4);
		Smallfactor s1 = new Smallfactor("Dell",Tipo.LAPTOP,Memoria.DDR3,true);
		Smallfactor s2 = new Smallfactor("Acer",Tipo.SERVER,Memoria.DDR,false);

		Computadora computadoras[] = {c1,c2,s1,s2};
		for (Computadora tmp : computadoras) {
			System.out.println(tmp);
		}
	}	
}