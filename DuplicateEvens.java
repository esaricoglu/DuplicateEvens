package Arrays;

public class DuplicateEvens {
    static boolean isFind(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] list = {1, 2, 5, 8, 9, 12, 24, 12, 46, 57, 68, 37, 5, 3, 1, 2, 46, 12, 2};   // 2, 12, 46
        int[] duplicateEvens = new int[list.length];
        int n = 0;

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if ((i != j) && (list[i] == list[j]) && (list[i] % 2 == 0)) {
                    if (isFind(duplicateEvens, list[i]))
                        duplicateEvens[n++] = list[i];
                    break;
                }
            }
        }
        System.out.print("[");
        for (int x : duplicateEvens) {
            if (x != 0) {
                System.out.print(x + ", ");
            }
        }
        System.out.print("\b\b]");
    }
}
