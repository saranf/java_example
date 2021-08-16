package ch02;

public class CharArrayTest {

    public static void main(String[] args) {
        
        char[] alphabets = new char[26];
        char ch ='A';

        for(int i=0; i<alphabets.length;i++){
            alphabets[i]=ch++;
        }
        for(char alpa : alphabets){
            System.out.println(alpa +","+(int)alpa);
        }
    }
    
}
