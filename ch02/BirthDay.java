package ch02;

public class BirthDay {

    private int day; //default = 0
    private int month;
    private int year;

    private boolean isVaild; //default = false
    //유효한지 아닌지만 체크하는것이기 때문에 getisVaild만 제공을 한다.

    public int getDay(){
        return day;
    }

    public void setDay(int day){
        this.day = day;
    }

    public int getMonth(){
        return month;
    }
    
    public void setMonth(int month){
        if(month <1 || month>12){
            isVaild=false;
        }
        else{
            isVaild=true;
            this.month = month;
        }
        
    }

    public int getYear(){
        return year;
    }
    public void setYear(int year){
        this.year= year;
    }

    public void showDate(){
        if(isVaild){
            System.out.println(year+"년 "+month+"월"+day+"일 입니다.");
        }
        else{
            System.out.println("유효하지 않은 날짜 입니다.");
        }
    }

    
}
