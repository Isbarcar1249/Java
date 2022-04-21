public class Main{
  public static void main(String[] args){
    Cuenta miCuenta= new Cuenta("Ismael");

    System.out.println(miCuenta);

    System.out.println(miCuenta.Ingresar(100));

    System.out.println(miCuenta);
    System.out.println(miCuenta.Ingresar(-100));
    System.out.println(miCuenta);

    System.out.println(miCuenta.Retirar(200));

    System.out.println(miCuenta);

  }

}
