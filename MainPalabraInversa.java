import java.util.Scanner;
class MainPalabraInversa {
 public static void main(String[] args) {
 String palabra;
 Scanner a= new Scanner(System.in);

System.out.println("INGRESA UNA PALABRA: ");
palabra=a .nextLine();

PalabraInversa inversa= new PalabraInversa();
inversa.setPalabra(palabra);
System.out.println("LA PALABRA INVERSA ES: "+inversa.getInversa());

System.out.println(inversa);
 }
    
}