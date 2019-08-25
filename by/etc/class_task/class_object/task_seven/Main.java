package by.etc.class_task.class_object.task_seven;


public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(2,4,5,3,8,9);
        System.out.println("Площадь : " + triangle.getSquare());
        System.out.println("Периметр : " + triangle.getPerimeter());
        System.out.println("Точки пересечения медиан : " + triangle.getMedian());
    }
}
