import java.util.*;

class Data {
  Scanner sc = new Scanner(System.in);
  int getData()
  {
    System.out.println("Enter a number");
    int num = sc.nextInt();
    return num;
  }
  
}

class Product {
  public static void main(String A[]) {
    Data d = new Data();
    int num1 = d.getData();
    int num2 = d.getData();
    
    
    System.out.println("Product is "+(num1*num2));
  }
}
