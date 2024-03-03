package code;

import java.time.LocalDate;

class HelloWorld {
    public static void main(String[]args){
        User youngerUser = new User();

        youngerUser.name = "Kevin";
        youngerUser.birthDay = LocalDate.parse("2002-10-23");

        System.out.printf("%s was born in %s and he is now %d years old ", 
        youngerUser.name, youngerUser.birthDay.toString(), youngerUser.age());
   
        User olderUser = new User();

        olderUser.name = "Farhan Senior";
        olderUser.birthDay = LocalDate.parse("1974-02-23");

        System.out.printf("%s was born in %s and he is now %d years old ", 
        olderUser.name, olderUser.birthDay.toString(), olderUser.age());
   
    }
}
