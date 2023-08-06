class Solution
{
    public ArrayList<String> permutation(String S)
    {
        //Your code here
        ArrayList<String>al=new ArrayList<>();
        permute(S,al,0,S.length()-1);
        Collections.sort(al);
        return al;
    }
    
    static void permute(String S,ArrayList<String>al,int l,int r){
        if(l==r){
            al.add(S);
            return ;
        }
        for(int i=l;i<=r;i++){
        S=swap(S,l,i);
        permute(S,al,l+1,r);
        S=swap(S,l,i);
        }
        
    }
    static String swap(String S,int l,int r){
        char ch[]=S.toCharArray();
        char temp=ch[l];
        ch[l]=ch[r];
        ch[r]=temp;
        return new String(ch);
    }
	   
}
