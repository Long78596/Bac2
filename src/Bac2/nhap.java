package Bac2;

import java.util.Scanner;

/**
 */
public class nhap {

    
    public double[] Input() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập hệ số a: ");
        double a = scanner.nextDouble();

        System.out.print("Nhập hệ số b: ");
        double b = scanner.nextDouble();

      
        System.out.print("Nhập hệ số c: ");
        double c = scanner.nextDouble();

        
        return new double[]{a, b, c};
    }
}
