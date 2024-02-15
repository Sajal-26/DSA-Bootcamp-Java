import java.util.*;
public class Ass18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Principal : ");
        double p = sc.nextDouble();
        System.out.print("Rate : ");
        double r = sc.nextDouble();
        System.out.print("Time : ");
        double t = sc.nextDouble();
        double ci = p*Math.pow((1+((r/100)/12)), 12 * t) - p;
        System.out.printf("Coumpund Interest : %.2f\n",ci);
        System.out.printf("Amount : %.2f", ci+p);
        sc.close();
    }
}
