import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = in.nextInt();
    List numlist = new ArrayList();
    for (int i = 0; i < num; i++)
    {
      System.out.print("Enter integer: ");
      int num2 = in.nextInt();
      numlist.add(num2);
    }
    int Maxnum = 0;
    int Maxcount = 0;
    for (int i = 0; i < numlist.size(); i++)
    {
      int count = 0;
      for (int j =0; j < numlist.size(); j++)
      {
        if (numlist.get(i) == numlist.get(j))
        {
          count++;
        }
      }
      
      if (count > Maxcount)
      {
        Maxcount = count;
        Maxnum = (int) numlist.get(i);
      }
    }
    System.out.print(Maxnum);
    
  }
}
