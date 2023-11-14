import java.util.Scanner;

public class p3p2_1s21 {
	static Scanner teclado = new Scanner(System.in);
    public static void suma() {
    	System.out.println("SUMA DE 2 NUMEROS");
    	System.out.println("INGRESA EL PRIMER NUMERO:");
    	int a = teclado.nextInt();
    	System.out.println("INGRESA EL SEGUNDO NUMERO:");
    	int b = teclado.nextInt();
    	int c = a + b;
    	System.out.println("LA SUMA DE LOS NUMERO ES: " + c);
    }

    public static void resta() {
    	System.out.println("RESTA DE 2 NUMEROS");
    	System.out.println("INGRESA EL PRIMER NUMERO:");
    	int a = teclado.nextInt();
    	System.out.println("INGRESA EL SEGUNDO NUMERO:");
    	int b = teclado.nextInt();
    	int c = a - b;
    	System.out.println("LA RESTA DE LOS NUMERO ES: " + c);
    }

    public static void division() {
    	System.out.println("DIVISION DE 2 NUMEROS");
    	System.out.println("INGRESA EL PRIMER NUMERO:");
    	int a = teclado.nextInt();
    	System.out.println("INGRESA EL SEGUNDO NUMERO:");
    	int b = teclado.nextInt();
    	int c = a / b;
    	System.out.println("LA DIVISION DE LOS NUMERO ES: " + c);
    }

    public static void multiplicacion() {
    	System.out.println("MULTIPLICACION DE 2 NUMEROS");
    	System.out.println("INGRESA EL PRIMER NUMERO:");
    	int a = teclado.nextInt();
    	System.out.println("INGRESA EL SEGUNDO NUMERO:");
    	int b = teclado.nextInt();
    	int c = a * b;
    	System.out.println("LA MULTIPLICACION DE LOS NUMERO ES: " + c);
    }

    public static void menu() {
        System.out.println("OPERACIONES BASICAS");
        System.out.println("\n A) SUMA");
        System.out.println("B) RESTA");
        System.out.println("C) DIVISION");
        System.out.println("D) MULTIPLICACION");
        System.out.println("S) SALIR");
        System.out.println("\n QUE OPCION QUIERE"); 
}