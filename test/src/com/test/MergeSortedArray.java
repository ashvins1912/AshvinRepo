/**
 * Merge second sorted array into the first one in-place.
 * arr1 has length = arr2.length + realElements and contains
 * realElements sorted items followed by zeros.
 */
public static void merge(int[] arr1, int[] arr2) {
    int real = arr1.length - arr2.length;   // how many non-zero, sorted items in arr1
    int i = real - 1;                       // last real item in arr1
    int j = arr2.length - 1;                // last item in arr2
    int k = arr1.length - 1;                // position to fill in arr1

    // keep dropping the larger of arr1[i] and arr2[j] at arr1[k]
    while (j >= 0) {                        // stop when arr2 is exhausted
        if (i >= 0 && arr1[i] > arr2[j]) {
            arr1[k--] = arr1[i--];          // move arr1 element
        } else {
            arr1[k--] = arr2[j--];          // move arr2 element
        }
    }
}
