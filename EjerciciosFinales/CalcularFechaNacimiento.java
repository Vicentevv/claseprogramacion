package EjerciciosFinales;

import java.util.Scanner;

public class CalcularFechaNacimiento {
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        System.out.println("Ingrese la Fecha actual: ");
        System.out.println("Año actual: ");
        int año_actual = Teclado.nextInt();
        System.out.println("Mes actual: ");
        int mes_actual = Teclado.nextInt();
        System.out.println("Día actual: ");
        int dia_actual = Teclado.nextInt();
        System.out.println("Ingrese su Fecha de nacimiento: ");
        System.out.println("Año: ");
        int año_nac = Teclado.nextInt();
        System.out.println("Mes: ");
        int mes_nac = Teclado.nextInt();
        System.out.println("Día: ");
        int dia_nac = Teclado.nextInt();
        int año = (año_actual - año_nac);
        int meses = (mes_actual - mes_nac);
        int dias = (dia_actual - dia_nac);
        System.out.println("Usted tiene "+año+" años,con "+meses+" meses y "+dias+" días.");
    }
}
