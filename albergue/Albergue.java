
public enum Albergue{
  SIMPLES(1,50),
  DOBLES(2,80),
  TRIPLES(3,100),
  MULTIPLES(6,150);

  private int plazas;
  private double precio;

  Albergue(int plazas, double precio){
    this.plazas = plazas;
    this.precio = precio;
  }
  
  public int getPlazas(){
    return this.plazas;
  }
  public double getPrecio(){
    return this.precio;
  }
  void setPrecio(double precio){
    this.precio = precio;
  }
  void setPlazas(int plazas){
    this.plazas = plazas;
  }
  public String comprobarHab(String habitacion,int personas){
    String respuesta="habitacion Correcta";
    if(this.plazas<=personas){
      respuesta ="Necesita habitacion superior";
    }
    return respuesta;
  }
  public double precioFinal(int noches){
    return this.precio*noches;
  }

  }
