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
    for(n = 1; n<= x; n ++){
      double sum = Math.random();
      sum += sum;
      double quotient = sum / x;
      if( n == x){
      System.out.println(quotient);
      }
    }
  }

  public static void main(String[] args) {
    nHellos(19);

    // testing of static methods goes here

  }
}