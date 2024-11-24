public class Duplicate {
    public static void main(String[] args) {
        int arr[] = { 2, 1, 1, 3, 6 };
        int xor = 0;
        for (int e : arr) {
            xor = xor ^ e;
        }
        System.out.println(xor);
    }
}
