public class binary {

    public static void main(String[] args) {
        int[] array = {1, 3, 6, 8, 10};
        int key = 10;
        int start = 0;
        int end = array.length - 1;

//        System.out.println(mid);
        while (start <= end) {

            int mid = (start + end) / 2;
            if (array[mid] == key) {
                System.out.println(mid);
            }
            if (key > array[mid]) {
                start = mid + 1;

            } else {

                end = mid - 1;
            }

//            mid=start+end/2;
        }

    }
}
