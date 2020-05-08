import java.util.Scanner;

public class TinhTongCot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập chiều dài mảng: ");
        int height = sc.nextInt();
        System.out.print("Nhập chiều rộng mảng: ");
        int width = sc.nextInt();

        int[][] matrix = new int[height][width];

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("Mời nhập phần tủ [" + i + "][" + j + "] của mảng: ");
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.print("Mời nhập cột cần tính tổng: ");
        int index = sc.nextInt(), sum = 0;

        if (index <= 0 || index >= width) {
            System.out.println("Không tính được");
        }
        else {
            for (int i = 0; i < height; i++) {
                sum += matrix[i][index];
            }
            System.out.println("Tổng của côt " + index + " trong mảng là: " + sum);

        }
   }
}
