package mx.desasof.inmobiliaria.casas;
public class Urbana extends Casa{
	private int banos;

	public Urbana(String tipo, int hab,float costo){
		super(tipo,hab,costo);
		this.banos = banos;
	}

	public Urbana(String tipo, int banos){
		super(tipo);
		this.banos = banos;
	}

	public int hashcode(){
		return super.hashCode()*banos*23;
	}

	public boolean equals(Object u){
		if(super.equals(u) && u instanceof Urbana){

			return true;
		}
		return false;
	}

	public String toString(){
		return super.toString() +" " + banos;
	}
}