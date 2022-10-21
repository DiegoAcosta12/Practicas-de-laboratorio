public enum Memoria{
	DDR("Memoria ram",166,30),
	DDR2("Laptop",240,35),
	DDR3("Laptop nueva",533,40),
	DDR4("Gamer",1600,40);

	String tipo;
	float velocidad;
	int pines;

	private memoria(String tipo,float velocidad,int pines){
		this.tipo = tipo;
		this.velocidad = velocidad;
		this.pines = pines;
	}

	public String getTipo(){
		return tipo;
	}
	public float getVelocidad(){
		return velocidad;
	}
	public int getPines(){
		return pines;
	}
}