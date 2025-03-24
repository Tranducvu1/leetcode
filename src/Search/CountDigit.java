package Search;

public class CountDigit {
public static int countDigitOne(int n) {
        if (n<=0) return 0;
        int count =0;
        int base =1;
        while(base <=n) {
        	int current = (n/base) %10;
        	int hight = n/(base*10);
        	int low = n  % base;
        	if(current ==0 ) {
        		count+= hight*base;
        	} else if(current ==1) {
        		 count+= low+1+(hight*base);
        	} else {
        		count+= (hight+1) * base;
        	}
        	  base *= 10;
        }
		return count;
       
    }
	public static void main(String[] args) {
		System.out.println(countDigitOne(13));

	}

}
