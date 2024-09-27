// Question 2
package Module_2;

public class Rectangle {
    float length = 1.0f;
    float width = 1.0f;

    Rectangle(){}

    Rectangle(float len, float wid){
        this.length = len;
        this.width = wid;
    }

    public float getLength(){
        return this.length;
    }

    public void setLength(float len){
        this.length = len;
    }

    public float getWidth(){
        return this.width;
    }

    public void setWidth(float wid){
        this.width = wid;
    }

    public double getArea(){
        return this.length * this.width;
    }

    public double getPerimeter(){
        return (2 * (this.length + this.width));
    }

    @Override
    public String toString(){
        return ("Rectangle [length = " +this.length+ ", width = " +this.width+ "]");
    }
}
