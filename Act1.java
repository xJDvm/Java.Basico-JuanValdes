//Aqui importo librerías para realizar el ejercicio.
import javax.swing.*;
import java.util.Scanner;

//Declaro la clase y tambien agrego el JFrame que lo utilizare al final del ejercicio
public class Act1 extends JFrame { 

//El metodo main que es necesario en todos los programas de java, para ejecutar.
    public static void main ( String [] args ){


        Ejemplo e = new Ejemplo();
        e.hola();

        Scanner sc = new Scanner(System.in);

        //Mensaje y lectura para ingresar los datos
        System.out.print("Ingrese el nombre del estudiante: ");
        String nombreestu = sc.next();
        System.out.print("Ingrese nota del estudiante: ");
        int notaestu = sc.nextInt();

        //Un condicional que realiza un mensaje dependiendo de la nota del estudiante para saber si reprobo o no la materia en un puntaje base de 20pts
        if (notaestu >= 10){
            System.out.println("El estudiante ha aprobado.");
        }
        else {
            System.out.println("El estudiante ha reprobado.");
        }
        System.out.println("El nombre del estudiante es " + nombreestu + " y su nota es " + notaestu);


        //A continuación lecutura de datos y mensaje que lo indica
        System.out.print("\n \nIngrese sueldo del trabajador: ");
        float sueldo = sc.nextFloat();
        System.out.print("Ingrese el precio del producto: ");
        float precio = sc.nextFloat();

        System.out.println("El sueldo del trabajador es de " + sueldo + " bs.");
        System.out.println("El precio del producto es de " + precio + " bs.");

        //Operacion que nos indica cuanto % de su sueldo gastaria si compra un producto que el precio fue ingresado .
        double porc = (precio * 100) / sueldo;
        System.out.println("El precio del producto es el " + porc + "% del sueldo del trabajador.");

        //Mensaje de saludo, con el JFrame
        JOptionPane.showMessageDialog(null, "Mi nombre es Juan Valdes, un saludo profesora.");
        }  
}
