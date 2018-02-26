/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea3_201602694;

import java.util.Scanner;

/**
 *
 * @author Javier Mirón
 */
public class CalcularPromedio {
    
    public int MatrizContador [][] = new int [6][6];
    
    public void InicializarPromedio(){
        try{
        Menu menu = new Menu();
        Scanner lector = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\033[36m1. Ingresar Numeros");
            System.out.println("\033[36m2. Calcular Promedio");
            System.out.println("\033[36m3. Menu principal");
            System.out.print("\033[32m-Seleccione una Opcion: ");
            opcion = lector.nextInt();
            switch (opcion) {                
                case 1:
                    SaltoLinea();
                    IngresarDatos();
                    break;
                case 2:
                    SaltoLinea();
                    Promedio();
                    break;
                case 3:
                    SaltoLinea();
                    menu.MenuPrincipal();
                    break;
                default:
                    SaltoLinea();
                    System.out.println("OPCION NO VALIDA");                            
            }
        } while (opcion!=3);
        }catch(Exception e){
            SaltoLinea();
            System.out.println("\033[31mSolo se permite el ingreso de numeros");
            InicializarPromedio();
        }
    }
    
    //Genera saltos de linea para limpiar la pantalla
    public void SaltoLinea(){
        for (int i = 0; i < 50; i++) {
            System.out.println("");
        }
    }
    
    //Genera la matriz con valores predeterminados para el ID y llena al gusto del usuario
    public void IngresarDatos(){
        Scanner Entrada = new Scanner(System.in);
        for (int i=0; i < MatrizContador.length; i++) {
            for (int j=1; j < 5; j++) {
                System.out.println("Introduzca la nota [" + j + "," + i + "]");
                MatrizContador[j][i] = Entrada.nextInt();
                MatrizContador[0][0] = 1;
                MatrizContador[0][1] = 2;
                MatrizContador[0][2] = 3;
                MatrizContador[0][3] = 4;
                MatrizContador[0][4] = 5;
                MatrizContador[0][5] = 6;
            }
        }
    }
    
    //Hace los calculos de promedio y muestra la matriz con todos los datos ingresados
    public void Promedio(){
        //Se calculan los promedios
        int Prom1, Prom2, Prom3, Prom4, Prom5, Prom6;
        int Total1, Total2, Total3, Total4, Total5, Total6;
        Prom1 = MatrizContador[1][0]+ MatrizContador[2][0]+MatrizContador[3][0]+MatrizContador[4][0];
        Total1 = Prom1/4; 
        MatrizContador[5][0] = Total1;
        Prom2 = MatrizContador[1][1]+ MatrizContador[2][1]+MatrizContador[3][1]+MatrizContador[4][1];
        Total2 = Prom2/4;
        MatrizContador[5][1] = Total2;
        Prom3 = MatrizContador[1][2]+ MatrizContador[2][2]+MatrizContador[3][2]+MatrizContador[4][2];
        Total3 = Prom3/4;
        MatrizContador[5][2] = Total3;
        Prom4 = MatrizContador[1][3]+ MatrizContador[2][3]+MatrizContador[3][3]+MatrizContador[4][3];
        Total4 = Prom4/4;
        MatrizContador[5][3] = Total4;
        Prom5 = MatrizContador[1][4]+ MatrizContador[2][4]+MatrizContador[3][4]+MatrizContador[4][4];
        Total5 = Prom5/4;
        MatrizContador[5][4] = Total5;
        Prom6 = MatrizContador[1][5]+ MatrizContador[2][5]+MatrizContador[3][5]+MatrizContador[4][5];
        Total6 = Prom6/4;
        MatrizContador[5][5] = Total6;
        //Se muestran los datos:
        for (int j = 0; j < 6; j++) {
            //Muestra la matriz ordenada
            System.out.print(MatrizContador[0][j]+"\t");
            System.out.print(MatrizContador[1][j]+"\t");
            System.out.print(MatrizContador[2][j]+"\t");
            System.out.print(MatrizContador[3][j]+"\t");
            System.out.print(MatrizContador[4][j]+"\t");
            System.out.print(MatrizContador[5][j]+"\t");
            System.out.print("\n");
        }
        
    }
}
