class Solution{
    static int setSetBit(int x, int y, int l, int r){
        // code here
        int k = 1<<(l-1);
        int temp = 0;
        while(l<=r){
            temp|=k;
            k<<=1;
            l++;
        }
        y&=temp;
        x|=y;
        return x;
    }
}
