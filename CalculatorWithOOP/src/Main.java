import calculatorOperations.Operations;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Telefon markanizi secin"+
                "\n1.Samsung" +
                "\n2.Iphone");

        Scanner scanner=new Scanner(System.in);
        int marka=scanner.nextInt();

        Operations operation=new Operations();

        if(marka==1){
            operation.operationSamsung();
        } else if (marka==2) {
            operation.operationIphone();

        }else{
            System.out.println("teklif edilenlerden kenar secim etmeyin");
        }
    }
}