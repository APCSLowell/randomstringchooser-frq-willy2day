import java.util.*;
public class RandomStringChooser
{
  /* to be implemented in part (a) */
  private String [] wordArray;
  public RandomStringChooser (String [] n){
    wordArray=n; 
    
  }
  public string getNext(){
    String w="";
    for (int i =0; i <wordArray.length;i++){
      w+=wordArray[(int)* Math.random()*wordArray.length;
    }
    return w; 
  }
  //Heads up! 
  //You will get a very confusing error message until you have working code in part b as well
}
