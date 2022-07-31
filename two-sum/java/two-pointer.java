class PairWithTargetSum {

  public static int[] search(int[] arr, int targetSum) {
    
    int initialPointer = 0;
    int finalPointer = arr.length-1;
    while(finalPointer > initialPointer && initialPointer < arr.length){
      int sum = arr[initialPointer] + arr[finalPointer];
      if(targetSum == sum){
        return new int[]{initialPointer, finalPointer};
      }else if(sum > targetSum){
        finalPointer--;
      }else {
        initialPointer++;
      }
    }
    return new int[] { -1, -1 };
  }
}
