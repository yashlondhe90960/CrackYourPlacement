class Solution {

    int tour(int petrol[], int distance[]) {
        int n = petrol.length;

        
        int start = 0;
        int end = 1;

        int cur_pet = petrol[start] - distance[start];

        
        while ((end != start || cur_pet < 0) && end < n) {
            
            while (cur_pet < 0 && start != end && start < n) {
                
                cur_pet -= petrol[start] - distance[start];
                start = (start + 1) % n;

                
                if (start == 0)
                    return -1;
            }
            
            cur_pet += petrol[end] - distance[end];
            end = (end + 1) % n;
        }
        
        return start;
    }
}