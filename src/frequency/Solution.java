package frequency;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


class Result {

    /*
     * Complete the 'numDuplicates' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. STRING_ARRAY name
     *  2. INTEGER_ARRAY price
     *  3. INTEGER_ARRAY weight
     */

    public static int numDuplicates(List<String> name, List<Integer> price, List<Integer> weight) {
    // Write your code here
    int res=0;
    HashSet<String> set = new HashSet<String>();
   
    for(int i=0;i<name.size();i++) {
        String cmb=name.get(i) +"_" +price.get(i)+ "_" +weight.get(i);
        if(set.contains(cmb)) {
            res++;
        }
        else {
            set.add(cmb);
        }
    }
    return res;
   }
}
   
public class Solution {
    public static void main(String[] args) throws IOException {
       // BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        
       // int nameCount = Integer.parseInt(bufferedReader.readLine().trim());

    	
    	List<String> name = new ArrayList<>(Arrays.asList("a", "b")); 
        
  

        List<Integer> price = new ArrayList<>(Arrays.asList(1,3)); 

       
        List<Integer> weight = new ArrayList<Integer>(Arrays.asList(1,3));
        int result = Result.numDuplicates(name, price, weight);

        System.out.println(result);
    }
}
