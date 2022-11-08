package ru.mirea.workfourone.task3;

public class Person {
    private String fullName;
    private int age;

    public void move(){
        System.out.println(this + " идет");
    }
    public void talk(){
        System.out.println(this + " говорит");
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public Person() {
        this.fullName = "default";
        this.age = 0;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                '}';
    }
}
