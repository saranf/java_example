package ch02;
public class ObjectCopyTest {

    public static void main(String[] args) {
        
        Book[] library = new Book[5];
        Book[] copylibrary = new Book[5];


        library[0]= new Book("태백산맥1","조정래");
        library[1]= new Book("태백산맥2","조정래");
        library[2]= new Book("태백산맥3","조정래");
        library[3]= new Book("태백산맥4","조정래");
        library[4]= new Book("태백산맥5","조정래");

        System.arraycopy(library, 0, copylibrary,0,5 );

        copylibrary[0] = new Book();
        copylibrary[1] = new Book();
        copylibrary[2] = new Book();
        copylibrary[3] = new Book();
        copylibrary[4] = new Book();

        for(int i=0; i<library.length; i++){
            copylibrary[i].setAuthor(library[i].getAuthor());
            copylibrary[i].setTitle(library[i].getTitle());
        }

     /*   System.out.println("==library==");
        for(Book book: library){
            System.out.println(book);
            book.showInfo();
        }

        System.out.println("==copylibrary==");
        for(Book book: copylibrary){
            System.out.println(book);
            book.showInfo();
        }*/
        library[0].setAuthor("박완서");
        library[0].setTitle("나육");
        System.out.println("==library==");
        for(Book book: library){
            System.out.println(book);
            book.showInfo();
        }

        System.out.println("==copylibrary==");
        for(Book book: copylibrary){
            System.out.println(book);//각각의 객체를 생성하여 그 객체의 값을 복사하여 서로 다른 객체를 가르키도록 한다.
            book.showInfo();
        }
    }
    
}
