package Core;

import java.util.Scanner;

public class AnagramGenerator {
	private static int size;
    private static int count;
    private static char[] charArray;
    public static void rotateAnagram(String word) {
    	size = word.length();
    	count = 0;
    	charArray = word.toCharArray();
    	doAnagram(size);
    }
    private static void doAnagram(int newSize) {
    	if(newSize == 1) return ;
    	for(int i=0;i<newSize;i++) {
    		doAnagram(newSize-1);
    		if(newSize == 2) {
    			displayWord();
    		}
            rotate(newSize);

    	}
    }
    
    private static void rotate(int newSize) {
    	int position = size - newSize;
    	char temp = charArray[position];
    	for(int i=position+1;i< size;i++) {
    		charArray[i-1] = charArray[i];
    	}
    	charArray[size - 1] = temp;

    }
    
    private static void displayWord() {
        System.out.printf("%3d: ", ++count);
        for (int i = 0; i < size; i++) {
            System.out.print(charArray[i]);
        }
        System.out.println();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một từ để hoán vị: ");
        String input = scanner.nextLine();
        System.out.println("Tất cả hoán vị:");
        rotateAnagram(input);
        scanner.close();
	}

}
