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
  public void setTitular(String titular){
    this.titular=titular;
  }
  public void setCantidad(double cantidad){
    this.cantidad=cantidad;
  }
  public String getTitular(){
    return this.titular;
  }
public  Double getCantidad(){
    return this.cantidad;
  }
  public String toString(){
    return "El titular es "+ this.titular+ " la cantidad es: "+ this.cantidad+" eurazos";
  }
  //metodos

  public boolean Ingresar(double cuantia){
    boolean cuentaValida=false;
     if (cuantia>0){
        this.cantidad+=cuantia;
        cuentaValida=true;
      }
      return cuentaValida;
  }
  public boolean Retirar(double cuantia){
    boolean retiroValido=false;
    if (cuantia<=this.cantidad && cuantia>0){
      this.cantidad-=cuantia;
      retiroValido=true;
    }
    return retiroValido;
  }

}
