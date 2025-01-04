package ClassDesignPGLch42;

import java.util.Scanner ;

public class TestCone
{
  public static void main( String[] args ) 
  {
    Scanner scan = new Scanner(System.in);

    double radius, height;

    System.out.print("Enter radius: " ); 
    radius = scan.nextDouble();

    System.out.print("Enter height: " ); 
    height = scan.nextDouble();
 
    Cone cone = new Cone( radius, height );

    System.out.println( "Area "  + cone.area() + " Volume: " + cone.volume() );
  }
}


class Cone
{
  private double radius;  // radius of the base
  private double height;  // height of the cone
  
  public Cone( double radius, double height )
  {
    this.radius = radius;
    this.height = height;
  }
  
  public double area()
  {
    return Math.PI*radius*(radius + Math.sqrt(height*height + radius*radius) );
  }
  
  public double volume()
  {
    return Math.PI*radius*radius*height/3.0;  
  }
  
}
