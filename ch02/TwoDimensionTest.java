package ch02;

public class TwoDimensionTest {

    public static void main(String[] args) {
        
        int[][] arr = {{1,2,3}, {1,2,3,4}};

        int i,j;

        for(i=0; i<arr.length;i++){
            for(j=0; j<arr[i].length;j++){
                System.out.println(arr[i][j]+", ");//행을 기준으로 열을 돌려야 한다.
            }
            System.out.println("\t"+ arr[i].length);
        }
    }
    
}
