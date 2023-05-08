class ExceptionH
{
  static void Throw()
  {
    try
    {
      throw new NullPointerException("Throw");    
    }
    catch(NullPointerException e)
    {
      System.out.println("Caught insdie Throw.");
      throw e;    //rethrow exception
    }
  }

  static void Throws() throws IllegalAccessException
  {
    System.out.println("Inside throws");
    throw new IllegalAccessException("test");
  }

  
  public static void main(String[] args)
  {
    int a, d;
    System.out.println("First Built-in Exception : ");
    try
      {
        //monitor block of code
        d = 0;
        a = 31/d;
      }
    catch(ArithmeticException e)
      {
        //catch divide-by-zero error
        System.out.println("Division by zero.");
      }
    
    System.out.println();
    System.out.println("Second Built-in Exception : ");
    try
    {
      Throw();
    }
    catch(NullPointerException e)
    {
      System.out.println("Recaught: "+e);
    } 

    System.out.println();
    System.out.println("Third Built-in Exception : ");
    try
    {
      Throws();
    }
    catch(IllegalAccessException e)
    {
      System.out.println("Caught "+e);
    } 
      
  }
}