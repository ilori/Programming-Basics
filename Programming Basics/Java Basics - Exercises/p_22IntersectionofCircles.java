import java.util.Arrays;
import java.util.Scanner;

public class p_22IntersectionofCircles {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int[] firstInput = Arrays.stream(console.nextLine().split("\\s")).mapToInt(Integer::parseInt).toArray();
        int[] secondInput = Arrays.stream(console.nextLine().split("\\s")).mapToInt(Integer::parseInt).toArray();
        int firstX = firstInput[0];
        int firstY = firstInput[1];
        int firstRadius = firstInput[2];
        int secondX = secondInput[0];
        int secondY = secondInput[1];
        int secondRadius = secondInput[2];
        Point firstPoint = new Point(firstX, firstY);
        Point secondPoint = new Point(secondX, secondY);
        Circle c1 = new Circle(firstPoint, firstRadius);
        Circle c2 = new Circle(secondPoint, secondRadius);
        if (intersect(c1, c2)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }

    private static boolean intersect(Circle c1, Circle c2) {
        Point a = c1.getCenter();
        Point b = c2.getCenter();
        int firstX = a.getX();
        int secondX = b.getX();
        int firstY = a.getY();
        int secondY = b.getY();
        int radius = c1.getRadius() + c2.getRadius();
        return Math.abs(firstX - secondX + firstY - secondY) <= radius;

    }
}

class Circle {
    private Point center;
    private int radius;

    Point getCenter() {
        return center;
    }


    int getRadius() {
        return radius;
    }

    Circle(Point center, int radius) {
        this.center = center;
        this.radius = radius;
    }
}

class Point {
    private int x;
    private int y;

    int getX() {
        return x;
    }

    int getY() {
        return y;
    }

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
