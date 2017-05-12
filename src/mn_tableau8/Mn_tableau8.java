/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mn_tableau8;
import java.util.Scanner;
/**
 *
 * @author MOUSTAPHA
 */
public class Mn_tableau8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
        char[]table;
        int n;
        String str;
        char carac;
        Scanner sc=new Scanner(System.in);
        str=sc.nextLine();
        carac=str.charAt(0);
         System.out.println("Entrez_le_nombre_d'elements:_");
         n=sc.nextInt();
         table=new char[n];
         for(int i=0;i<table.length;i++){
              System.out.println("Entrez_le_caractere_"+(i+1)+":_");
              table[i]=str.charAt(0);
         }
          System.out.println("Voici_le_tableau:_");
          for(int i=0;i<table.length;i++){
               System.out.println("_"+table[i]);   
          }
          sc.nextLine();
        
    }
    
}
