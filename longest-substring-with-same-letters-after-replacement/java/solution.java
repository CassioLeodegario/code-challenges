class CharacterReplacement {
  public static int findLength(String str, int k) {
    int windowStart = 0, maxLength = 0, maxRepeatLetterCount = 0;
    Map<Character, Integer> letterFrequencyMap = new HashMap<>();

    for(int windowEnd = 0; windowEnd < str.length(); windowEnd++){
      char currentChar = str.charAt(windowEnd);
      letterFrequencyMap.put(currentChar, letterFrequencyMap.getOrDefault(currentChar, 0) +1);
      maxRepeatLetterCount = Math.max(maxRepeatLetterCount, letterFrequencyMap.get(currentChar));

      if(windowEnd - windowStart + 1 - maxRepeatLetterCount > k){
        char initialChar = str.charAt(windowStart);
        letterFrequencyMap.put(initialChar, letterFrequencyMap.get(initialChar) -1);
        windowStart++;
      }

      maxLength = Math.max(maxLength, windowEnd - windowStart+1);      
    } 

    return maxLength;
  }
}
