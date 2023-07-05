package calculatorOperations;

import java.util.Scanner;

public class Arithmetic {
    public void add(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Birinci toplananani daxil edin");
        int number1=scanner.nextInt();
        System.out.println("Ikinci toplananani daxil edin");
        int number2=scanner.nextInt();
        System.out.println(number1+number2);

    }
    public void subtraction(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("1ci heddi daxil edin");
        int number1=scanner.nextInt();
        System.out.println("2ci heddi daxil edin");
        int number2=scanner.nextInt();
        System.out.println(number1-number2);
    }
    public void multiplication(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("1ci heddi daxil edin");
        int number1=scanner.nextInt();
        System.out.println("2ci heddi daxil edin");
        int number2=scanner.nextInt();
        System.out.println(number1*number2);
    }
    public void division(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("1ci heddi daxil edin");
        int number1=scanner.nextInt();
        System.out.println("2ci heddi daxil edin");
        int number2=scanner.nextInt();
        if(number2==0){
            System.out.println("0 a bolme yoxdur");
        }else{

            System.out.println(number1/number2);
        }

    }
}
