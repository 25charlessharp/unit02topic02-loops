import java.lang.Math;
public class Loops {

  public static void nHellos(int x){
    int n = 1;
    for(n = 1; n <= x; n ++){
      if(n % 10 == 1){
        if(n % 100 == 11){
        System.out.println(n + "th Hello");
        }
        else{
        System.out.println(n + "st Hello");
        }
      }
      else if(n % 10 == 2){
        if(n % 100 == 12){
          System.out.println(n + "th Hello");
        }
        else{
      System.out.println(n + "nd Hello");
        }
    }
      else if(n % 10 == 3){
        if(n % 100 == 13){
          System.out.println(n + "th Hello");
        }
        else{
        System.out.println(n + "rd Hello");
        }
      }
      else{
        System.out.println(n + "th Hello");
      }
    }
  }

  public static void nRandoms(int x){
    int n = 1;
    double sum2 = 0;
    for(n = 1; n<= x; n ++){
      double sum1 = Math.random();
      System.out.println("Random " + n +" "+ sum1);
      sum2 += sum1;
      double quotient = sum2 / x;
      if(n == x){
      System.out.println("The average is " + quotient);
      }
    }
  }
  

  public static boolean isPrime(int x){
    int n = 2;
    boolean result = true;
    for(n = 2; n < (x/2); n++){
      if(x % n == 0){
        result = false;
      }
    }
    return result;
  }

  public static void main(String[] args) {
    System.out.println(isPrime(59));

    // testing of static methods goes here

  }
}