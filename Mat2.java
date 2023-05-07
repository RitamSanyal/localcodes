public class Mat2 {
    public static void main(String[]args){
        int [][]mat={{1,2,3},{3,4,5},{1,1,1},{5,6,2},{8,1,0}};
        int resul=0;
        for(int []sum:mat){
            int su=0;
            for(int cus:sum){
                su=su+cus;
                System.out.println(su);
            }
            resul=Math.max(resul,su);
        }
//        System.out.println(resul);
        /*int m= mat.length;
        int []arr=new int[m];
//        System.out.println(m);
        for(int i=0;i<m;i++){
            int n=mat[i].length;
            int su=0;
//            System.out.println(n);
            for(int j=0;j<n;j++){
                su=su+mat[i][j];

//                System.out.println(su);
            }
//            System.out.println(su);
            arr[i]=su;
        }
        for(int value:arr){
            System.out.println(value);*/
    }
}
