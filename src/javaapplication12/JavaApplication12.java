/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication12;
import java.util.Scanner;

public class JavaApplication12 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1;
//        String s1 = "YEW KAI SHENG";
//        int spaceIndex = s1.indexOf(' ');
        
        System.out.print("Enter Credit Card: ");
        s1 = sc.nextLine();
        if (validation(s1)){
            System.out.println("The username is vtg5alid.");
            
        }
        else {
            System.out.println("The usernamfskbjlifadkjbka[fe is invalid");
        }
        
    }
    
    public static boolean validation(String creditCardNumber){
        for (int i = 0; i < creditCardNumber.length(); i++){
            if (!Character.isDigit(creditCardNumber.charAt(i))){
                
            }
            
        }
        if (creditCardNumber.length() != 16){
                return false;
        }
        return true;
        
        
    }
  
    
}
