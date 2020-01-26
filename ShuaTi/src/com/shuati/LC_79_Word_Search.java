package com.shuati;

public class LC_79_Word_Search {
    public boolean exist(char[][] board, String word) {
        //idea:
        // for every cell search every direction
        //   if have then continue search
        //   else remove last character and return
        char[] wordArray = word.toCharArray();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length ; j++) {
                if (searchWord(i, j, board, wordArray,0)){
                    return true;
                }
            }
        }
        return false;

    }

    private boolean searchWord(int i, int j, char[][] board, char[] word, int pos) {
        if (pos == word.length){
            return true;
        }

        if (i < 0 || j < 0 || i == board.length || j == board[i].length
                || board[i][j] == '*'
                || word[pos] != board[i][j]){
            return false;
        }

        board[i][j] = '*';
        boolean result = searchWord(i - 1, j, board, word, pos + 1)
                || searchWord(i + 1, j, board, word, pos + 1)
                || searchWord(i, j + 1, board, word, pos + 1)
                || searchWord(i, j - 1, board, word, pos + 1);
        board[i][j] = word[pos];
        return result;
    }

}
