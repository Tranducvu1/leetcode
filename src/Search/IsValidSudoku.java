package Search;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IsValidSudoku {
public boolean isValidSudoku(char[][] board) {
	
	//create doc . ngang, box chứa vị trí
	List<Set<Character>> rows = new ArrayList<>();
	List<Set<Character>> cols = new ArrayList<>();
        List<Set<Character>> boxes = new ArrayList<>();
     // Khởi tạo Set cho các hàng, cột, ô 3x3
        for(int i=0;i<9;i++) {
        	rows.add(new HashSet<Character>());
        	cols.add(new HashSet<Character>());
        	boxes.add(new HashSet<Character>());
        }
        // kiêmr tra từng ô trong soduku
        for(int i = 0;i< 9;i++) {
        	for(int j= 0;j<9;j++) {
        		
        		char num = board[i][j];
        		if(num == '.') continue;
        		//tính chỉ số cột 3x3
        		int boxindexs = (i/3)*3 + (j/3);
        		// nếu xuất hiện rồi trả về true
        		if(rows.get(i).contains(num) || cols.get(i).contains(num) || boxes.get(boxindexs).contains(num)) {
        			return false;
        		}
                // Thêm số vào hàng, cột và ô 3x3 tương ứng

        		rows.get(i).add(num);
        		cols.get(i).add(num);
        		boxes.get(boxindexs).add(num);
        	}
        	
        }
        return true;
        
    }
	public static void main(String[] args) {
		char[][] board = {
	            {'5','3','.','.','7','.','.','.','.'},
	            {'6','.','.','1','9','5','.','.','.'},
	            {'.','9','8','.','.','.','.','6','.'},
	            {'8','.','.','.','6','.','.','.','3'},
	            {'4','.','.','8','.','3','.','.','1'},
	            {'7','.','.','.','2','.','.','.','6'},
	            {'.','6','.','.','.','.','2','8','.'},
	            {'.','.','.','4','1','9','.','.','5'},
	            {'.','.','.','.','8','.','.','7','9'}
	        };
		 IsValidSudoku solver = new IsValidSudoku();
	        boolean result = solver.isValidSudoku(board);
	        System.out.println("Is valid Sudoku: " + result);

	}

}
