package base;
import myInterface.Shape;

/**
 * 여기에 Circle 클래스 설명을 작성하십시오.
 * 
 * @author (2019315015 김민수) 
 * @version (2020.09.16)
 */
public class Circle implements Shape
{
    public int x;
    public int y;
    public int radius;
    
    public Circle(int x, int y, int radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    
    public double getArea(){
        return radius * radius * PI;
    }
    
    @Override
    public boolean equals(Object obj){
        Circle c = (Circle)obj;
        if(this.x == c.x && this.y == c.y)
            return true;
        else
            return false;
    }
}
