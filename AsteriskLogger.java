package week5;

public class AsteriskLogger implements Logger{
//3. Create two classes that implement Logger interface.
//   a. Asterisk Logger b. Spaced Logger
  
  //4. the log method on AsteriskLogger should print String it receives between 
  //    3 asterisks on either side of string. ex: ***Hello***
  @Override
  public void Log(String string) {
    System.out.println("***" + string + "***");
  }

  //5. Error method on AsteriskLogger should print String it receives inside a box
  //   of asterisks. example:
  // ******************
  // ***Error: hello***
  // ******************
  
  @Override
  public void Error(String string) {
    // creates final string with error and string concatenated for middle of box
    StringBuilder finalString = new StringBuilder();
    finalString.append("***Error: " + string + "***");

    // creates line of stars for top and bottom of box
    StringBuilder starLine = new StringBuilder();
    for(int i = 0; i < finalString.length(); i++) {
      starLine.append("*");
    }
    
    // prints out box and string 
    System.out.println(starLine);
    System.out.println(finalString);
    System.out.println(starLine);
    
    
  }



  
  
  
  
}
