package ch02;

import javax.xml.crypto.Data;

public class CountTest {

    public static void main(String[] args) {
        
        double[] dArr = new double[5];

        int count =0;

        dArr[0]= 1.1; count ++;
        dArr[1]= 2.1; count ++;
        dArr[2]= 3.1; count ++;

        
        for(int i=0;i<count; i++){
            System.out.println(dArr[i]);
            System.out.println(count);
        }
    }
    
}
