public class contrasenaNum extends contrasena {

  public contrasenaNum(String clave){
    super(clave);
    this.clave = clave;

  }

  public String tamaVal(){
    System.out.println("hola");
  String solucion= "Tamanio invalido";
    if (this.clave.length()>4){
      solucion="Tamanio valido";
    }

  return solucion;

  }
  public String caractValido(){
    String respuesta = "Contrasena valida";
    System.out.println(this.clave);
    for (int i=0;i<this.clave.length();i++){
      if(this.clave.charAt(i)=='0' && this.clave.charAt(i)!='1' && this.clave.charAt(i)!='2' && this.clave.charAt(i)!='3' && this.clave.charAt(i)!='4' && this.clave.charAt(i)!='5' && this.clave.charAt(i)!='6' && this.clave.charAt(i)!='7' && this.clave.charAt(i)!='8' && this.clave.charAt(i)!='9')

      respuesta="Contrasena invalida";
    }
    return respuesta;
  };
}
