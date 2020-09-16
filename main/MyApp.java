package main;
import base.*;
import java.util.StringTokenizer;

/**
 * Write a description of class MyApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyApp
{
    public static int[] makeToken(String str){
        int[] result_array = new int[6];
        int changed_value = 0;
        StringTokenizer st = new StringTokenizer(str, ",");
        while(st.hasMoreTokens())
            changed_value = Integer.parseInt(st.nextToken());
            result_array.append(changed_value);
    }
    
    public static Circle makeCircle(int x, int y, int radius){
        Circle circle = new Circle(x, y, radius);
        return circle;
    }
    
    public static void main(String[] args){
        Integer[] array;
        String data = "2,3,5,2,3,10";
        array = makeToken(data);
        Circle c1 = makeCircle(array[0], array[1], array[2]);
        Circle c2 = makeCircle(array[3], array[4], array[5]);
        
        System.out.println("원1 :" + c1 + "==> 면적:" + c1.getArea());
        System.out.println("원2 :" + c2 + "==> 면적:" + c2.getArea());
        if(c1.equals(c2))
            System.out.println("같은 원");
        else
            System.out.println("서로 다른 원");
    }
}
