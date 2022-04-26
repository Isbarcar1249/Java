/*
------------------------
|   Electrodomestico   |
|----------------------|
| - precioBase         |
| - color              |
| - consumoEnergetico  |
| - peso               |
|----------------------|
| + precioFinal()      |
|----------------------|
*/

public class Electrodomestico{
  private double precioBase;
  private String color;                 //Blanco, Negro, Rojo, Azul, Metalizado.
  private String consumoEnergetico;
  private double peso;

  // No es necesario utilizar listas dinámicas ni, por tanto, ArrayList.
  // Se declaran aquí y no dentro de las funciones porque se van a utilizar más de una vez.
  String colores[] = {"BLANCO","NEGRO","ROJO","AZUL","METALIZADO"};
  String codigos[] = {"F","E","D","C","B","A","AA","AAA"};

  // NUEVO -> final static == const
  private final static double PRECIO = 100;
  private final static String COLOR = "blanco"; // Para escribir COLOR cada vez que queramo poner el color por defecto.
  private final static String CONSUMO = "F";
  private final static double PESO = 20;

  //Constructores
  public Electrodomestico(){
    /*this.precioBase = 100;
    this.color = "Blanco";
    this.consumoEnergetico = "F";
    this.peso = 20;*/
    this(PRECIO,COLOR,CONSUMO,PESO);            //Llama al constructor con parámetros.
  }
  public Electrodomestico(double precioBase, String consumoEnergetico){
    /*this.precioBase = precioBase;
    this.color = "Blanco";
    this.consumoEnergetico = consumoEnergetico;
    this.peso = 20;*/
    this(precioBase,COLOR,consumoEnergetico,PESO);
  }
  public Electrodomestico(double precioBase, String color, String consumoEnergetico, double peso){
    this.precioBase = precioBase;
    //this.color = color;
    this.setColor(color);
    //this.consumoEnergetico = consumoEnergetico;
    this.setConsumoEnergetico(consumoEnergetico);
    this.peso = peso;
  }
  public Electrodomestico(Electrodomestico electrodomestico){
    /*this.precioBase = electrodomestico.precioBase;
    this.color = electrodomestico.color;
    this.consumoEnergetico = electrodomestico.consumoEnergetico;
    this.peso = electrodomestico.peso;*/
    this(electrodomestico.precioBase,electrodomestico.color,electrodomestico.consumoEnergetico,electrodomestico.peso);
  }

  // Set y Get
  public void setPrecioBase(double precioBase){
    this.precioBase = precioBase;
  }
  public void setColor(String color){

    this.color = COLOR;
    if (comprobacion(color,colores)==true){
      this.color = color;
    }
  }
  public void setConsumoEnergetico(String consumoEnergetico){
    this.consumoEnergetico = CONSUMO;
    if (comprobacion(consumoEnergetico,codigos)==true){
      this.consumoEnergetico= consumoEnergetico;
    }
  }
  public void setPeso(double peso){
    this.peso = peso;
  }
  public double getPrecioBase(){
    return this.precioBase;
  }
  public String getColor(){
    return this.color;
  }
  public String getConsumoEnergetico(){
    return this.consumoEnergetico;
  }
  public double getPeso(){
    return this.peso;
  }


  private boolean comprobacion(String codiguito,String lista[]){
    boolean encontrado = false;
    codiguito=codiguito.toUpperCase();
    for (int i = 0 ; i < lista.length && !encontrado ; i++){
      if (lista[i].equals(codiguito)){
        encontrado = true;
      }
    }
    return encontrado;

  }


  public double precioFinal(){
    return this.precioBase + extraPeso() + extraEficiencia() + extraColor();

  }

  private double extraPeso(){
    int rango = (int)(this.peso/20);  // Cada 20kg que aumenta el peso
    return rango*30;                  // El precio aumenta 30€
  }
  private double extraEficiencia(){
    /*
    |F| E| D| C| B|  A| AA|AAA|
    |0|20|40|60|80|100|120|140|
    */
    // hemos mejorado comprobarCodigoEnergetico() para que devuelva la posición.
    int posicion = comprobarCodigoEnergetico(this.consumoEnergetico);
    return posicion*20;
  }
  private double extraColor(){
    double descuento = 0;
    if ((this.color).equals(COLOR)) descuento = -20;
    return descuento;
  }

  // EXTRA: Pensar en la posible refactorización de los métodos comprobarColor() y comprobarCodigoEnergetico()

  public String toString(){
    return "El precio base es  " + this.precioBase + ", el color es " + this.color + ", el consumo es " + this.consumoEnergetico + ", el peso es "+ this.peso + ".\nEl precio final es: " + precioFinal() + ".";
    }
  }
