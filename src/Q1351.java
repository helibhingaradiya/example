public class Q1351
{
    public static void main(String[] args) {
        int[][] grid={{5,7,0},{-5,-5,-5}};
        int count=0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j]<0){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
