package by.etc.class_task.class_object.task_seven;

public class Triangle {
    private double x1;
    private double x2;
    private double x3;
    private double y1;
    private double y2;
    private double y3;

    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
        this.y1 = y1;
        this.y2 = y2;
        this.y3 = y3;
    }
    private double getSide(double x1, double y1,double x2, double y2){
        return Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
    }

    public double getSquare() {
        double ab = getSide(x1, y1, x2, y2);
        double bc = getSide(x2, y2, x3, y3);
        double ca = getSide(x3, y3, x1, y1);

        double p = (ab + bc + ca) / 2;

        return Math.sqrt(p * (p - ab) * (p - bc) * (p - ca));
    }

    public double getPerimeter() {
        double ab = getSide(x1, y1, x2, y2);
        double bc = getSide(x2, y2, x3, y3);
        double ca = getSide(x3, y3, x1, y1);

        return ab + bc + ca;
    }

    public String getMedian(){
        double x;
        double y;

        x = (x1 + x2 + x3) / 3;
        y = (y1 + y2 + y3) / 3;
        return "x = " + x + " y = " + y + " ";
    }
}
