import java.util.Scanner;

public class Main {
  public static void solucionAlternativa(int numPersonas){
    Albergue arrAlbergue[] = Albergue.values();
    double precio, habNecesarias;
    double descuento = 0.85; // 15% descuento == multiplicar * 0.85

    for ( Albergue h : arrAlbergue){
      habNecesarias = Math.ceil((double)numPersonas/(double)h.getPersonas());
      if (h.getDisponibles() > habNecesarias){
        precio = h.getPrecio()*descuento*habNecesarias;
        System.out.println("Con habitaciones de tipo " + h + " vas a necesitar " +
        habNecesarias + " habitaciones y el precio por dia con descuento es: " +
        precio + " euros.");
      }
    }

  }

  public static void main(String[] args){
    Scanner sc = new Scanner (System.in);

    String tipoHabitacion;
    Albergue habitacion = Albergue.SIMPLE;
    int numPersonas = 0, numNoches;
    double precioTotal, precioPorPersona,recaudacion=0;
    boolean numPersonasValido = false;
    int numeroHabitaciones = Albergue.SIMPLE.getDisponibles()+Albergue.DOBLE.getDisponibles()+Albergue.TRIPLE.getDisponibles()+Albergue.MULTIPLE.getDisponibles();
    String masReservas="SI";
  while(numeroHabitaciones>0 && masReservas.equals("SI")){
    System.out.println("Numero de habitaciones disponibles--> "+numeroHabitaciones);
   numPersonasValido = false;
    while(!numPersonasValido){
      System.out.print("Indica el tipo de habitacion que desea: ");
      tipoHabitacion = sc.nextLine();
      habitacion = Albergue.valueOf(tipoHabitacion);
      System.out.print("Indica el numero de personas: ");
      numPersonas = sc.nextInt();
      sc.nextLine(); // Limpiamos el buffer.
      //System.out.println(" -- Comprobar que el numero de personas es valido -- ");
      numPersonasValido = habitacion.numPersonasValido(numPersonas);
    }
    numeroHabitaciones--;

    System.out.print("Indica el numero de noches: ");
    numNoches = sc.nextInt();
    sc.nextLine(); // Limpiamos el buffer
    //System.out.println(" -- Cuanto vale la habitacion en total -- ");
    precioTotal = habitacion.precioTotal(numNoches);
    recaudacion+=precioTotal;
    System.out.println("El precio total es de " + precioTotal + " euros.");
    //System.out.println(" -- Cuanto vale la habitacion en total por persona -- ");
    precioPorPersona = habitacion.precioPorPersona(numPersonas,precioTotal);
    System.out.println("El precio por persona es de " + precioPorPersona + " euros.");
    System.out.println("Recaudacion total por el momento en lo que va de reservas -->"+ recaudacion+" euros.");
    System.out.print("Quedan mas reservas por hacer SI/NO ");
    masReservas=sc.nextLine();
    /*if (habitacion.getDisponibles() == 0){
      System.out.println("Hemos cometido un error, toma descuento (estas son las opciones): ");
      solucionAlternativa(numPersonas);
    }*/
  }
  }
}
