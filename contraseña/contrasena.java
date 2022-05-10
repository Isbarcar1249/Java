public abstract class contrasena{
   protected String clave;

public contrasena (String clave) {
  this.clave = clave;
  }

public abstract String tamaVal();
public abstract String caractValido();
public String no3rep(){
  int contador=1;
  String solucion= "Contrasena valida";
  for(int i=0;i<this.clave.length();i++){
    if (i!=0){
    if (this.clave.charAt(i)== (this.clave.charAt(i-1))){
      contador++;
    }
  }
    if (contador==3){
      solucion ="Contrasena no valida";
      }
      
    }
    return solucion;
}








}
