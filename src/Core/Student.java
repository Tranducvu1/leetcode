package Core;

public class Student {
	public int roll_no;
    public String name;
  
    Student(int roll_no, String name){
        this.roll_no = roll_no;
        this.name = name;
    }
	public static void main(String[] args) {
		Student [] arr;
			arr = new Student[5];
			arr[0] = new Student(0, "Vũ");
			arr[1] = new Student(1, "Linh");
			arr[2] = new Student(3, "shikar");
	        arr[3] = new Student(4, "dharmesh");
	        arr[4] = new Student(5, "mohit");
	        for (int i=0;i< arr.length;i++) {
	        	
	        }
	}

}
