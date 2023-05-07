class accounts {
    public int maximumWealth(int[][] accounts) {
        int m=accounts.length,su=0,n;
        int []sum=new int[m];
        for(int i=0;i<m;i++){
            n=accounts[i].length;
            for(int j=0;j<n;j++){
                su=su+accounts[i][j];            
            }
            sum[i]=su;
        }
        int resul=sum[0];
        /* for(int k=0;k<m;k++){
            if(sum[k]<sum[k+1]){
                resul=sum[k+1];
            }
            else{
                resul=sum[k];
            }
        } */

        for(int k=0;k<m;k++)
            if (sum[k]>resul)
                resul=sum[k];
        return resul;
    }
}