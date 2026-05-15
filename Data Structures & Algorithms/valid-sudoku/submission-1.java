class Solution {
    public boolean isValidSudoku(char[][] board) {

    //Array of Hashsets iniatialize

          HashSet<Character>[] rows=new HashSet[9];
         HashSet<Character>[] cols=new HashSet[9];
          HashSet<Character>[] boxes=new HashSet[9];



           // Initialization of sets 

          for(int i=0;i<9;i++){
             
             rows[i]=new HashSet<>();
             cols[i]=new HashSet<>(); 
             boxes[i]=new HashSet<>();

          }

                 // traverse board
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {

          char num= board[i][j];

         int boxIndex=(i/3)*3 + (j/3);

         if(num == ('.')){
            continue;
         }

          if(rows[i].contains(num) || cols[j].contains(num) || boxes[boxIndex].contains(num)){

            return false;
          }

            rows[i].add(num);
              cols[j].add(num);
               boxes[boxIndex].add(num); 

            }}

return true;



          // 
    }
}
