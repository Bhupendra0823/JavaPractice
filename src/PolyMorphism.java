import java.io.*;
public class PolyMorphism
{

    public static void main(String args[]) throws IOException
    {
        int sqArea = area(5);
        double cirArea = area(5.5);
        int recArea = area(5,4,3);    

        System.out.println("Area of Square : " + sqArea);
        System.out.println("Area of Circle : " + cirArea);
        System.out.println("Area of Rectangle :" + recArea);
    }


    public static int area(int s)
    {
        return s*s;
    }

    public static double area(double r)
    {
        return r*r*3.14;
    }

    public static int area(int l, int b, int h)
    {
        return l*b*h;
    }
}