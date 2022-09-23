/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex5_2;

import com.sun.org.apache.xpath.internal.patterns.NodeTest;
import java.util.Scanner;

/**
 *
 * @author Tinip
 */
public class Ex5_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LiveScoreBean livescorebean = new LiveScoreBean();
        Subscriber sub1 = new Subscriber();
        Subscriber sub2 = new Subscriber();
        livescorebean.addPropertyChangeListener(sub1);
        livescorebean.addPropertyChangeListener(sub2);
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Score:");
        String score = input.nextLine();
        while(!score.equals("")){
            livescorebean.setSampleProperty(score);
            System.out.print("Enter Score :");
            score = input.nextLine();
        }
    }
    
}
