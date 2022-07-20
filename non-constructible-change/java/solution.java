import java.util.*;

class Program {
  // O(nlogn) time | O(1) space
  public int nonConstructibleChange(int[] coins) {    
    
    int change = 0;
    Arrays.sort(coins);
    for(int i = 0; i<coins.length;i++){
      if(coins[i] > change + 1){
        return change+1;
      }
      change+=coins[i];
    }    
    return change+1;
  }
}
