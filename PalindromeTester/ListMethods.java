import java.util.*;

public class ListMethods
{
   private static int counter = 1;
    public static ArrayList makeList(int n)
   {
      ArrayList<Integer> tempList = null;
      
      if (n <= 0)  
      {
          return tempList;
          
      }
      else        
      {
          tempList.add(counter);
          counter++;
          return makeList(n-1);


      }
      
   }
}
