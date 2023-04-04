class Solution{
	int minSteps(String str) {
		//Write your code here
		int ca=1;
    int cb=1;
    if(str.charAt(str.length()-1)=='b') cb++;
    if(str.charAt(str.length()-1)=='a') ca++;
    for(int i=0 ;i<str.length()-1 ;i++){
        if(str.charAt(i)=='b' && str.charAt(i+1)=='a') cb++;
        if(str.charAt(i)=='a' && str.charAt(i+1)=='b') ca++;
    }
    return Math.min(cb,ca);
	}
}
