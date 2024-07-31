class Solution {
    
    public static long findPages(int n, int[] arr, int m) {
        // Your code here
        if (m > n)
            return -1;

        int low = Arrays.stream(arr).max().getAsInt();
        int high = Arrays.stream(arr).sum();

        while (low <= high) {
            int mid = (low + high) / 2;
            int students = countStudents(arr, mid);
            if (students > m) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return low;
    }

    public static int countStudents(int[] arr, int pages) {
        int n = arr.length; // size of array
        int students = 1;
        long pagesStudent = 0;
        for (int i = 0; i < n; i++) {
            if (pagesStudent + arr[i] <= pages) {
                // add pages to current student
                pagesStudent += arr[i];
            } else {
                // add pages to next student
                students++;
                pagesStudent = arr[i];
            }
        }
        return students;
    }
};