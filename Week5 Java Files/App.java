package week5;

public class App {
  //9. create a class named App that has a main method.
  public static void main(String[] args) {
    // 10. In this class instantiate an instance of each of your logger classes
    //     that implement the Logger interface.
    
    //11. Test both methods on both instances, passing in Strings of your choice.
    
    // log and error method of AsteriskLogger
    Logger asterisks = new AsteriskLogger();
    asterisks.Log("Important");
    System.out.println();  // Separates outputs in console
    asterisks.Error("Welcome!");
    
    System.out.println("---------------------------"); // breaks up asterisks and spaced in console
    
    // log and error method of SpacedLogger
    Logger spaced = new SpacedLogger();
    spaced.Log("Wide");
    System.out.println(); // Separates outputs in console
    spaced.Error("Hello");
    

  }

}
