import java.util.Scanner;

public class findMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so dong");
        int row = scanner.nextInt();
        System.out.println("Nhap vao so cot");
        int col = scanner.nextInt();
        int[][] arr = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("nhap vao so co hang " + (i + 1) + " cot: " + (j + 1));
                arr[i][j] = scanner.nextInt();
            }
        }
        int max = arr[0][0];
        int id1 = 0, id2 = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    id1 = i;
                    id2 = j;
                }
            }
        }
        System.out.println("So lon nhat trong ma tran la: " + max + " o vi tri hang " + (id1 + 1) + " cot " + (id2 + 1));

    }
}
