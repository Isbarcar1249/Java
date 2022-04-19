public class Persona{
  private String nombre;
  private String dni;

  //Constructor
  public Persona(){
    this.nombre ="Ismael";
    this.dni ="12344334t";
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
