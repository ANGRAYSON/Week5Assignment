package week5;

public interface Logger {
  //1. Create an interface named Logger

  //2. Add two void methods to the Logger interface, each should take a string
  //   as an argument. a. Log   b. Error
  public void Log(String string);
  
  public void Error(String string);

}
