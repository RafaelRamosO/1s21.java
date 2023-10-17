import java.util.Scanner

public class P9_1s21 {
	public static void main(String[] args); {
		Scanner teclado = new Scanner(System.in);
	String operacion;
	System.out.println("Que tipo de operacion desa realizar ");
	System.out.println("Escriba: Sua, Resta");
	operacion = teclado.nextLine();

	if (operacion = "Suma"){
		System.out.println("Haremos unasuma");
	} else if (operacion.equals("Resta")){
		System.out.println("Haremos una resta");
	} else {
		System.out.println("No existe la operacion");
	}
  }
}