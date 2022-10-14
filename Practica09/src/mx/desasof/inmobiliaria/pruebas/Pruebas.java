package mx.desasof.inmobiliaria.pruebas;
import mx.desasof.inmobiliaria.casas.Casa;
import mx.desasof.inmobiliaria.casas.Campo;
import mx.desasof.inmobiliaria.casas.Urbana;
public class Pruebas{
	public static void main(String[] args){
		Casa cas01 = new Casa("Estandar",3,3000000);
		Campo camp01 = new Campo("Cazador",3.5f,10f);
		Urbana urb01 = new Urbana("Residencia",3,2500000,2);
		Casa cas02 = new Casa("Estandar",3,3000000);
		Campo camp02 = new Campo("Cazador",3.5f,10);
		Urbana urb02 = new Urbana("Residencia",3,2500000,2);
		Casa cas03 = new Casa("Estandar");
		Campo camp03 = new Campo("Cazador",4,15000,3f, 5f);
		Urbana urb03 = new Urbana("Residencia",5);
		Casa[] casas = {cas01,camp01,urb01,cas02,camp02,urb02,cas03,camp03,urb03};
		int i = 0;
		while(i<casas.length){
			for ( Casa c: casas ) {
				if(casas[i]==c){
					System.out.println(casas[i] + "Son el mismo objeto" + c);
					System.out.println("= = = = =");
					break; 
				}else if(casas[i].equals(c)){
					System.out.println(casas[i] + "Son iguales" + c);
					System.out.println("e e e e e");
					break;
				}else{	
					System.out.println(casas[i] + "No son iguales" + c);
					System.out.println("! ! ! ! !");
				}
			}//for
			i++;
		}//while
	}//main
}//clase