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
public class TresNumeros {
    
    public int VectorContador [] = new int [3];
    public int Numero1, Numero2, Numero3;
    public int Mayor, Medio, Menor;
    
    public void InicializarTres(){
        try{
        Menu menu = new Menu();
        Scanner lector = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\033[36m1. Ingresar numeros");
            System.out.println("\033[36m2. Mostrar ordenados");
            System.out.println("\033[36m3. Menu principal");
            System.out.print("\033[32m-Seleccione una Opcion: ");
            opcion = lector.nextInt();
            switch (opcion) {                
                case 1:
                    SaltoLinea();
                    Ingresar3Numeros();
                    break;
                case 2:
                    SaltoLinea();
                    MostrarNumero();
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
            InicializarTres();
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
    
    public void Ingresar3Numeros(){
        Scanner Entrada = new Scanner(System.in);
        System.out.println("Ingrese el primer numero:"); 
        Numero1 = Entrada.nextInt(); 
        System.out.println("Ingrese el segundo numero:"); 
        Numero2 = Entrada.nextInt(); 
        System.out.println("Ingrese el tercer numero:"); 
        Numero3 = Entrada.nextInt(); 
        if (Numero1 > Numero2 && Numero1 > Numero3) { 
        Mayor = Numero1; 
        } else if (Numero2 > Numero1 && Numero2 > Numero3) { 
        Mayor = Numero2; 
        }else { 
        Mayor = Numero3; 
        } 
        if (Numero1 < Numero2 && Numero1 < Numero3) { 
        Menor = Numero1; 
        } else if (Numero2 < Numero1 && Numero2 < Numero3) { 
        Menor = Numero2; 
        } else { 
        Menor = Numero3; 
        } 
        Medio = (Numero1 + Numero2 + Numero3) - (Mayor + Menor); 
        SaltoLinea();
    }
    
    public void MostrarNumero(){
        System.out.println("Los numero ordenados de mayor a menor son:");
        System.out.println(Mayor);
        System.out.println(Medio);
        System.out.println(Menor);
        SaltoLineaCorto();
    }
}
