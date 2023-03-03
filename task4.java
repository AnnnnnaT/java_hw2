// 4*. К калькулятору из предыдущего дз добавить логирование.
import java.util.logging.*;
import java.io.IOException;
import java.util.Scanner;

public class task4 {
    public static void main (String[] args) throws IOException {
        Logger logger = Logger.getLogger(task4.class.getName());
        FileHandler fh = new FileHandler("calc.txt");
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);  

        Scanner iScanner = new Scanner(System.in);
        System.out.println("Input 1st number: ");
        double n1 = iScanner.nextDouble();
                   
        System.out.println("Input what to do /,*,+,-: ");
        String oper = iScanner.next();

        System.out.println("Input 2nd number: ");
        double n2 = iScanner.nextDouble();

        iScanner.close();
    
        switch (oper){
            case "+": 
                System.out.printf("%.2f + %.2f = %.2f \n", n1, n2, n1+n2);
                logger.info("result received");
                break;
            case "/":
                if (n2==0) System.out.println("Can't divide by 0 \n");
                else System.out.printf("%.2f / %.2f = %.2f \n",n1, n2, n1/n2);
                logger.info("result received");
                break;
            case "*": 
                System.out.printf("%.2f * %.2f = %.2f \n",n1, n2, n1*n2);
                logger.info("result received");
                break;
            case "-": 
                System.out.printf("%.2f - %.2f = %.2f \n",n1, n2, n1-n2);
                logger.info("result received");
                break;
        }
        System.out.println();
    }
}
