public enum Escudo{
	SUPER(0),
	MEDIO(1),
	BAJO(2),
	NULO(3);
	private int nivel;

	private enum(int nivel){
		this.nivel = nivel
	}

}