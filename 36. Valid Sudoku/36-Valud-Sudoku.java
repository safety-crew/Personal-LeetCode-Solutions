class Solution {
    public boolean isValidSudoku(char[][] board) {
        /*
        1. for each row, we put the elements in a HashSet, then check if duplication
           occurs. If a 'dot' is present at some index, we skip over it. The hashSet
           can be of size 9 as each row contains only 9 elements max.
        2. for each column, we create a HashSet and repeat the same process as (1).
        3. for each box, we have a matrix logic, and we use the same HashSet logic.
        4. for boxes, the trick part is to find which box does each index relate to.
           for that, we divide each entry for each row and column by 3.
           moreover, to decide which hashset (out of the 9 hashsets for all the boxes)
           to use based on specific index, we use this formula: [row/3 * 3 + col/3].
         */

        int N = 9;

        // Use HashSets to record the status
        HashSet<Character>[] rows = new HashSet[N];
        HashSet<Character>[] cols = new HashSet[N];
        HashSet<Character>[] boxes = new HashSet[N];

        for(int r = 0; r < N; r++) {
            rows[r] = new HashSet<Character>();
            cols[r] = new HashSet<Character>();
            boxes[r] = new HashSet<Character>();
        }

        for(int r = 0; r < N; r++) {
            for(int c = 0; c < N; c++) {
                char val = board[r][c];

                // Check if position is not filled with number
                if(val == '.') {
                    continue;
                }

                // Check the row
                if(rows[r].contains(val)) {
                    return false;
                }
                rows[r].add(val);

                // Check the column
                if(cols[c].contains(val)) {
                    return false;
                }
                cols[c].add(val);

                // Check the box
                int index = (r / 3) * 3 + (c / 3);
                if(boxes[index].contains(val)) {
                    return false;
                }
                boxes[index].add(val);
            }
        }

        return true;
    }
}
