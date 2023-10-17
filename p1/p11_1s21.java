import java.util.Scanner;
import java.util.Scanner;
public class p11_1s21{
	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		Scanner numero= new Scanner(System.in);
		System.out.println("Ingresa una opcion (Suma, Resta, Multiplicacion, Division, Potencia, Raiz Cuadrada): ");
		String opc="Suma";
		opc=teclado.nextLine();
		switch(opc){
		case "Suma":
			System.out.println("aqui el caso Suma");
			System.out.println("Ingresa un numero: ");
			int numero1=numero.nextInt();
			System.out.println("Ingresa otro numero: ");
			int numero2=numero.nextInt();
			int suma= numero1+numero2;
			System.out.println("La respuesta es: " +suma);
			break;
		case "Resta":
			System.out.println("aqui el caso Resta");
			System.out.println("Ingresa un numero: ");
			int numero1=numero.nextInt();
			System.out.println("Ingresa otro numero: ");
			int numero2=numero.nextInt();
			int Resta= numero1-numero2;
			System.out.println("La respuesta es: " -Resta);
			break;
		case "Multiplicacion":
			System.out.println("aqui el caso Multiplicacion");
			break;
		case "Division":
			System.out.println("aqui el caso Division");
			break;
		case "Potencia":
			System.out.println("aqui el caso Potencia");
			break;
		case "Raiz Cuadrada":
			System.out.println("aqui el caso Raiz Cuadrada");
			break;
		default:
			System.out.println("No se encuentra la opcion deseada");
		}
	}
}