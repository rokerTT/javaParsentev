/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sergey Vasilev
 */
public class Calculate {
    
    public static void main(String[] arg){
        
        System.out.println("Calculate...");
        Double first = Double.valueOf(arg[0]);
        Double second = Double.valueOf(arg[1]);
        Double summ = first + second;
        Double sub = first - second;
        Double div = first / second;
        Double mult = first * second;
        Double pow = Math.pow(first, second);
        System.out.println("Summ = "+summ);
        System.out.println("Subscription = "+sub);
        System.out.println("div = "+div);
        System.out.println("Mult = "+mult);
        System.out.println("Rait = "+pow);
    }
}
