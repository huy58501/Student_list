/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week1;

/**
 *
 * @author chuong5850
 */
public class Week1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char[] myWord = new char[7];
        myWord[0] = 's';
        myWord[1] = 't';
        myWord[2] = 'u';
        myWord[3] = 'd';
        myWord[4] = 'e';
        myWord[5] = 'n';
        myWord[6] = 't';
        
        for (int i=0;i<myWord.length;i++){
            System.out.print(myWord[i]);
        }
        System.out.println("Printing the reverse ....:");
        
        for (int j= myWord.length-1; j>=0; j--){
        System.out.print(myWord[j]);
    }
    }
    
}
