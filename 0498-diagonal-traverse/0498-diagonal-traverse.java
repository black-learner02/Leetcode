class Solution {
    public int[] findDiagonalOrder(int[][] mat) {

        HashMap<Integer,List<Integer>> map = new HashMap<>();

        int row=mat.length;
        int col=mat[0].length;

        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                map.putIfAbsent(i+j,new ArrayList<>());
                map.get(i+j).add(mat[i][j]);
            }
        }

       int[] res = new int[row*col];

        int pos=0;
        int ind=0;

         for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
            
            List<Integer> l= map.get(pos);

            if(pos%2==0)
            {
                for(int i=l.size()-1;i>=0;i--)
                {
                    res[ind]=l.get(i);
                    ind++;
                }
            }
            else
            {
                for(int i=0;i<l.size();i++)
                {
                    res[ind]=l.get(i);
                    ind++;
                }
            }
            pos++;

        }

      return res;
        
    }
}