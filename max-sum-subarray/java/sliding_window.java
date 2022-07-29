class MaxSumSubArrayOfSizeK {
  public static int findMaxSumSubArray(int k, int[] arr) {
    
    int maxSum = 0;
    int windowStart = 0;
    int windowSum = 0;
    for(int windowEnd = 0;windowEnd < arr.length; windowEnd++){
      windowSum += arr[windowEnd];            
      if(windowEnd >= k-1){
        if(windowSum > maxSum){
          maxSum = windowSum;
        }
        windowSum-=arr[windowStart];
        windowStart++;        
      }
    }


    return maxSum;
  }
}
