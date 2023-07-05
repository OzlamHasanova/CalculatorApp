package calculatorOperations;

import java.util.Scanner;

public class Operations {
    Iphone iphone=new Iphone();
    Samsung samsung=new Samsung();

   public void operationSamsung(){
       while(true){
           Scanner scanner=new Scanner(System.in);
           System.out.println("Emeliyyati daxil edin");
           System.out.println("1.Addition" +
                   "\n2.Subtraction" +
                   "\n3.Multiplication" +
                   "\n4.Division" +
                   "\n5.Find the perimeter of the triangle");

           int action=scanner.nextInt();
           switch (action){
               case 1:
                   samsung.add();
                   break;
               case 2:
                   samsung.subtraction();
                   break;
               case 3:
                   samsung.multiplication();
                   break;
               case 4:
                   samsung.division();
                   break;
               case 5:
                   samsung.tringleOfPerimeter();
                   break;
               default:
                   System.out.println("Verilenlere uygun secim edin zehmet olmasa");
           }
       }

   }
    public void operationIphone(){

       while (true){
           System.out.println("Emeliyyati daxil et");
           System.out.println("1.Addition" +
                   "\n2.Subtraction" +
                   "\n3.Multiplication" +
                   "\n4.Division" +
                   "\n5.Find the area of the rectangle");

           Scanner scanner=new Scanner(System.in);

           int action=scanner.nextInt();

           switch (action){
               case 1:
                   iphone.add();
                   break;
               case 2:
                   iphone.subtraction();
                   break;
               case 3:
                   iphone.multiplication();
                   break;
               case 4:
                   iphone.division();
                   break;
               case 5:
                   iphone.rectangularArea();
                   break;
               default:
                   System.out.println("Verilenlere uygun secim edin zehmet olmasa");
           }
       }

    }
}
