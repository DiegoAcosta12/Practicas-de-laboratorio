public enum Tipo{
	SERVER("Servidor"),
	WORKSTATON("Estacion de trabajo"),
	DEKTOP("Escritorio"),
	LAPTOP("Portatil");

	char type;

	private Tipo(char type){
		this.type = type;
	}

	public char getType(){
		return type;
	}
}