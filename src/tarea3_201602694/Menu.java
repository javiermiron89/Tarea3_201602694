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
public class Menu {
    
    Usuarios usuario = new Usuarios();
    ContadorDigitos contadordigitos = new ContadorDigitos();
    TresNumeros tresnumeros = new TresNumeros();
    CalcularPromedio calcularpromedio = new CalcularPromedio();
    int matriz[][] = new int [5][5];
    int fila;
    int columna;
    int contador = 0;
                         
    public void MenuPrincipal(){
    try{
        Scanner lector = new Scanner(System.in);
        int opcion;
        do {
            
            System.out.println("[IPC1]Tarea3_201602694\n");
            System.out.println("\033[36m1. Usuarios");
            System.out.println("\033[36m2. Contador de digitos");
            System.out.println("\033[36m3. Tres números de mayor a menor");
            System.out.println("\033[361m4. Calcular promedio");
            System.out.println("\033[361m5. Salir");
            System.out.print("\033[32m-Seleccione una Opcion: ");
            opcion = lector.nextInt();
            switch (opcion) {                
                case 1:
                    SaltoLinea();
                    usuario.InicializarUsuarios();
                    break;
                case 2:
                    SaltoLinea();
                    contadordigitos.InicializarContador();
                    break;
                case 3:
                    SaltoLinea();
                    tresnumeros.InicializarTres();
                    break;
                case 4:
                    SaltoLinea();
                    calcularpromedio.InicializarPromedio();
                    break;
                case 5:
                    SaltoLinea();
                    System.out.println("\033[36m¡ADIOS!");
                    break;
                default:
                    SaltoLinea();
                    System.out.println("OPCION NO VALIDA");
            }
        } while (opcion != 5);
        }catch(Exception e){
            SaltoLinea();
            System.out.println("\033[31mSolo se permite el ingreso de numeros");
            MenuPrincipal();
        }
    }
    
    //Genera saltos de linea para limpiar la pantalla
    public static void SaltoLinea(){
        for (int i = 0; i < 50; i++) {
            System.out.println("");
        }
    }
}
