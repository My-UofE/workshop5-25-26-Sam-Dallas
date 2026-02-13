import java.util.Arrays;
import java.util.ArrayList;
public class CopyArrayApp{
  public static void main(String[] args) {
    int nVals = args.length;
    // to create a new array of ints
    ArrayList<Integer> myVals = new ArrayList<>(0); 
    ArrayList<Integer> uniqVals = new ArrayList<>(0); 
    for (int i = 0; i < nVals; i++) {
      int item = Integer.parseInt(args[i]);
      if (myVals.contains(item) == false) {
        uniqVals.add(item);
      }
      myVals.add(item);
      
    }
    System.out.println("original values: " + myVals);
    System.out.println("unique values: " + uniqVals);

  }
}