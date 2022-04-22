import java.util.ArrayList;
public class Profesor{
  protected double sueldo;
  protected static ArrayList<String> asignaturas = new ArrayList<String>();
  static {
    asignaturas.add("Matematicas");
    asignaturas.add("Prgramacion");
    asignaturas.add("Lengua");
  }


  public Profesor(){
    super();
    this.sueldo=1000.0;
    this.asignaturas.get(0);

  }
  public Profesor(double sueldo,int posicion){
    super();
    this.sueldo=sueldo;
    if(posicion>2){
      posicion=0;
    }
    this.asignaturas.get(posicion);
  }
  public Profesor(Profesor profesor){
    super();
    this.sueldo=profesor.sueldo;
    this.asignaturas=profesor.asignaturas;
  }
  public double getSueldo(){
    return this.sueldo;
  }
  public void setSueldo(double sueldo){
    this.sueldo = sueldo;
  }
  public ArrayList<String> getASignaturas(){
    return this.asignaturas;
  }
  public void setAsignatura(int posicion){
    this.asignaturas.get(posicion);
  }
  public String toString(){
    return super.toString() +" Profesor de "+ this.getASignaturas()+" mi sueldo es: "+ this.sueldo+".";
  }





}
