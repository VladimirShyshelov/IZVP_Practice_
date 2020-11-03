package vladimir.shyshelov;
import vladimir.shyshelov.Dot; //Connecting class Dot

public class Line {
    Dot startPoint = new Dot(); //Creating line start point
    Dot finishPoint = new Dot(); //Creating line end point

    public Line(double x1, double y1, double x2, double y2){ //Constructor
        this.startPoint.x = x1;
        this.startPoint.y = y1;

        this.finishPoint.x = x2;
        this.finishPoint.y = y2;
    }
    public Line(){ //Default constructor
        this.startPoint.x = 0;
        this.startPoint.y = 0;

        this.finishPoint.x = 0;
        this.finishPoint.y = 0;
    }

    public double length(){ //Function returns line length
        return Math.sqrt(Math.pow(finishPoint.y - startPoint.y,2) + Math.pow(finishPoint.x - startPoint.x,2));
    }
}
