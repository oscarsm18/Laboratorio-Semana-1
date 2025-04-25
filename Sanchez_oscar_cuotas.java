/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sanchez_oscar_cuotas;

/**
 *
 * @author oscarsanchez
 */
import java.util.Scanner;
public class Sanchez_oscar_cuotas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Cuotas Mensuales
    Scanner sin = new Scanner(System.in);
    
    System.out.print(" La cantidad del préstamo es de: ");
    int prestamo = sin.nextInt();
    
    System.out.print(" El tiempo a pagar el préstamo es: ");
    int tiempo = sin.nextInt();
    
    System.out.print(" La comisión por cuota es de: ");
    double comision = sin.nextDouble();
            
    System.out.print(" La cuota de pago mensual es: ");
    double cuota_pago = comision*prestamo;
    
    System.out.print(" El total a pagar es: ");
    double total_pagar = cuota_pago+prestamo;
    
    System.out.println("**** CUOTAS MENSUALES *******");
    System.out.println(" Cantidad de préstamo: "+prestamo+"\n");
    System.out.println(" Tiempo a pagar: "+tiempo+"\n");
    System.out.println(" Comisión por cuota: "+comision+"\n");
    System.out.println(" La cuota de pago es: "+cuota_pago+"\n");
    System.out.println(" El total a pagar es: "+total_pagar+"\n");
     
    sin.close();
    }
    
}
