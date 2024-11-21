public class Matrix_addition {
   public static void main(String args[]){
    int i,j,k;
    int a[][]={{4,6},{6,4}};
    int b[][]={{8,2},{2,5}};
    int c[][]=new int[2][2];
     for(i=0;i<2;i++){
        for(j=0;j<2;j++){
            c[i][j]=0;
            for(k=0;k<2;k++){
                c[i][j]+=a[i][k]+b[k][j];
            }
        }
     }
   } 
}
