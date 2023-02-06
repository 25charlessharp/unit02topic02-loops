public class Loops {

  public static void nHellos(int x){
    int n = 1;
    for(n = 1; n <= x; n ++){
      if(n % 10 == 1){
        System.out.println(n + "st Hello");
      }
      else if(n % 10 == 2){
      System.out.println(n + "nd Hello");
    }
      else if(n % 10 == 3){
        System.out.println(n + "rd Hello");
      }
      else{
        System.out.println(n + "th Hello");
      }
    }
  }

  public static void main(String[] args) {
    nHellos(999);

    // testing of static methods goes here

  }
}