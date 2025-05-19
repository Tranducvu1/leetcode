package Search;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class groupBySuffix {
    public static Map<String, List<String>> groupBySuffix(String[] inputs) {
    	Map<String, List<String>> prefixcheck = new HashMap<>();
    	Pattern partern = Pattern.compile("^(\\d+)([a-zA-Z]+)$");
    	
    	for(String str:inputs) {
    		Matcher matcher = partern.matcher(str);
    		if(matcher.matches()) {
    			String number = matcher.group(1);
    			String prefix = matcher.group(2);
    			
    			prefixcheck.computeIfAbsent(prefix, k -> new ArrayList<>()).add(number);
    		}
    	}
    	return prefixcheck;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String[] inputs = {"12334344ns", "423543534ba", "4235345435ns", "53453454ba"};
        Map<String, List<String>> prefixcheck = new HashMap<String, List<String>>();
        prefixcheck = groupBySuffix(inputs);
        for(Map.Entry<String, List<String>> entry : prefixcheck.entrySet()) {
        	System.out.println(entry.getKey()+"->" +entry.getValue());
        }
	}

}
