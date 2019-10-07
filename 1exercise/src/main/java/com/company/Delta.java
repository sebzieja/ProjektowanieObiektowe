package main.java.com.company;

import java.util.*;

public class Delta {

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Insert value for a: ");
        double a = Double.parseDouble(s.nextLine());
        System.out.println("Insert value for b: ");
        double b = Double.parseDouble(s.nextLine());
        System.out.println("Insert value for c: ");
        double c = Double.parseDouble(s.nextLine());
        s.close();

        double delta = Math.sqrt(Math.pow(b, 2) - (4 * a * c));
        double answer1 = (-b + delta) / (2 * a);
        double answer2 = (-b - delta) / (2 * a);

        if (Double.isNaN(answer1) || Double.isNaN(answer2))
        {
            System.out.println("Answer contains imaginary numbers");
        } else System.out.println("The values are: " + answer1 + ", " + answer2);
    }
}
