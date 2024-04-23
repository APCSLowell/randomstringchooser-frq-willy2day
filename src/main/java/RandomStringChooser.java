import java.util.*;
public class RandomStringChooser
{
  /* to be implemented in part (a) */
  private ArrayList<String>  words;
  public RandomStringChooser (String [] n){
    words=n; 
    for (int i<0; i<n.length;i++){
      words.add(n[i]);
    }
    
  }
  public string getNext(){
    if (words.size()==0)
        reutrn "NONE";
    int i= (int)(Math.random()*words.size());
    return words.remove(i);
  }
  //Heads up! 
  //You will get a very confusing error message until you have working code in part b as well
}
