package vladimir.shyshelov;

public class Summator {
    double x; //First number
    double y; //Second number

    public Summator(double firstNum, double secondNum){ //Constructor
        this.x = firstNum;
        this.y = secondNum;
    }

    public double calc(){ //Method returns sum x and y
        return x+y;
    }
}