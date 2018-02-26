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
public class Usuarios {
    public String VectorUsuarios [] = new String [5];
    public static String Matriz [][] = new String [25][80];
    public static String Nombre [] = new String [5];
    
    
    //Genera saltos de linea para limpiar la pantalla
    public void SaltoLinea(){
        for (int i = 0; i < 50; i++) {
            System.out.println("");
        }
    }
    
    public void SaltoLineaCorto(){
        for (int i = 0; i < 10; i++) {
            System.out.println("");
        }
    }
    
    public void InicializarUsuarios(){
    try{
        Menu menu = new Menu();
        Scanner lector = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\033[36m1. Ingresar Usuarios");
            System.out.println("\033[36m2. Mostrar Usuarios ascendente");
            System.out.println("\033[36m3. Mostrar Usuarios descendente");
            System.out.println("\033[36m4. Menu principal");
            System.out.print("\033[32m-Seleccione una Opcion: ");
            opcion = lector.nextInt();
            switch (opcion) {
                case 1:
                    SaltoLinea();
                    IngresoUsuarios();
                    break;
                case 2:
                    SaltoLinea();
                    UsuariosAscendente();
                    break;
                case 3:
                    SaltoLinea();
                    UsuariosDescendentes();
                    break;
                case 4:
                    SaltoLinea();
                    menu.MenuPrincipal();
                    break;
                default:
                    SaltoLinea();
                    System.out.println("OPCION NO VALIDA");                            
            }
        } while (opcion!=4);
        }catch(Exception e){
            SaltoLinea();
            System.out.println("\033[31mSolo se permite el ingreso de numeros");
            InicializarUsuarios();
        }
    }
    
    public void IngresoUsuarios(){
        Scanner Ingreso = new Scanner(System.in);
        String nombre;
        for (int i = 0; i < VectorUsuarios.length; i++) {
            System.out.println("Ingrese el nombre: " + (i+1));
            nombre = Ingreso.nextLine();
            VectorUsuarios[i] = nombre;
        }
        for (String i: VectorUsuarios) {
            System.out.println(i);
        }
        SaltoLinea();
    }
    
    public void UsuariosAscendente(){
        System.out.println("Los usuarios en orden ascendente son:");
        System.out.println(VectorUsuarios[4]);
        System.out.println(VectorUsuarios[3]);
        System.out.println(VectorUsuarios[2]);
        System.out.println(VectorUsuarios[1]);
        System.out.println(VectorUsuarios[0]);
        SaltoLineaCorto();
    }
    
    public void UsuariosDescendentes(){
        System.out.println("Los usuarios en orden descendente son:");
        for (String i: VectorUsuarios) {
            System.out.println(i);
        }
        SaltoLineaCorto();
    }
    
}
