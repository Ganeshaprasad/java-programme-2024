package javaconceptpractice;

class Animal {
    int age;

    public Animal(int age) {
        this.age = age;
    }

    public void display() {
        System.out.println("Animal age: " + age);
    }
}

class Dog extends Animal {
    String breed;

    public Dog(int age, String breed) {
        super(age);  // 'super' calls the parent class constructor
        this.breed = breed;
    }

    public void display() {
        super.display();  // Calls the parent class 'display' method
        System.out.println("Dog breed: " + breed);
    }

    public static void main(String[] args) {
       // Animal a=new Animal(10);
        Dog d =new Dog(20,"XYZ");
        System.out.println(d.age);
       d.display();

    }
}
