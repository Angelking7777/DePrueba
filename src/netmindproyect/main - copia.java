package netmindproyect;

import java.util.Scanner;
// Estamos en el brach2
/** * @author Acorp  */
public class main {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
//        System.out.println("Enter your age: ");
//        int age = user_input.nextInt();
//         
//        switch (age) {
//            case 0: case 1: case 2: case 3: case 4: case 5: case 6: case 7: case 8: case 9: case 10:
//                System.out.println(age + " is between 0  and 10");
//                break;
//            case 11: case 12: case 13: case 14: case 15: case 16: case 17: case 18: case 19: case 20:
//                System.out.println(age + " is between 11  and 20");
//                break;    
//            case 21: case 22: case 23: case 24: case 25: case 26: case 27: case 28: case 29: case 30:
//                System.out.println(age + " is between 21  and 30");
//                break;
//            default:
//                System.out.println("YOu are over 30");
//        }
        
        
        int loopVal;
        int end_value = 11;
        int addition = 0;
        int times_table = 0;
        
        System.out.println("Which times table do you want?");
        times_table = user_input.nextInt();
        for (loopVal = 0; loopVal < end_value; loopVal++) {
            addition = loopVal *  times_table;
            System.out.println(loopVal + " times " + times_table + " = "+ addition);
        }
        
        
    }
}
