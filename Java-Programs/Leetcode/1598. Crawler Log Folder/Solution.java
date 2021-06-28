// The Leetcode file system keeps a log each time some user performs a change folder operation.

// The operations are described below:

// "../" : Move to the parent folder of the current folder. (If you are already in the main folder, remain in the same folder).
// "./" : Remain in the same folder.
// "x/" : Move to the child folder named x (This folder is guaranteed to always exist).
// You are given a list of strings logs where logs[i] is the operation performed by the user at the ith step.

// The file system starts in the main folder, then the operations in logs are performed.

// Return the minimum number of operations needed to go back to the main folder after the change folder operations.

class Solution {
    public int minOperations(String[] logs) {
        List<String> l = new ArrayList<String>();
        for(String s:logs)
        {
            if((s.equals("../") && l.size()==0) || s.equals("./")){}
            else if(s.equals("../"))
            {
                l.remove(l.size()-1);
            }
            else
                l.add(s);
                
            
        }
        return l.size();
    }
}

(or)

class Solution {
    public int minOperations(String[] logs) {
        int val = 0;
        for(String s:logs)
        {
            
            if(s.equals("../"))
            {
                val = Math.max(0,--val);
            }
            else if(s.equals("./"))
                continue;
            else
                val++;
                
            
        }
        return val;
    }
}
