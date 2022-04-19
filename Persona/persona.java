public class Persona{
  private String nombre;
  private String dni;

  //Constructor
  public Persona(){
    this.nombre ="Ismael";
    this.dni ="12344334t";

  }
  //Tostring
  public String toString(){
    return "Me llamo "+ this.nombre+" y mi dni es: "+ this.dni+".";
  }
}
