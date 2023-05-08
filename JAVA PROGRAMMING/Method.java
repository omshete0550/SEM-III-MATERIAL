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

class Method
{
  public static void main(String[] args)
  {
    ShapeArea s = new ShapeArea();
    System.out.println("Area of Square: "+s.Shape(10));
    System.out.println("Area of Rectangle: "+s.Shape(20,30));
    System.out.println("Area of Circle: "+s.Shape(2.5));
    
  }
}