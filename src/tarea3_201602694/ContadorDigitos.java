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
public class ContadorDigitos {
    
    int ContadorNumero;
    int contadorDigitos = 0;
    
    public void InicializarContador(){
        try{
        Menu menu = new Menu();
        Scanner lector = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\033[36m1. Ingresar numero");
            System.out.println("\033[36m2. Mostrar numero de digitos");
            System.out.println("\033[36m3. Menu principal");
            System.out.print("\033[32m-Seleccione una Opcion: ");
            opcion = lector.nextInt();
            switch (opcion) {                
                case 1:
                    SaltoLinea();
                    IngresarDigito();
                    break;
                case 2:
                    SaltoLinea();
                    MostrarDigitos();
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
            InicializarContador();
        }
    }
    
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
    
    public void IngresarDigito(){
        Scanner contador = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        ContadorNumero = contador.nextInt();
        while(ContadorNumero!=0){
            ContadorNumero = ContadorNumero/10;
            contadorDigitos++;
        }
        
        SaltoLineaCorto();
    }
    
    public void MostrarDigitos(){
        System.out.println("El número tiene " + contadorDigitos+ " cifras");
    }
    
}
