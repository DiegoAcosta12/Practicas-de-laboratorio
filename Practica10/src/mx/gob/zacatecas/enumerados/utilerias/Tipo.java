package mx.gob.zacatecas.enumerados.utilerias.Tipo;
public enum Tipo{
	SERVER("Servidor"),
	WORKSTATON("Estacion de trabajo"),
	DESKTOP("Escritorio"),
	LAPTOP("Portatil");

	private String type;

	private Tipo(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}
}