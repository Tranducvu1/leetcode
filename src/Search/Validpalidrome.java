package Search;

public class Validpalidrome {
	 public static boolean isPalindrome(String s) {
		 if(s.length() == 0) {
			 return true;
		 } 
		 String charLength = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
		 String noSpaces =charLength.replace(" ", "");
		 String reversedNoSpaces = new StringBuilder(noSpaces).reverse().toString();
		 return charLength.equals(reversedNoSpaces);
	    }
	public static void main(String[] args) {
		System.out.println(isPalindrome("A man, a plan, a canal: Panama"));

	}

}
