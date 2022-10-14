package mx.desasof.inmobiliaria.casas;

public class Casa{
	private String tipo;
	private int hab;
	private float costo;

	public Casa(String tipo, int hab,float costo){
		this.tipo = tipo;
		this.hab = hab;
		this.costo = costo;
	}

	public Casa(String tipo){
		this(tipo,2,2000000);
	}
	public int hashcode(){
		return(int)tipo.hashCode()*hab*costo;
	}

	public boolean equals(Object o){
		if(o != null && o instanceof Casa){
			Casa h = (Casa) o;
			if(tipo.equals(h.tipo) && costo == h.costo){
				return true;
			}
			return false;
		}
	}

	public String toString(){
		return tipo + " " + hab + " " + costo;
	}
}