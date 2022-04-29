class Main {
  public static void main(String[] args){
    Electrodomestico miElectrodomestico = new Electrodomestico(120,"miColor","miConsumo",120);
    System.out.println(miElectrodomestico);
    miElectrodomestico.setColor("rojo");
    miElectrodomestico.setConsumoEnergetico("F");
    System.out.println(miElectrodomestico);
    Electrodomestico miElectrodomestico1 = new Electrodomestico();
    Electrodomestico miElectrodomestico2 = new Electrodomestico(200,"AAA");
    System.out.println();
    System.out.println(miElectrodomestico1);
    System.out.println();
    System.out.println(miElectrodomestico2);



  }
}
