package Search;
import java.util.Stack;

public class dailyTemperatures {
	 public static int[] dailyTemperatures(int[] temperatures) {
	       int n= temperatures.length;
	       //create result stored
	       int [] result = new int [n];
	       //create stack stored index
	   Stack<Integer> stack = new Stack<>();
	    		   for(int i=0;i<n;i++) {
			   //Nếu nhiệt độ ngày hiện tại i lớn hơn nhiệt độ của ngày được lưu trên đỉnh stack
	    			   //stack.peek() trả về phẩn tử ở đỉnh mà không xóa nó
	    			while(!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
	    				//trả về index trc đó
	    				int prev = stack.pop();
	    				//trừ rồi thêm vào result
	    				result[prev] = i - prev;
	    			}
	    			//đẩy vào stack vào stack
	    			 stack.push(i);
	    		   }

					
	    		   return result;

					
	    }
	 
    public static void main(String[] args) {
         int[] temperatures = {73, 74, 75, 71, 69, 72, 76, 73};
         System.out.println(dailyTemperatures(temperatures));
            }
}
