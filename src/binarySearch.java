public class binarySearch {

    public static void main(String[] args) {
        int[] entries = {1,4,89,102,500};
        int search = 102;

        int result = binarySearch(entries, search);

        System.out.println(search + "is at the " + result + "th index.");
    }

    public static int binarySearch(int arr[], int x)
    {
        int l = 0;
        int r = arr.length - 1;

        while (l <= r) {
            int m = l + (r - l) / 2;

            // Check if x is present at mid
            if (arr[m] == x)
                return m;

            // If x greater, ignore left half
            if (arr[m] < x)
                l = m + 1;

                // If x is smaller, ignore right half
            else
                r = m - 1;
        }

        // if we reach here, then element was
        // not present
        return -1;
    }
}
