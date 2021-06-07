// Given an integer numRows, return the first numRows of Pascal's triangle.

// In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:
//   Example 1:

// Input: numRows = 5
// Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
// Example 2:

// Input: numRows = 1
// Output: [[1]]

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> a = new ArrayList<List<Integer>>(numRows);
        int sum =0;
        for(int i=0;i<numRows;i++)
        {
            a.add(new ArrayList<Integer>(i+1));
            for(int j=0;j<=i;j++)
            {
                if(i==0){
                   a.get(i).add(1);
                }
                else if(j==0 || j==i){
                    a.get(i).add(1);
                }
                else{
                    sum = a.get(i-1).get(j-1)+a.get(i-1).get(j);
                    a.get(i).add(sum);
                }
                
            }
        }
        return a;
    }
}
