class Solution {
    public List<Integer> generated(int row) {
        List<Integer> l=new ArrayList<>();
        int ans=1;
        l.add(ans);
        for(int col=1;col<row;col++){
            ans=ans*(row-col);
            ans=ans/col;
            l.add(ans);
        }
        return l;
    }
    public List<List<Integer>> generate(int numRows){
        List<List<Integer>>l=new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            l.add(generated(i));
        }
        return l;
    }
}