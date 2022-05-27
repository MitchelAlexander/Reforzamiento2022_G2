/**
 * NumerosPrimos2
 */
public class NumerosPrimos2 {

	

	public static void main(String args[]) {
		int contador;
		int num;
		int x;
		for (num=1;num<=1000000;num++) {
			x = 1;
			contador = 0;
			while (x<=num) {
				if (num%x==0) {
					contador = contador+1;
				}
				x = x+1;
			}
			if (contador==2) {
				System.out.println("El numero, "+num+" es primo ");
			}
		}
	}


}

