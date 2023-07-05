package calculatorOperations;

import java.util.Scanner;

public class Iphone extends Arithmetic{
    public void rectangularArea(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Duzbucaqlinin hundurluyun daxil edin");
        int height=scanner.nextInt();
        System.out.println("Duzbucaqlinin enin daxil edin");
        int width=scanner.nextInt();
        System.out.println("Duzbucaqlinin sahesi : "+height*width);
    }
}
