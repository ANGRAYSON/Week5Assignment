package week5;

public class SpacedLogger implements Logger{

//3. Create two classes that implement Logger interface. a. Asterisk Logger b. Spaced Logger

  //6. SpacedLogger should add spaced between each character of string passed to methods
  
  //7. Log method should print spaces between each letter. ex. H e l l o
  @Override
  public void Log(String string) {
    StringBuilder finalString = new StringBuilder();
    spacedOut(string, finalString);
    System.out.println(finalString);
    
  }

  //8. Same as log method but with ERROR in front of word. 
  @Override
  public void Error(String string) {
    StringBuilder finalString = new StringBuilder();
    finalString.append("ERROR: ");
    spacedOut(string, finalString);
    System.out.println(finalString);
    
  }
  
  
  // method that spaces out the words. Created to reduce repetitive code.
  private StringBuilder spacedOut(String string, StringBuilder finalString) {
    for(int index = 0; index < string.length(); index++) {
      finalString.append(string.charAt(index) + " ");
    }
    return finalString;
  }

  
}
