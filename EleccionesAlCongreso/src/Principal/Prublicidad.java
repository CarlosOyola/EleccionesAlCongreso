/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import java.util.Scanner;

/**
 *
 * @author holma
 */
public class Prublicidad {

    int Publicidad() {
        Scanner t = new Scanner(System.in);
        int opcion = 0;
        while (opcion != 4) {
            System.out.print("\t\ndigite el metodo publicitario que mas lo influencio \n"
                    + "\n1.television "
                    + "\n2.radio "
                    + "\n3.internet "
                    + "\n4.salir \n"
                    + "\nopcion: ");
            opcion = t.nextInt();
            break;
        }
        return opcion;
    }
}
