import java.util.*;

class ArrayBase {
    protected int[] arr;

    public ArrayBase(int[] arr) {
        this.arr = arr;
    }

    public int findMax() {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}

class ArrayData extends ArrayBase {

    public ArrayData(int[] arr) {
        super(arr);
    }

    @Override
    public String toString() {
        return Arrays.toString(arr);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof ArrayData)) return false;

        ArrayData other = (ArrayData) obj;
        return Arrays.equals(this.arr, other.arr);
    }
}
class Unit3_CRPC_code5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] values = new int[n];

        for (int i = 0; i < n; i++) {
            values[i] = sc.nextInt();
        }

        ArrayData data = new ArrayData(values);

        System.out.println(data.findMax());
    }
}