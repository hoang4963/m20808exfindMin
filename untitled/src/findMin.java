import java.util.Scanner;
public class findMin {
    public static void main(String[] args) {
        int[] arr = makeArr();
        System.out.print(" phan tu nho nhat trong mang vua nhap la " + findMin(arr));
    }
    public static int[] makeArr() {
        Scanner scanner = new Scanner(System.in);
        int length;
        System.out.print("nhap do dai mang: ");
        length = scanner.nextInt();
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("nhap phan tu thu " + i);
            arr[i] = scanner.nextInt();
        }
        return arr;
    }
    public static int findMin(int[] arr) {
        int min;
        min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[0]){
                min = arr[0];
            }
        }
        return min;
    }
}
