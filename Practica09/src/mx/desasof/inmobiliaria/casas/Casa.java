package mx.desasof.inmobiliaria.casas;

public class Casa{
	private String tipo;
	private int hab;
	private float costo;

	public Casa(String tipo, int hab,float costo){

	}

	public Casa(String tipo){
		this(tipo,2,20000000);
	}
	public int hashcode(){
		return(int)tipo.hashcode()*hab*costo;
	}

	public boolean equals(Object o){
		if(o != null && o instanceof Casa){
		}
	}

	public String toString(){
		return tipo + " " + hab + " " + costo;
	}
}