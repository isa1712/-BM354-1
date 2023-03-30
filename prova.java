package prova;

import java.util.Scanner;

public class prova {
    public static void main (String[] args){
   int num;
  
   Scanner sc = new Scanner (System.in);
   try{

   System.out.println("Digite um numero: ");
   num = sc.nextInt();

   System.out.println("O número é:" + num);
   sc.close();
   }catch(Exception e){
    System.out.println("só aceita numeros");
   }

    }
    
}
