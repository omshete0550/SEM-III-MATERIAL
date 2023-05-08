class ShapeArea
{
  //overload test for area of square
  int Shape(int a)
  {
    return a*a;
  }

  //overload test for area of rectangle
  int Shape(int a, int b)
  {
    return a*b;
  }

  //overload test for area of circle
  double Shape(double r)
  {
    return 3.14*r*r;
  }
}

class Constructor
{
  public static void main(String[] args)
  {
    ShapeArea s1 = new ShapeArea();
    ShapeArea s2 = new ShapeArea();
    ShapeArea s3 = new ShapeArea();
    System.out.println("Area of Square: "+s1.Shape(10));
    System.out.println("Area of Rectangle: "+s2.Shape(2,30));
    System.out.println("Area of Circle: "+s3.Shape(6.3));
    
  }
}