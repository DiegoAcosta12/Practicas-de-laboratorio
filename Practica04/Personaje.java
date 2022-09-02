public class Personaje{
		private String nombre;
	    private int edad;


	    public Personaje(String nombre){
	    	this.edad = 0
	    }

	    public int getEdad(String nombre);

	    public boolean setEdad(int Edad);
	    if(edad>0 && edad<120)
	    	this.edad = edad;
	    	return.true;


	public void setNombre(String nombre){
		this.nombre = nombre;
	}

	public String getNombre(){
		return nombre;
	}

	public void saludar(){
		System.out.println("Hola Alumno de POO "+nombre);
	}
}