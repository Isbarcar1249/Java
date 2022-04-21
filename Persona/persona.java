public class Persona{
  protected String nombre;
  protected String dni;

  //Constructor
  public Persona(String nombre, String dni){
    this.nombre = nombre;
    this.dni =dni;
  }
  public Persona(){
    this.nombre ="Ismael";
    this.dni ="12344334t";
  }
  public Persona(Persona persona){
    this.nombre = persona.nombre;
    this.dni = persona.dni;
  }
  public void setNombre(String nombre){
    this.nombre = nombre;
  }
  public String getNombre(){
    return this.nombre;
  }
  public void setDni(String dni){
    this.dni = dni;
  }
  public String getDni(){
    return this.dni;
  }

  //Tostring
  public String toString(){
    return "Me llamo "+ this.nombre+" y mi dni es: "+ this.dni+".";
  }

}
