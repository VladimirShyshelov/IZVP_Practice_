package vladimir.shyshelov;
import java.util.Scanner; //Connecting Scanner
import vladimir.shyshelov.Line; //Connecting class Line

import vladimir.shyshelov.Summator; //Connecting class Summator
import vladimir.shyshelov.Substractor; //Connecting class Substractor

import vladimir.shyshelov.Invertor; //Connecting class Invertor

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //-------------4.1-----------------//
        System.out.println(" //-------------4.1-----------------//");
        System.out.println("Enter first dot X");
        double startX = s.nextDouble(); //Input first dot X
        System.out.println("Enter first dot Y");
        double startY = s.nextDouble(); //Input first dot Y
        System.out.println("Enter second dot X");
        double finishX = s.nextDouble(); //Input second dot X
        System.out.println("Enter second dot Y");
        double finishY = s.nextDouble(); //Input second dot X

        //Assign values
        Line l = new Line(startX, startY, finishX, finishY);

        System.out.println(l.length()); //Show line length

        //-------------4.5-----------------//
        System.out.println(" //-------------4.5-----------------//");

        System.out.println("Enter first number");
        double firstNumber = s.nextDouble(); //Input first number
        System.out.println("Enter second number");
        double secondNumber = s.nextDouble(); //Input second number

        Summator sum = new Summator(firstNumber, secondNumber);//Creating class object
        Substractor sub = new Substractor(firstNumber, secondNumber);//Creating class object

        System.out.println(sum.calc());//Show function calc() result
        System.out.println(sub.calc());//Show function calc() result

        //-------------4.10-----------------//
        System.out.println(" //-------------4.10-----------------//");

        System.out.println("Enter string");
        String str = s.nextLine();

        Invertor inv = new Invertor();
        inv.str = str;
        inv.reverse(str);
        str = inv.str;
        System.out.print("Reverser string:");
        inv.output();

        System.out.println("Enter string");
        String str1 = s.nextLine();

        Compressor com = new Compressor();
        com.str = str1;
        com.compress(str1);
        str1 = com.str;
        System.out.print("Compressed string:");
        com.output();
    }
}
