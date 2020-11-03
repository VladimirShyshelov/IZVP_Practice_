package vladimir.shyshelov;

public class Substractor {
    double x; //First number
    double y; //Second number

    public Substractor(double firstNum, double secondNum){//Constructor
        this.x = firstNum;
        this.y = secondNum;
    }

    public  double calc(){ // Method returns subtraction of x and y
        return x-y;
    }
}
