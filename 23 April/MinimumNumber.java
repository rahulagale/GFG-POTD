class Solution {
    public static int minimumNumber(int n, int[] arr) {
        // code here
        int z=0;

       for(int i=0;i<n-1;i++){

         if(arr[z]>0 &&arr[i+1]>0){

           if(arr[z]>=arr[i+1]){

               arr[z]=arr[z]%arr[i+1];

               if(arr[z]==1) return(1);

               if(arr[z]!=0) arr[i+1]=arr[i+1]%arr[z];

               else z=i+1;

               if(arr[i+1]==1) return(1);

           }

           else{

               arr[i+1]=arr[i+1]%arr[z];

               if(arr[i+1]==1) return(1);

               if(arr[i+1]!=0) arr[z]=arr[z]%arr[i+1];

               if(arr[z]==0) z=i+1;

               if(arr[z]==1) return(1);

       }}

       else{

           if(arr[z]<=0) z=i+1;

       }

    }

    int max=0;

    for(int i=0;i<n;i++){

      // System.out.println(arr[i]);

        if(max<arr[i]) max=arr[i];

    }

    return max;
    }
}
