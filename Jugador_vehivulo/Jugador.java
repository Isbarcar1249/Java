

public class Jugador{
  protected String nombre;
  protected int vidas;
  private int[] coordenadas;

  private final  int VIDAS =3;
  private final int[] COOR={0,0};
  public Jugador(String nombre){
    this.nombre = nombre;
    this.vidas = VIDAS;
    this.coordenadas =COOR;

  }
  private String impriCoor(){
    return "("+coordenadas[0]+","+coordenadas[1]+").";
  }
  public String toString(){
    return "Jugador: "+ this.nombre+ " Vidas: "+this.vidas+" Coordenadas: "+this.impriCoor();

  }
}
