class LongestSubstringKDistinct {
  public static int findLength(String str, int k) {

    if(str == null || str.length() == 0){
      return 0;
    }
    if(k >= str.length()){
      return str.length();
    }
    int maxLength = 0;    
    int windowStart = 0;
    Map<Character, Integer> charFrequency = new HashMap<>();
    for(int i=0; i<str.length();i++){      
      
      char rightChar = str.charAt(i);
      charFrequency.put(rightChar, charFrequency.getOrDefault(rightChar, 0) +1);

      while(charFrequency.size() > k){
        char leftChar = str.charAt(windowStart);
        charFrequency.put(leftChar, charFrequency.get(leftChar) -1);
        if(charFrequency.get(leftChar) == 0){
          charFrequency.remove(leftChar);
        }
        windowStart++;
      }
      maxLength = Math.max(maxLength, i - windowStart+1);            
      
    }
    return maxLength;
  }
}
