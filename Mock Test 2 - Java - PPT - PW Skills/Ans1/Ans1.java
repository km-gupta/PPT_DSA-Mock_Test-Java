class Animal {
    public void makeSound(){
        System.out.println("Animal Sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog Sound");
    }
}
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat Sound");
    }
}
class Cow extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cow Sound");
    }
}
class Ans1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();
        dog.makeSound();
        cat.makeSound();
        cow.makeSound();
    }
}
