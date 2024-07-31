class Solution {
    // Function to find the smallest positive number missing from the array.
    static int missingNumber(int arr[], int size)
    {
  
        Arrays.sort(arr);
        int num = 1;
        if(int i=0;i<size;i++){
            if(arr[i] == num && arr[i] >= 1){
                num++;
                
            }
            
        }
        return num;
    }
}