import java.util.*;
// space complexity = O(c)
// time complexity = O(n * l) where l = length off the bigger word

class Program {

  public char[] minimumCharactersForWords(String[] words) {
    // Write your code here.
    Map<Character, Integer> characters = new HashMap<>();
    for(String word: words){      
      updateCharactersCount(characters, getLocalFrequency(word));
    }
    
    return getCharArray(characters);
  }

  public char[] getCharArray(Map<Character, Integer> characters){
    String charToString = "";
    for(char c : characters.keySet()){
      charToString = charToString + String.valueOf(c).repeat(characters.get(c));
    }
     return charToString.toCharArray();
  }

  public void updateCharactersCount(Map<Character, Integer> characters, Map<Character, Integer> localFrequency){
    for(char c : localFrequency.keySet()){            
        if(characters.get(c)==null){
          characters.put(c, localFrequency.get(c));
          continue;
        }
        if(localFrequency.get(c) > characters.get(c)){
          characters.put(c, localFrequency.get(c));
        }
      }
  }

  
  public Map<Character, Integer> getLocalFrequency(String word){
    Map<Character, Integer> localFrequency = new HashMap<>();
    for(int i = 0; i < word.length(); i++ ){      
        char currentChar = word.charAt(i);
        Integer currentCharCount = localFrequency.get(currentChar);
        if(currentCharCount == null){
          localFrequency.put(currentChar, 1);
          continue;
        }            
        localFrequency.put(currentChar, currentCharCount + 1);          
    }
    return localFrequency;
  }
}

