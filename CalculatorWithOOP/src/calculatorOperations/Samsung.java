package calculatorOperations;

import java.util.Scanner;

public class Samsung extends Arithmetic{
    public void tringleOfPerimeter(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Ucbucagin birinci terefin daxil edin");
        int side1=scanner.nextInt();
        System.out.println("Ucbucagin ikinci terefin daxil edin");
        int side2=scanner.nextInt();
        System.out.println("Ucbucagin ucuncu terefin daxil edin");
        int side3=scanner.nextInt();
        int perimeter=side1+side2+side3;
        System.out.println("Ucbucagin perimetri : "+perimeter);
    }
}
