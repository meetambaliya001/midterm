/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */import java.util.Scanner;
import static java.time.Clock.system;
 
public class Arithmetic {


/** This class calls the method to perform 
 * arithmetic operations based on user input
 * execute the code check the output
 * @author sivagamasrinivasan
 * 
 */
    public static void main(String[] args) {
        ArithmeticBase r = new ArithmeticBase();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        Operation operation = getOperationFromUser();
        double result = r.calculate(m, n, operation);
        System.out.println("Result: " + result);
    }
    
    private static Operation getOperationFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter arithmetic operation to Perform (1: PLUS, 2: MINUS, 3: TIMES, 4: DIVIDE): ");
        int input = scanner.nextInt();
        switch (input) {
            case 1: return Operation.PLUS;
            case 2: return Operation.MINUS;
            case 3: return Operation.TIMES;
            case 4: return Operation.DIVIDE;
            default: throw new IllegalArgumentException("Invalid arithmetic operation selected");
        }
    }

}

enum Operation {
    PLUS,
    MINUS,
    TIMES,
    DIVIDE
}