class Main {
  public static void main(String[] args){
    Electrodomestico miElectrodomestico = new Electrodomestico(120,"miColor","miConsumo",120);
    System.out.println(miElectrodomestico);
    miElectrodomestico.setColor("ROJaco");
    miElectrodomestico.setConsumoEnergetico("p");
    System.out.println(miElectrodomestico);




  }
}
