public class Main{
  public static void main (String[] args){
    MediosDeTransporte mtAvion = MediosDeTransporte.AVION;
    MediosDeTransporte mtTren = MediosDeTransporte.TREN;
    MediosDeTransporte mtCoche = MediosDeTransporte.COCHE;
    MediosDeTransporte mtBici = MediosDeTransporte.BICICLETA;
    double kilometros = 900;

    System.out.println(mtAvion);
    System.out.println("Si quiero recorrer " + kilometros + "km, tardo " +
    mtAvion.tiempo(kilometros) + "horas en llegar y gasto " +
    mtAvion.precio(kilometros) + " euros.");
    System.out.println(mtCoche);
    System.out.println("Si quiero recorrer " + kilometros + "km, tardo " +
    mtCoche.tiempo(kilometros) + "horas en llegar y gasto " +
    mtCoche.precio(kilometros) + " euros.");

  }
}
