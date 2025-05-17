package Search;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class  wordFrequencyCounter{
	  public static void main(String[] args){
		  String text = "AGEST VietNam (AGV) is an affilate company of Agest Japan.Would you like to become a member of AGEST VietNam?";
		  Pattern pattern = Pattern.compile("\\b\\w+\\b");
		  Matcher matcher = pattern.matcher(text);
		  Map<String , Integer> hashmap = new LinkedHashMap<String, Integer>();
		  while(matcher.find()) {
			  String word = matcher.group();
			  hashmap.put(word,hashmap.getOrDefault(word, 0)+1);
		  }
		  for(Map.Entry<String, Integer> entry : hashmap.entrySet()) {
			  System.out.println(entry.getKey()+": "+entry.getValue());
		  }
	  }
}