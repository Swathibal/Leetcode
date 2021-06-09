// 119. Pascal's Triangle II
// Given an integer rowIndex, return the rowIndexth (0-indexed) row of the Pascal's triangle.


// Example 1:

// Input: rowIndex = 3
// Output: [1,3,3,1]
// Example 2:

// Input: rowIndex = 0
// Output: [1]

class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> l = new ArrayList<List<Integer>>();
        for(int i=0;i<=rowIndex;i++)
        {
            l.add(new ArrayList<Integer>());
            for(int j=0;j<=i;j++)
            {
                
                if(j==0 || j==i)
                    l.get(i).add(1);
                else{
                    l.get(i).add(l.get(i-1).get(j-1)+l.get(i-1).get(j));
                    }
            }
        }
        return l.get(rowIndex);
    }
}
