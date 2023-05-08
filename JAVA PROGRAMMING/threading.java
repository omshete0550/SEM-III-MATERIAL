class A extends Thread
  {
    public void run()
    {
      int i;
      for(i=1; i<16; i++)
        {
		  if(i%2!=0)
          {
			try
              {
                Thread.sleep(1000);
				System.out.println(i);
              }
            catch(InterruptedException e)
              {}
            
			
          }
        }
    }
  }

class B implements Runnable
  {
    public void run()
    {
      int i;
      for(i=1; i<16; i++)
        {
          if(i%2==0)
          {
			try
              {
                Thread.sleep(1000);
				System.out.println(i);
              }
            catch(InterruptedException e)
              {}
            
			
          }
        }
    }
  }

class threading
{
  public static void main(String[] args)
  {
	 System.out.println("Numbers from 1 to 15: ");
    A a = new A();
    a.start();

    B b = new B();
    Thread t1 = new Thread(b);
    t1.start();
  }
}