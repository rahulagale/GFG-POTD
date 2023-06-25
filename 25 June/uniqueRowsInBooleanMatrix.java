class GfG
{
    public static ArrayList<ArrayList<Integer>> uniqueRow(int a[][],int r, int c)
    {
        //add code here.
        HashSet<ArrayList> set = new HashSet<>();
        ArrayList<ArrayList<Integer>> al2=new ArrayList<>();
        ArrayList<Integer> list1;
        for(int i=0;i<r;i++){
            list1=new ArrayList<>();
            int n=set.size();
            for(int j=0;j<c;j++){
                 list1.add(a[i][j]);
            }
            set.add(list1);
            if(n!=set.size()){
                al2.add(list1);
            }
            
            
        }
        return al2;
    }
}
