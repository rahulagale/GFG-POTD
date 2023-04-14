class Solution {
    public static boolean match(List<int[]> list, int i) {
        return ((list.get(i)[0] == list.get(i+1)[0]) && 
        (list.get(i)[1] == list.get(i+1)[1]));
    }
    public static int finLength(int N, int[] color, int[] radius) {
        // code here
        int cnt = 0;
        List<int[]> list = new ArrayList<>();
        for(int i = 0; i < N; i++) {
            list.add(new int[]{color[i], radius[i]});
        }
        for(int i = 0; i < list.size()-1;) {
            if(match(list, i)) {
                cnt += 2;
                list.remove(i);
                list.remove(i);
                if(i > 0) i--;
            } else i++;
        }
        return N - cnt;
    }
}
