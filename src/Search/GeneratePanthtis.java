	package Search;
	
	import java.util.ArrayList;
	import java.util.List;
	
	public class GeneratePanthtis {
		    public static List<String> generateParenthesis(int n) {
		        List<String> result = new ArrayList<String>();
		        generate("", 0, 0, n, result);   
		        return result;
		    }
		    
		    private static void generate(String current , int open, int close,int max,List<String> result) {
		    	if(open == max && close == max ) {
		    		result.add(current);
		    		return;
		    		
		    	}
		    	if(open < max) {
		    		generate(current+"(", open+1,close, max, result);
		    	}
		    	if(close < open) {
		    		generate(current+")", open, close+1, max, result);
		    	}
		    	
		    }
		
		public static void main(String[] args) {
			
	        System.out.println(generateParenthesis(3));  
		}
	}
