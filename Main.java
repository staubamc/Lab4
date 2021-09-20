import java.util.Random; 

class Main {
  public static void main(String[] args) {
    
    Random r = new Random();
    int randomNum = r.nextInt(50)+1;
    int newRandom = randomNum; 
    System.out.println("The Random number is: " + newRandom);
     System.out.println("\n");

    if (newRandom > 0){
      while (newRandom >= 0) {
        System.out.println(newRandom);
        newRandom-- ;
      }
    }

    System.out.println("\n");

    if (randomNum <= 5) {
            System.out.println("Ahoy mateys!");
          }
        else{
          if (randomNum >= 25 && randomNum <= 42) {
            System.out.println("Cannonball!");
          }
        else {
         System.out.println("Blast off!");
        }
        }
  }
}