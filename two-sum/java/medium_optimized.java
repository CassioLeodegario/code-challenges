import java.util.*;

class Program {
  public static int[] twoNumberSum(int[] array, int targetSum) {
    // Write your code here.
    Map<Integer, Boolean> store = new HashMap<>();
    for(int num : array){
      int tempTarget = targetSum - num;
      Boolean check = store.get(tempTarget);
      if(check!=null && check){
        return new int[]{tempTarget, num};
      }
      store.put(num, true);
    }
    return new int[0];
  }
}
