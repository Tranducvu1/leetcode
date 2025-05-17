package CodeFores;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SpiralGrid {
    public static List<List<Integer>> solveGrid(int n) {
    	List<List<Integer>> grid = new ArrayList<List<Integer>>();
    	if(n==1) {
    		grid.add(Arrays.asList(0));
    		return grid;
    	}
    	
    	if(n==2) {
    		grid.add(Arrays.asList(0,1));
    		grid.add(Arrays.asList(2,3));
    		return grid;
    	}
    	if(n==3) {
    		grid.add(Arrays.asList(8,4,5));
    		grid.add(Arrays.asList(6,0,1));
    		grid.add(Arrays.asList(7,2,3));
    		return grid;
    	}
    	int [][] arr = new int[n][n];
    	int left =0;int right = n-1;
    	int top =0;int bottom = n-1;
    	int value =0;
    	int direction =0;
    	
    	while(top <= bottom && left <= right ) {
    		if(direction ==0) {
    			for(int i=left;i<= right;i++) {
    				arr[top][i] = value++;
    			}
    			top++;
    		} else if(direction ==1) {
    			for(int i= top;i<= bottom;i++) {
    				
    				arr[i][right] = value++;
    			}
    			right--;
    				
    			} else if(direction == 2) {
    				for(int i=right;i>=left;i--) {
    					arr[bottom][i] =value++;
    				}
    				bottom--;
    			} else if(direction == 3) {
    				for(int i=bottom;i>=top;i--) {
    					arr[i][left]= value++;
    				}
    				left++;
    			}
    		direction= (direction+1)%4;
    		}
    	
    		for(int i=0;i<n;i++) {
    			List<Integer> row = new ArrayList<>();
    				for(int j=0;j<n;j++) {
    					row.add(arr[i][j]);
    				}
    			grid.add(row);
    	}
    	
    	
    	return grid;

    	
    }
	
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        int t = sc.nextInt(); 
	      int[] ns = new int[t];
	      for(int i=0;i<t;i++) {
	    	  ns[i] = sc.nextInt(); 
	      }
	        for(int i=0;i<t;i++) {
	        	 List<List<Integer>> grid = solveGrid(ns[i]);
	        	 for(List<Integer> row : grid) {
	        		 for(int j=0;j<row.size();j++) {
	        			 System.out.print(row.get(j));
	        			 if(j < row.size() - 1) System.out.print(" ");

	        		 }
	        		 System.out.println("");
	        		 
	        	 }
	        }
	        
	        sc.close();
	}

}
