import java.util.Scanner;

/**
 * Ejercicios
 */
public class Ejercicios {

    public static void mostrarcursoDia() {
        //Definir variable
        int diasem;
        String mensaje;
        //leer datos
        Scanner leerT=new Scanner(System.in);
        System.out.println("ingrese un dia de la semana:\n1=Dom"+
        "\n2=Lun\n3=Mar\n4=mie\n5=Jue\n6=Vie\n7=Sab");
        diasem=leerT.nextInt();
        //Proceso
        if (diasem==1 || diasem==7) {
            mensaje="No hay Clases";
        }else if (diasem==2) {
            mensaje="Matematica";
        }else if (diasem==3 || diasem==5) {
            mensaje="Fundamentos de Programacion";
        }else if(diasem==4){
            mensaje="Capacidades Comunicativa";
        }else if (diasem==6) {
            mensaje="Introducion a la ingenieria de sistemas";
        }else{
            mensaje="el dia de la semana no existe";
        }
        //datos de salida
        System.out.println("Ese dia toca el  curso de: "+mensaje);
    }

    public static void main(String[] args) {
       mostrarcursoDia(); 
    }
    
}