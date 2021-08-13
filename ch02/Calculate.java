package ch02;

public class Calculate {

    public static void main(String[] args) {
        
        Person2 person = new Person2("Edward", 10000);

        Taxi takeName = new Taxi("잘나간다 운수");

        person.takeTaxi(takeName);
        person.showPerson();

        takeName.texiShow();


    }
    
}
