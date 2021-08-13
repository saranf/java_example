package ch02;

public class MakeReport {

    StringBuffer buffer = new StringBuffer(); //늘어날수 있는 String값을 많이 쓴다.
    //StringBuffer 나 StringBulider 를 많이 쓴다. 

    private String line = "================================\n";
    private String title = "이름 \t  주소\t\t  전화번호\n";
    
    private void makeHeader(){
        buffer.append(line);
        buffer.append(title);
        buffer.append(line);
    }

    private void generateBody(){
        buffer.append("James\t");
        buffer.append("Seoul Korea \t");
        buffer.append("010 - 2222 -3333 \n");

        buffer.append("Tomas \t");
        buffer.append("NetWord Us\t");
        buffer.append("010-7777-0987\n");

    }
    private void makeFooter(){
        buffer.append(line);
    }

    public String getReport(){
        makeHeader();
        generateBody();
        makeFooter();
        return buffer.toString();
    }

    
}
