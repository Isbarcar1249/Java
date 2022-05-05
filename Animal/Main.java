public class Main{
  public static void main(String[] args){
    //No se pueden instanciar objetos de la clase abstract
    //Animal miAnimal = new Animal();
    //System.out.println(miAnimal.durmiendo());
    Gato miGato = new Gato();
    System.out.println(miGato.durmiendo());
    System.out.println(miGato.onomatopeya());
    System.out.println(miGato.comiendo());
  }
}
