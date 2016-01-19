import java.util.Scanner;

/**
 * Qualtrics Interview Question
 * Find if 2 rectangles overlap with each other
 *
 * Created by Bryan Tamada on 1/18/16.
 */
public class OverlappingRectangles {

    static class Rectangle {
        Point upperLimit;
        Point lowerLimit;
        int width;
        int height;
        public Rectangle() {}
        public Rectangle(Point myUL) {
            this.upperLimit.x = myUL.x;
            this.upperLimit.y = myUL.y;
        }
    }

    static class Point {
        int x;
        int y;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Point p1 = new Point();
        Point p2 = new Point();
        Point p1Lower = new Point();
        Point p2Lower = new Point();
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle();
        System.out.print("Select the upper limit for X: ");
        p1.x = sc.nextInt();
        System.out.print("Select the upper limit for Y: ");
        p1.y = sc.nextInt();
        r1.upperLimit = p1;

        while(r1.width == r1.height) {
            System.out.print("Select the width: ");
            r1.width = sc.nextInt();
            System.out.print("Select the height: ");
            r1.height = sc.nextInt();
        }

        p1Lower.x = r1.upperLimit.x + r1.width;
        p1Lower.y = r1.upperLimit.y - r1.height;

        System.out.print("Select the upper limit for X: ");
        p2.x = sc.nextInt();
        System.out.print("Select the upper limit for Y: ");
        p2.y = sc.nextInt();
        r2.upperLimit = p2;

        while(r2.width == r2.height) {
            System.out.print("Select the width: ");
            r2.width = sc.nextInt();
            System.out.print("Select the height: ");
            r2.height = sc.nextInt();
        }

        p2Lower.x = r2.upperLimit.x + r2.width;
        p2Lower.y = r2.upperLimit.y - r2.height;

        System.out.println(isOverlapping(r1,r2,p1Lower,p2Lower));
    }

    static boolean isOverlapping(Rectangle r1, Rectangle r2, Point p1Lower, Point p2Lower) {
        if(r1 == null || r2 == null || p1Lower == null || p2Lower == null) return false;
        boolean isOverlapping = false;
        if(r2.upperLimit.x <= p1Lower.x && r2.upperLimit.y >= p1Lower.y && p2Lower.x >= r1.upperLimit.x && p2Lower.y <= r1.upperLimit.y)
            isOverlapping = true;
        return isOverlapping;
    }

}


