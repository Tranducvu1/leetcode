package Core;

public class mysqrt {
	public static int mysqrt(int x) {
		int left =0;
		int right = x;
		while(left <= right) {
			int mid = ((left+right ) / 2);
			int m_ssquare = mid * mid;
			if(m_ssquare == x) {
				return mid;
			}
			 if(m_ssquare > x) {
				right = mid-1;
			} else {
				left = mid+1;
			}
		}
		return right;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=8;
		System.out.println(mysqrt(x));
	}

}
