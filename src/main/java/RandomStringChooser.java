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
    new ArrayList <String> d =new ArrayList <String>(); 
  
    for (int i =0; i <wordArray.length;i++){
      
      d+=wordArray[((int)* Math.random()*wordArray.length)+1];
      
    }
    for (int i=0; i<d.size();i++){
      if (d.get(i).equals("")
          w+="NONE";
      else 
      w+=d.get(i);
      
    }
    return w; 
  }
  //Heads up! 
  //You will get a very confusing error message until you have working code in part b as well
}
