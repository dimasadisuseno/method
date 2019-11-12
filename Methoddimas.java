/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methoddimas;

/**
 *
 * @author dimaspc
 */
public class Methoddimas {

    static void checkIPK(double ipk) {
    
     if(ipk > 3.5){
      System.out.println("lulus cumlaude");
    }
      else if(ipk > 3.0){
      System.out.println("lulus memuaskan");  
    }
      else if(ipk > 2.5){
      System.out.println("lulus cukup");
    }
      else{
      System.out.println("kuliah cuma bayar turu ae enak");
      }
    }
      
    public static void main(String[] args) {
     checkIPK(2.49);//;(2.5 - 3.6 )
             }
    }    

