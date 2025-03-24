package Search;

import java.util.Arrays;
import java.util.Stack;

public class CARFEET {
    public static int carFleet(int target, int[] position, int[] speed) {
    	//length of index
    	int n = position.length;
    	//create 2 array 
    	int [][] car = new int[n][2];
    	
    	for(int i=0;i<n;i++) {
    		car[i][0] = position[i];
    		car[i][1] = speed[i];
    	}
    	//sort 2D array 
    	Arrays.sort(car,(a,b) -> b[0]- a[0]);
    	
        Stack<Double> stack = new Stack<>();

        for(int i=0;i< n;i++) {
        	//calculator time to destination
        	double time = (double)(target - car[i][0])/car[i][1];
        	//check time to emty 
        	if(stack.isEmpty() ||time > stack.peek() ) {
        		stack.push(time);
        	}
        }
        return stack.size();
    }
    
    public static void main(String[] args) {
    	int[] position =  {10,8,0,5,3};
    	int[]  speed = {2,4,1,1,3};
    	System.out.println(carFleet(12,position,speed));
	}
}
