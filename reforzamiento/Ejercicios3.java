public class Ejercicios3 {
    public static void main(String[] args) {
    
        System.out.println("Este programa mostrará los n primeros números de Fibonacci");
        
        int fibo1 = 0;
        int fibo2 = 1;
        int fiboAux = 0;
        
        System.out.print("Indique cuántos números desea que se muestren ");
        int n = Integer.parseInt(System.console().readLine());
        
        for (int i = 1; i <= n; i++) {
          if (i == 1) {
            System.out.print(fibo1 + ", ");
          } else if (i == 2) {
            System.out.print(fibo2 + ", ");
          } else {
            System.out.print((fibo1 + fibo2) + ", ");
            fiboAux = fibo2;
            fibo2 += fibo1;
            fibo1 = fiboAux;
          }
        }
      }
}
