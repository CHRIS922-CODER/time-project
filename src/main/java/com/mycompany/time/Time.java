

package com.mycompany.time;

import java.util.Scanner;


public class Time {

    public static void main(String[] args) {
            int years;
       int months;
       int days;
       int hours;
       int mins;
       int secs;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of seconds");
        int seconds = input.nextInt();
        
        years = seconds/31104000;
        months = (seconds%31104000)/2592000;
        days = ((seconds%31104000)%2592000)/86400;
        
        hours = (((seconds%31104000)%2592000)%86400)/3600;
        mins = ((((seconds%31104000)%2592000)%86400)%3600)/60;
        secs = ((((seconds%31104000)%2592000)%86400)%3600)%60;
        
        System.out.println(years + " years "+ months +"  months " + hours + "  hours "+ mins + "  mins " + secs + " secs");
    }
}
