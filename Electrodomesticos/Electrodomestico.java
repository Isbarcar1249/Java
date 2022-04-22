public class Electrodomestico {
  protected Double precioBase;
  protected String color;
  protected String consumoE;
  protected Double peso;

  //constructor
  public Electrodomestico(){
    this.precioBase =100.0;
    this.color = "Blanco";
    this.consumoE = "F";
    this.peso = 20.0;
  }
  public Electrodomestico(double precioBase, String consumoE){
    this.precioBase =precioBase;
    this.color = "Blanco";
    this.consumoE = consumoE;
    this.peso = 20.0;
  }
  public Electrodomestico(Electrodomestico electrodomestico){
    this.precioBase =electrodomestico.precioBase;
    this.color = electrodomestico.color;
    this.consumoE =electrodomestico.consumoE;
    this.peso = electrodomestico.peso;
  }
  public Electrodomestico(double precioBase, String color,String consumoE, double peso){
    this.precioBase =precioBase;
     setColor(color);
     setConsumoE(consumoE);
    this.peso = peso;
  }
  public String toString(){
    return "Electrodomestico color: " + color + " peso: " + peso+ " consumo energetico: "+ consumoE+" precio: "+ precioBase;
  }
  public void setPrecioBase(double precioBase){
    this.precioBase = precioBase;
  }
  public void setColor(String color){
    color=color.toUpperCase();
    if(color.equals("BLANCO")||color.equals("NEGRO")||color.equals("ROJO")||color.equals("AZUL")||color.equals("METALIZADO")){
    this.color = color;}
    else{
      System.out.println("Color no disponible");
    }
  }
  public void setConsumoE(String consumoE){
    consumoE.toUpperCase();
    if(consumoE.equals("F")||consumoE.equals("D")||consumoE.equals("C")||consumoE.equals("B")||consumoE.equals("A")||consumoE.equals("AA")||consumoE.equals("AAA")){
    this.consumoE = consumoE;}
    else{
      System.out.println("Consumo no disponible");
    }
  }
  public void setPeso(double peso){
    this.peso = peso;
  }
  public double getPeso(){
    return this.peso;
  }
  public double getPrecioBase(){
    return this.precioBase;
  }
  public String getColor(){
    return this.color;
  }
  public String getConsumoE(){
    return this.consumoE;
  }
  public double precioFinal(){
    double precioFinal=precioBase;
    if(this.consumoE =="F"){
      precioFinal=precioBase;
    }
    else if(this.consumoE == "E"){
        precioFinal=precioBase+20;
    }
    else if (this.consumoE == "D"){
      precioFinal=precioBase+40;
    }
    else if (this.consumoE == "C"){
      precioFinal=precioBase+60;
    }
    else if (this.consumoE == "B"){
      precioFinal=precioBase+80;
    }
    else if (this.consumoE == "A"){
      precioFinal=precioBase+100;
    }
    else if (this.consumoE == "AA"){
      precioFinal=precioBase+120;
    }
    else if (this.consumoE == "AAA"){
      precioFinal=precioBase+140;
    }
    precioFinal=precioFinal+((this.peso/20)*30);
    color=color.toUpperCase();
    if(this.color.equals("BLANCO")){
      precioFinal=precioFinal-20;
    }
    return precioFinal;
  }


























}
