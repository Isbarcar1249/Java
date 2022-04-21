public class Cuenta{
  protected String titular;
  protected double cantidad;

  //constructor
  public Cuenta(String titular){
    this.titular=titular;
    this.cantidad=0;
  }
  public Cuenta(String titular,double cantidad){
    this.titular=titular;
    this.cantidad=cantidad;
  }
  public Cuenta(Cuenta cuenta){
    this.titular=titular;
    this.cantidad=cantidad;
  }
  //gets y sets
  void setTitular(String titular){
    this.titular=titular;
  }
  void setCantidad(double cantidad){
    this.cantidad=cantidad;
  }
  String getTitular(){
    return this.titular;
  }
  Double getCantidad(){
    return this.cantidad;
  }
  public String toString(){
    return "El titular es "+ this.titular+ " la cantidad es: "+ this.cantidad+" eurazos";
  }
  //metodos

  boolean Ingresar(double cuantia){
    boolean cuentaValida=false;
     if (cuantia>0){
        this.cantidad+=cuantia;
        cuentaValida=true;
      }
      return cuentaValida;
  }
  boolean Retirar(double cuantia){
    boolean retiroValido=false;
    if (cuantia<=this.cantidad && cuantia>0){
      this.cantidad-=cuantia;
      retiroValido=true;
    }
    return retiroValido;
  }

}
