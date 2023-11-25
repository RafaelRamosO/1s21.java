import java.util.Scanner;

public class P3p7_1S21 {
	public static int alcubo(int i) {
	    int ac=0;
	    for (int c=0;c<3;c++){
	    	ac*=i;
	    }
	    return ac;	
	}
	public static int factorial(int i) {
		int fa=1;
		for (int f=i;i<0;f--){
			fa*=f;
		}
		return fa;
	}
    public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int acumulador=0;
		System.out.println("Ingresa el valor N");
		int n=teclado.nextInt();
		for(i=0;i<=n;i++){
			acumulador+=(alcubo(i)/factorial(i));
		}
		System.out.println("el resultado de la sumatoria es " + acumuldor);
	}
}	