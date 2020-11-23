
package palindromo;

import java.util.Scanner;

public class Palindromo {
    
    
    

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String palabra;       
        int inicio = 0, fin;
        
        
        while (true) {            
            System.out.println("Ingresa la palabra:");
            palabra = kb.nextLine();
            
            if (Comprobrar(palabra) == true) {
                System.out.println(palabra.toUpperCase() + " si es un palindoromo");
            }else{
                System.out.println(palabra.toUpperCase() + " no es un palindoromo");
            }         
        }
        
        
        
    }
    
    public static boolean Comprobrar(String palabra){
        int inicio = 0, fin;
        char [] palindromo ;
        palindromo = palabra.toCharArray();
        fin = palindromo.length-1;
        
        while(inicio < fin){
            if(palindromo[inicio] == palindromo[fin]){
                fin --;
                inicio ++;
            }else{
                return false;
            }
        }
        
        if (inicio == fin) {
            return true;
        }else{
            return false;
        }
        
    }
    
}
