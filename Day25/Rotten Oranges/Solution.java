class Solution {
    
    public int orangesRotting(int[][] grid) {
        int ct = 0, res = -1;

       
        Queue<ArrayList<Integer>> q = new LinkedList<>();
        int[] dx = { -1, 1, 0, 0 };
        int[] dy = { 0, 0, -1, 1 };

        
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                
                if (grid[i][j] > 0)
                    ct++;
                
                if (grid[i][j] == 2) {
                    ArrayList<Integer> temp = new ArrayList<>();
                    temp.add(i);
                    temp.add(j);
                    q.add(temp);
                }
            }
        }

        while (!q.isEmpty()) {
          
            res++;
            int size = q.size();
            for (int k = 0; k < size; k++) {

                ArrayList<Integer> cur = q.poll();
                ct--;


                for (int i = 0; i < 4; i++) {
                    int x = cur.get(0) + dx[i], y = cur.get(1) + dy[i];

                    if (x >= grid.length || x < 0 || y >= grid[0].length || y < 0 || grid[x][y] != 1)
                        continue;
                    grid[x][y] = 2;
                    ArrayList<Integer> temp = new ArrayList<>();
                    temp.add(x);
                    temp.add(y);
                    q.add(temp);
                }
            }
        }
        // returning the minimum time.
        if (ct == 0)
            return Math.max(0, res);
        return -1;
    }
}
