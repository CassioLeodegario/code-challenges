import java.util.*;

class Program {
  public static int[] twoNumberSum(int[] array, int targetSum) {
    // Write your code here.    
    for(int i = 0; i<array.length; i++){
      for(int j = 0; j<array.length; j++){
        if(i != j){
          int tempSum = array[i] + array[j];
          if(tempSum == targetSum){
            return new int[]{array[i], array[j]};
          }
        }
      }
    }
    return new int[0];
  }
}
