import java.util.Scanner;
public class BasicCalculator{
    public static void main(String[] args) {
        Double n1,n2,res;
        int oper;
        Scanner s = new Scanner(System.in);
        System.out.println("BASIC CALCULATOR");
        System.out.println("================");
        System.out.println("This is a basic calculator that performs four operations:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.println("Enter the operation you want to perform (1-4):");
        oper = s.nextInt();
        System.out.println("Enter the first number:");
        n1 = s.nextDouble();
        System.out.println("Enter the second number:");
        n2 = s.nextDouble();
        switch (oper) {
            case 1:
                res = n1 + n2;
                System.out.println("Result:");
                System.out.println(n1+" + "+n2+" = "+res);
                break;
            case 2:
                res = n1 - n2;
                System.out.println("Result:");
                System.out.println(n1+" - "+n2+" = "+res);
                break;
            case 3:
                res = n1 * n2;
                System.out.println("Result:");
                System.out.println(n1+" * "+n2+" = "+res);
                break;
            case 4:
                if(n2==0){
                    System.out.println("Cannot divide a number by 0! Enter again:");
                    n2 = s.nextDouble();
                    
                }
                res = n1 / n2;
                System.out.println("Result:");
                System.out.println(n1+" / "+n2+" = "+res);
                break;
            default:
                System.out.println("Invalid Operator!");
                break;
        }
        s.close();   
    }
}