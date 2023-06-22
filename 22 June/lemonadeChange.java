class Solution {
    static boolean lemonadeChange(int N, int bills[]) {
        // code here
        int sum5 =0;
        int sum10 =0;
        for(int i=0; i<N; i++){
            int j = bills[i];
            if(j == 5){
                sum5++;
            }else if (j == 10){
                sum5--;
                if (sum5<0){
                    return false;
                }
                sum10++;
            }else if (j == 20){
                if (sum10 >= 1 && sum5 >=1){
                    sum10--;
                    sum5--;
                } else if (sum5 >=3){
                    sum5-=3;
                } else{
                    return false;
                }
            }
        }
        return true;
    }
}
