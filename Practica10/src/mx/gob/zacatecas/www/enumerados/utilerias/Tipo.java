package mx.gob.zacatecas.www.utilerias.Tipo;
public enum Tipo{
	SERVER("Servidor"),
	WORKSTATON("Estacion de trabajo"),
	DEKTOP("Escritorio"),
	LAPTOP("Portatil");

	String type;

	private Tipo(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}
}