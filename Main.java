import java.util.Scanner;

public class Main {
  public static void main (String[] args){
    String nombre, apellido;
    String numeroString = "10";
    int num,numero1 = 10, numero2 = 20,dia;
    boolean buleano = true;
    Scanner sc = new Scanner(System.in);
    int [] listanum={2,34,534,6,46,456,34,5245,325,26,546,34,23,51,23421,4,1324,12,412,41,23,4};
    int [][] matrizNum={{4,3,4},{2,3,4}};
    /*
    System.out.print("Como te llamas? ");
    nombre = sc.nextLine();
    System.out.println("Hola " + nombre + "!");
    System.out.println("Imprimo el booleano a \"true\": " + buleano);
    buleano = false;
    System.out.println("Imprimo el booleano a \"false\": " + buleano);
    */

    /*// Casting automático
    byte bytee = 9;
    short corto = bytee;
    int entero = corto;
    long largo = entero;
    float flotante = largo;
    double doble = flotante;
    // Casting manual
    int letra = 65;
    char caracter = (char)letra;
    System.out.println(caracter);
    doble = 9.85;
    entero = (int)doble;
    System.out.println(entero);
    */

    /*// String
    System.out.println(nombre);
    System.out.println(nombre.toUpperCase());
    System.out.println(nombre.toLowerCase());
    nombre = "Celia";
    apellido = "Pedrego";
    System.out.println(nombre + apellido);
    System.out.println(nombre.concat(apellido));
    System.out.println(nombre);


    System.out.println(numero1+numero2);
    numeroString = numeroString+numero1;
    System.out.println(numeroString);
    System.out.println(numeroString+numero1+numero2);
    System.out.println(numero1+numero2+numeroString);
*//*
    if (numero1<numero2){
      System.out.println("numero 1 es menor");
    }else if (numero2<numero1){
      System.out.println("Numero2 es menor");
    }
    else{
      System.out.println("Son iguales");
    }
    numeroString= (numero1<numero2)?"Numero1 es menor" :"Numero 2 es menor";
    System.out.println(numeroString);*/
    /* dia=4;
    switch(dia){
      case 1:
        System.out.println("Hoy es lunes");
        break;
      case 2:
        System.out.println("Hoy es martes");
      break;
      case 3:
        System.out.println("Hoy es miercoles");
        break;
      case 4:
        System.out.println("Hoy es jueves");
        break;
      case 5:
        System.out.println("Hoy es viernes");
        break;
    }*/
    /*for(int i=0;i<listanum.length;i++){
      System.out.print(listanum[i]+" - ");
    }
    System.out.println();
    int i=0;
    while(i<listanum.length){
    System.out.print(listanum[i]+" - ");
    i++;
    }
    System.out.println();
    for(int j: listanum){
      System.out.print(j+" - ");
    }*/

    for (int i=0; i<matrizNum.length; i++){
      for (int j=0; j<matrizNum[i].length; j++){
        System.out.print(matrizNum[i][j] + " | ");
      }
      System.out.println();
    }










  }
}
