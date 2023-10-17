import java.until.Scanner;
public class P13_1S21{
	public static void main(String[] args) {
		Scanner teclado = new Scanner (Syste.in);
		byte n,i,a;
		int sumatoria=0, factor;
		System.out.println("Ingresa el valor N");
		n=teclado.nextByte();
		for(i=0;i<=n;i++){
			factor=1;
			if(i==0) factor=1;
			else{
				for (a=i;a>0;a--){
					factor*=a;	
				}
			}
			suma += Math.pow(i,3)/factor;
		}
		System.out.println("La sumatoria es " + sumatoria);
	}
}	