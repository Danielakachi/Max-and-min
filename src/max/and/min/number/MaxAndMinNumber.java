/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package max.and.min.number;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Dell E6540
 */
public class MaxAndMinNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        TO get length of Number
        int lengthOfNumber=Integer.parseInt( JOptionPane.showInputDialog("How many numbers are you entering") );
//      TO initialize the array to store all the number

        int []num=new int[lengthOfNumber];
//      To recieve input from user and store in array

        for (int i = 0; i <lengthOfNumber; i++) {
            num[i]= Integer.parseInt(JOptionPane.showInputDialog("Enter "+"Number "+(i+1)));
            
        }
//      to set the max and min        
        int max=num[0]; int min=num[0];

//        to get maximum
        for (int i = 0; i < num.length; i++) {
            if (num[i]>max) {
                max=num[i];
            }
        }
//      to get min
        
        for (int i = 0; i < num.length; i++) {
            if (num[i]<min) {
                min=num[i];
            }
        }
        
        JOptionPane.showMessageDialog(null,"The maximum number is "+max+" and the minimum number is "+min,"result",JOptionPane.INFORMATION_MESSAGE);
        
        
        
    }
    
}
