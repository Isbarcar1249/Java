public class Main{
  public static void main(String[] args){
    System.out.println("Ismael Barranco Carballo");
    Electrodomestico miElectrodomestico = new Electrodomestico();
    Electrodomestico miElectrodomestico1 = new Electrodomestico(120,"AAA");
    Electrodomestico miElectrodomestico2 = new Electrodomestico(180,"Negro","AAA",82.1);
    Electrodomestico miElectrodomestico3 = new Electrodomestico(miElectrodomestico2);
    System.out.println(miElectrodomestico);
    System.out.println(miElectrodomestico1);
    System.out.println(miElectrodomestico2);
    System.out.println(miElectrodomestico3);
    System.out.println();
    System.out.println(miElectrodomestico3.getPeso());
    System.out.println(miElectrodomestico3.getColor());
    System.out.println(miElectrodomestico3.getConsumoE());
    System.out.println(miElectrodomestico3.getPrecioBase());

    miElectrodomestico3.setPeso(33);
    miElectrodomestico3.setColor("Negro");
    miElectrodomestico3.setConsumoE("AAA");
    miElectrodomestico3.setPrecioBase(232);
    System.out.println();
    System.out.println(miElectrodomestico3.getPeso());
    System.out.println(miElectrodomestico3.getColor());
    System.out.println(miElectrodomestico3.getConsumoE());
    System.out.println(miElectrodomestico3.getPrecioBase());
    System.out.println();

    System.out.println(miElectrodomestico.precioFinal());

  }
}
