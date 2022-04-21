public class Main{
  public static void main(String[] args){

    Persona miPersona = new Persona();
    Persona miPersona2 = new Persona("Angelito","12344334t");
    System.out.println(miPersona);
    miPersona.setNombre("Pepe");
    miPersona.setDni("77376275t");
    System.out.println(miPersona);
    System.out.println();
    System.out.println(miPersona.getNombre());
    System.out.println(miPersona.getDni());

    System.out.println(miPersona2);
  }
}
