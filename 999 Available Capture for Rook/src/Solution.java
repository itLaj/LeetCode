class Solution {
    public int numRookCaptures(char[][] board) {
        int sum = 0;
        int []a = {0,0};
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                while (board[i][j] == 'R') {
                    int l = i;
                    while(board[l][j] == 'D' || l < 0){
                        l--;
                        if (board[l][j] == 'p') {
                            sum ++;
                            break;}
                    }

                        }
                    }


        }

        return  0;

}
}
