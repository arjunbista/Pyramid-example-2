
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class Pyramid2 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to repeat iterations: ");
        int term = sc.nextInt();
        
        for(int i=1;i<=term;i++){
            for(int j=term;j>=i;j--){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
}
