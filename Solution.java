import java.util.Hashtable;
class Solution {
    public static char mostFrequentChar(String s) {
      char[] sar = s.toCharArray();
      var table = new Hashtable<Character, Integer>();
      char largest = '`';
      table.put(largest, 0);
      for(char c : sar){
        if(Character.toString(c).matches("\s")){
          continue;
        }
        else{
          if(table.containsKey(c)){
            table.put(c, table.get(c)+1);
          }
          else{
            table.put(c,1);
          }
        }
        if(table.get(c)>table.get(largest)){
          largest=c;
        }
      }
      return largest;
    }
  
    public static void main(String[] args) {
      // Try out your test cases:
      System.out.println(Solution.mostFrequentChar("bookeeper")); // -> 'e'
      System.out.println(Solution.mostFrequentChar("bookeeper"));
    }

  }
