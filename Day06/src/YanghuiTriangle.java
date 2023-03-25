import java.util.Arrays;

/*
{
	{1}
	{1, 1}
	{1, 2, 1}
	{1, 3, 3, 1}
	{1, 4, 6, 4, 1}
	{1, 5, 10, 10, 5, 1}
	{1, 6, 15, 20, 15, 6, 1}
	{1, 7, 21, 35, 35, 21, 7, 1}
	{1, 8, 28, 56, 70, 56, 28, 8, 1}
	{1, 9, 36, 84, 126, 126, 84, 36, 9, 1}
}
*/
public class YanghuiTriangle {
    public static void main(String[] args) {
        int[][] triangle = new int[10][];

        for (int i = 0; i < triangle.length; i++) {
            triangle[i] = new int[i + 1];
            triangle[i][0] = triangle[i][i] = 1;

            if (i >= 2) {
                for (int j = 1; j < i /*triangle[i].length - 1*/; j++) {
                    triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
                }
            }
        }

        /*System.out.println("{");
        for (int i = 0; i < triangle.length; i++) {
            System.out.print("\t{");
            for (int j = 0; j < triangle[i].length; j++) {
                System.out.print(triangle[i][j]);
                if (j != triangle[i].length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("}");
        }
        System.out.print("}");*/

        System.out.println(Arrays.deepToString(triangle));
    }
}
