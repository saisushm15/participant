/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package level.of.participants;

import java.util.Scanner;

/**
 *
 * @author konda babu
 */
public class LevelOfParticipants {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
            int c=0;
            
            for(int i = 1; i<=5;i++)
            {
                if(sc.nextInt()==1)
                c++;
            }
            if(c==0)
            System.out.println("Beginner");
            else if(c==1)
            System.out.println("Junior Developer");
            else if(c==2)
            System.out.println("Middle Developer");
            else if(c==3)
            System.out.println("Senior Developer");
            else if(c==4)
            System.out.println("Hacker");
            else if(c==5)
            System.out.println("Jeff Dean");
        }
        t--;
    }
}
