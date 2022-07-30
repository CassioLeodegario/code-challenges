class MaxFruitCountOf2Types {
  public static int findLength(char[] arr) {
    int windowStart = 0;
    int totalSum = 0;
    int MAX_FRUIT = 2;
    Map<Character, Integer> fruitMap = new HashMap<>();
    for(int windowEnd = 0; windowEnd < arr.length; windowEnd++){
      char currentChar = arr[windowEnd];
      fruitMap.put(currentChar, fruitMap.getOrDefault(currentChar, 0)+1);
      while(fruitMap.size() > MAX_FRUIT){
        char initialChar = arr[windowStart];
        fruitMap.put(initialChar, fruitMap.get(initialChar)-1);
        if(fruitMap.get(initialChar) <= 0){
          fruitMap.remove(initialChar);
        }
        windowStart++;
      }
      totalSum = Math.max(totalSum, windowEnd - windowStart +1);
    }
    return totalSum;
  }
}
