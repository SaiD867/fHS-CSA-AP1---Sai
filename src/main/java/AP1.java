package src.main.java;

public class AP1 {
//I looked up a bunch of functions like .compare and .compare to to make this eseair
    /**
     * Given an array of scores, return true if each score is equal or greater
     * than the one before.
     */
    public boolean scoresIncreasing(int[] scores) {
        boolean val = false;
        for (int i = 1; i < scores.length; i++) 
        {
            if (scores[i] >= scores[i - 1]) 
            {
                val = true;

            }
            else {return false;}
        }
        return val;
    }

    /**
     * Return true if the array contains 100 twice in a row.
     */
    public boolean scores100(int[] scores) {
        boolean val = false;
        boolean val2 = false;
        for (int i = 1; i < scores.length-1; i++) 
        {
            if (scores[i] == 100 && scores[i + 1] == 100)
            {
                val = true;
            }
        }
    
    if (val == true )
    {return true;}
    else  
    {return false;}}

    /**
     * Return true if there are three adjacent scores that are all within 2 of each other.
     */
    public boolean scoresClump(int[] scores) {

        for (int i = 0; i < scores.length-2; i++) 
        {
            if (scores[i] - scores[i+2] <= 2 && scores[i] - scores[i+2] >= -2 && scores[i] - scores[i+1] <= 2 && scores[i] - scores[i+1] >= -2) 
            {return true;}}

        return false;
    }

    /**
     * 
     * Given an array of scores, compute the int average of the first half and the second half, and return whichever is larger. 
     * We'll say that the second half begins at index length/2. The array length will be at least 2. 
     * To practice decomposition, write a separate helper method int average(int[] scores, int start, int end)
     * which computes the average of the elements between indexes start..end. 
     * Call your helper method twice to implement scoresAverage(). 
     * Normally you would compute averages with doubles, but here we use ints so the expected results are exact.
     */
    
    public int scoresAverage(int[] scores) {
        int first = average(scores, 0, scores.length / 2);
        int second = average(scores, scores.length / 2, scores.length);
        return Math.max(first, second);
    }

    public int average(int[] scores, int start, int end) {
        int sum = 0;

        for(int i = start; i < end; i++)
            sum += scores[i];

        return sum / (end - start);
    }

    /**
     * Given an array of words, return the count of the number of words of the
     * given length.
     */
    public int wordsCount(String[] words, int len) {
        int sdhkjjkfdkjfdjkkjdhskhjf = 0;

        for(int c = 0; c < words.length; c++) {
            if(words[c].length() == len)
                sdhkjjkfdkjfdjkkjdhskhjf++;
        }

        return sdhkjjkfdkjfdjkkjdhskhjf;
    }

    /**
     * Given an array of strings, return a new array with the first n strings.
     */
    public String[] wordsFront(String[] words, int n) {
        String[] pirate = new String[n];

        for(int i = 0; i <= n-1; i++)
            pirate[i] = words[i];

        return pirate;
    }

    /**
     * Return a new ArrayList of strings without the strings of a given length.
     */
    
    public java.util.ArrayList<String> wordsWithoutList(String[] words, int len) {
        /*ArrayList<String> ship = new ArrayList<>();
        for(int i = len-1; i < words.length; i++)
        { if (!(words[i].length() ==len))
            ship.add(words[i]);}*/
        return new java.util.ArrayList<>();
    }

    /**
     * Given a positive int, return true if it has a 1 in it.
     */
    public boolean hasOne(int n) {
        {
          while (( n>0))
          {
            if(n%10 == 1)
            {return true;}
            n/=10;
          } 
          return false; 
        }
    }

    /**
     * 
     * We'll say that a positive int divides itself if every digit in the number divides into the number evenly. 
     * So for example 128 divides itself since 1, 2, and 8 all divide into 128 evenly. 
     * We'll say that 0 does not divide into anything evenly, so no number with a 0 digit divides itself. 
     * Note: use % to get the rightmost digit, and / to discard the rightmost digit.
     */
    public boolean dividesSelf(int n) {
        double val = 0.0;
        int hello = n; //o
        while (n > 0)
            {val = n%10.0;
            if (val == 0 || hello % val != 0)
            { return false; }
        n /= 10;
            } 
        return true;}

    /**
     * 
     * Given an array of positive ints, return a new array of length "count" containing the first even numbers from the original array. 
     * The original array will contain at least "count" even numbers.
     */
    public int[] copyEvens(int[] nums, int count) {
    int[] arrarr = new int[count];
    int in = 0;
      
    for(int i = 0; in < count; i++) {          
                    if(nums[i] % 2 == 0) {
arrarr[in] = nums[i];
                    in++;
        }
    }
                                
    return arrarr;
}








      /**  
    * We'll say that a positive int n is "endy" if it is in the range 0..10 or 90..100 (inclusive).  
    */  
   public int[] copyEndy(int[] nums, int count) {  
       int[] hi = new int[count];
      int val = 0;  
      for (int n : nums) {  
        if (isEndy(n)) {  
           hi[val] = n;  
           val++;  
           if (val == count) {  
              break;  
           }  
        }  
      }  
      return hi;  
   }  
  
   public boolean isEndy(int n) {  
      return (n >= 0 && n <= 10) || (n >= 90 && n <= 100);  
   }  
  
   /**  
    * Given 2 arrays that are the same length containing strings, compare the 1st string in one array to the 1st string in the other array,  
    * the 2nd to the 2nd and so on. Count the number of times that the 2 strings are non-empty and start with the same char.  
    */  
   public int matchUp(String[] a, String[] b) {  
      int count = 0;  
      for (int i = 0; i < a.length; i++) {  
        if (a[i].substring(0, 1).equals(b[i].substring(0, 1)) && a[i].length() >= 1 && b[i].length() >= 1) {  
           count++;  
        }  
      }  
      return count;  
   }  
  
   /**  
    * The "key" array is an array containing the correct answers to an exam, like {"a", "a", "b", "b"}. the "answers" array contains a student's  
    * answers, with "?" representing a question left blank. The two arrays are not empty and are the same length.  
    * Return the score for this array of answers, giving +4 for each correct answer, -1 for each incorrect answer, and +0 for each blank answer.  
    */  
   public int scoreUp(String[] key, String[] answers) {  
      int score = 0;  
      for (int i = 0; i < key.length; i++) {  
        if (!answers[i].equals("?")) {  
          score -= 1;    
        } else if (answers[i].equals(key[i])) {  
          score += 4;   
        }  
      }  
      return score;  
   }  
  
   /**  
    * Given an array of strings, return a new array without the strings that are equal to the target string.  
    */  
   public String[] wordsWithout(String[] words, String target) {  
      int count = 0;  
      for (String word : words) {  
        if (!word.equals(target)) {  
           count++;  
        }  
      }  
      String[] wordz = new String[count];  
      int oompalompa = 0;  
      for (int i=0;i<words.length;i++ ) {  
        if (!wordz.equals(target)) {  
           wordz[i] = words[i];  
           oompalompa++;  
        }  
      }  
      return wordz;  
   }  
 
   /**  
    * Given two arrays, A and B, of non-negative int scores. A "special" score is one which is a multiple of 10, such as 40 or 90.  
    * Return the sum of largest special score in A and the largest special score in B.  
    */  
   public int scoresSpecial(int[] a, int[] b) {  
      return largestSpecial(a) + largestSpecial(b);  
   }  
  
   public int largestSpecial(int[] nums) {  
      int oompalompa = 0;  
      for (int i=0;i<nums.length;i++ ) {  
        if (nums[i] > oompalompa && nums[i] % 10 == 0) {  
           oompalompa = nums[i];  
        }  
      }  
      return oompalompa;  
   }  
  
 
   public int sumHeights(int[] heights, int start, int end) {  
      int sum = 0;  
      for (int i = start; i < end; i++) {  
        int value = Math.abs(heights[i] - heights[i + 1]);  
        sum +=value;
      }  
      return sum;  
   }  
  
   /**  
    * (A variation on the sumHeights problem.) We have an array of heights, representing the altitude along a walking trail.  
    * Given start/end indexes into the array, return the sum of the changes for a walk beginning at the start index and ending at the end  
    * index, however increases in height count double.  
    */  
   public int sumHeights2(int[] heights, int start, int end) {  
      int sum = 0;  
      for (int i = start; i < end; i++) {  
        if (heights[i + 1] > heights[i]) {  
           sum += 2 * (heights[i + 1] - heights[i]);  
        } else {  
           sum += heights[i] - heights[i + 1];  
        }  
      }  
      return sum;  
   }  
  
   /**  
    * (A variation on the sumHeights problem.) We have an array of heights, representing the altitude along a walking trail.  
    * Given start/end indexes into the array, return the number of "big" steps for a walk starting at the start index and ending at the end index.  
    * We'll say that step is big if it is 5 or more up or down.  
    */  
   public int bigHeights(int[] heights, int start, int end) {  
      int count = 0;  
      for (int i = start; i < end; i++) {  
        if (Math.abs(heights[i] - heights[i + 1]) >= 5) {  
           count++;  
        }  
      }  
      return count;  
   }  
  
   /**  
    * We have data for two users, A and B, each with a String name and an int id. The goal is to order the users such as for sorting.  
    * Return -1 if A comes before B, 1 if A comes after B, and 0 if they are the same. Order first by the string names, and then by the id numbers  
    * if the names are the same.  
    */  
  public int userCompare(String aName, int aId, String bName, int bId) {
    int nameCompare = aName.compareTo(bName);
    if (!(nameCompare == 0)) {
        return nameCompare; 
    }
    
    return Integer.compare(aId, bId);
} 
  
   /**  
    * Start with two arrays of strings, A and B, each with its elements in alphabetical order and without duplicates.  
    * Return a new array containing the first N elements from the two arrays. The result array should be in alphabetical order and without duplicates.  
    */  
   public String[] mergeTwo(String[] a, String[] b, int n) {  
   String[] result = new String[n];  
   int kevin = 0, bob = 0, stuart = 0;  
   while (stuart < n) {  
      if (kevin < a.length && bob < b.length) {  
        if (a[kevin].compareTo(b[bob]) < 0) {  
           result[stuart] = a[kevin];  
           kevin++;  
        } else if (a[kevin].compareTo(b[bob]) > 0) {  
           result[stuart] = b[bob];  
           bob++;  
        } else {  
           result[stuart] = a[kevin];  
           kevin++;  
           bob++;  
        }  
      } else if (kevin < a.length) {  
        result[stuart] = a[kevin];  
        kevin++;  
      } else {  
        result[stuart] = b[kevin];  
        bob++;  
      }  
      stuart++;  
   }  
   return result;  
}
  
   /**  
    * Start with two arrays of strings, a and b, each in alphabetical order, possibly with duplicates.  
    * Return the count of the number of strings which appear in both arrays. The best "linear" solution makes a single pass over both arrays,  
    * taking advantage of the fact that they are in alphabetical order.  
    */  
   public int commonTwo(String[] a, String[] b) {  
  int count = 0;
  String str = "";
  for (int i = 0; i <= b.length-1; i++) {
    for (int j = 0; j <= a.length-1; j++) {
      if (!str.contains(a[j])&&a[j].equals(b[i])) {
        str += a[j];
        count++;
      }
    }
  }
  return count;
}
}
