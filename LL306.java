class LL306{
 
    // 2373. Largest Local Values in a Matrix

    // Appraoch --> Implementation Type Question
     public int findMax( int[][] grid, int i, int j) {
        int maxValue = -(int)1e9;
        for( int m = i ; m < i + 3 ; m++){
            for( int n = j ; n < j + 3 ; n++) {
                maxValue = Math.max(maxValue,grid[m][n]);
            }
        }
        return maxValue;
    }
    public int[][] largestLocal(int[][] grid) {
        int n = grid.length;
       int[][] ans = new int[n-2][n - 2];
       for( int i = 0 ; i < n-2 ; i++) {
           for( int j = 0 ; j < n-2 ; j++) {
               ans[i][j] = findMax(grid,i,j);
           }
       }
    return ans;
    }

    // =====================================================================================

    // 2374. Node With Highest Edge Score

    // Appraoch --> freq arr or HashMap

    // Mistake --> Used int instead of long

    public int edgeScore(int[] edges) {
        // int[] freq = new int[(int)1e5];
        Map<Integer, Long> map = new HashMap<>();
        
        for( int i = 0 ; i < edges.length ; i++) {
            Integer val = edges[i];
            if( edges[i] != i) {
            if( map.containsKey( val ) == true) {
                 Long of = map.get(val);
                 map.put(val, of + i);
            }else{
                map.put(val,i * 1L);
            }
            }
             
        }
        int i=0;  
        long maxVal=i;  
        int maxNode = 0;
        for( Integer val : map.keySet()){
             Long freq = map.get(val);
             if( freq > maxVal) {
                 maxVal = freq;
                 maxNode = val;
             }
        }
        return maxNode;
    }


//   2375. Construct Smallest Number From DI String

// Appraoch --> Use Stack ( Level 1 Questions)

      public String smallestNumber(String pattern) {
        Stack<Integer> st = new Stack<>();
        int num = 1;
        String str = "";
        for( int i = 0 ; i < pattern.length() ; i++) {
            
            char ch = pattern.charAt(i);
            if(ch == 'D'){
            st.push(num);
            num++;
            }else{
            st.push(num);
            num++;
                
                while( st.size() > 0) {
                    str += st.pop();
                }
            }
          
        }
        st.push(num);
        while(st.size() > 0) {
            str += st.pop();
        }
        return str;
    }


    // =====================================================================

    // 2376. Count Special Integers  ----------> Could not solve
// 
    // Appraoch --> Digit DP
// /
}