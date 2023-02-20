
import java.util.Arrays;
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


  public static void getFactors(int n){
    int x = 1;
    int factors = 0;
    for(x = 1; x <= n; x ++){
      if(n % x == 0){
        factors ++;
      }
    }
    int [] array = new int [factors];
    int addToArray = 0;
    int z = 1;
    for(z = 1; z <= n; z ++){
      if(n % z == 0){
        array[addToArray] = z;
        addToArray++;
      }
    }
    System.out.println(Arrays.toString(array));
  }


  private static int rollDie(){
    int result = (int) (Math.random()*6) + 1;
    return result;
  }

  public static void pepysSimulation(int n){
    double number = 1000000;
    double rollSixTimes = 0;
    double rollTwelveTimes = 0;
    double roll = 0;
    for(roll = 0; roll < number; roll ++){
      for(int a = 0; a < 6; a ++){
        rollDie();
        if(rollDie() == 1){
          rollSixTimes++;
          a = 6;
        }
      }
    }
    System.out.println("The percent you get when rolling a fair 6 sided die 6 times and at least getting a one is " + (rollSixTimes/number) * 100 + "%");
    roll = 0;
    int c = 0;
    for(roll = 0; roll < number; roll ++){
      for(int b = 0; b < 12; b ++){
        rollDie();
        if(rollDie() == 1){
          c ++;
        }
        if (c == 2){
          rollTwelveTimes ++;
          c = 0;
          b = 12;
        }
      }
    }
    System.out.println("The percent you get when rolling a fair 6 sided die 12 times and at least getting a one twice is " + (rollTwelveTimes/number) * 100 + "%");


  }
  

  public static void main(String[] args) {
    pepysSimulation(1);

    // testing of static methods goes here

  }
}