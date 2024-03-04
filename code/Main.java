package code;

public class Main {
    public static void main(String[]args){
        Dog dog1 = new Dog("Benz", "shepherd");
        Dog dog2 = new Dog("TOny", "Spitz");

        System.out.println(dog1.getName() + " is a breed of " + dog1.getBreed());
        System.out.println(dog2.getName() + " is a breed of " + dog2.getBreed());
        
        dog1.setBreed("caucasian");
        dog2.setName("Kevo");

        System.out.println(dog1.getName() + " is a breed of " + dog1.getBreed());
        System.out.println(dog2.getName() + " is a breed of " + dog2.getBreed());

    }
    
}
