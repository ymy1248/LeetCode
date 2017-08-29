class Solution {
    public void rotate(int[][] matrix) {
        int len = matrix.length;
        
        for (int i = 0; i < len / 2; i++) {
            for (int j = i; j < len - i - 1; j++) {
                int reg = matrix[i][j];
                matrix[i][j] = matrix[len - 1 - j][i];
                matrix[len - 1 - j][i] = matrix[len - i - 1][len - 1 - j];
                matrix[len - i - 1][len - 1 - j] = matrix[j][len - 1 - i];
                matrix[j][len - 1 - i] = reg;
                // System.out.println("---------------------------");
                // for (int[] a : matrix)
                //     System.out.println(Arrays.toString(a));
            }
        }
    }
}
