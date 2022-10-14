package mx.desasof.inmobiliaria.casas;

public class Campo extends Casa{
	private float piscina = [2]

	public campo(String tipo,int hab,float costo){
		super(tipo,hab,costo);
		piscina[0] = ancho;
		piscina[1] = largo;

	}

	public int hashcode(){
		return super.hashcode()*(piscina[0])*(piscina[1])/5;
	}

	public boolean equals(Object c){
		if(super.equals(c) && c instanceof campo){
			return true;
		}
		return false;
	}

	public String toString(){
		return tipo + " " + hab + " " + costo + " " + ancho + " " + largo;
	}

}