package ch01;

public class Person {

    String name;
    int age;

    public Person(){
        this("noname", 1);
    }

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void showPersion(){
        System.out.println(name+", "+age);
    }

    public Person getPerson(){
        return this;
    }

    public static void main(String[] args) {
        
        Person person = new Person();

        person.showPersion();

        System.out.println(person);//메모리의 값을 확인할수 있다.

        Person person2 = person.getPerson();
        System.out.println(person2); //같은 메모리를 확인할 수 있다.


    }
    
}
