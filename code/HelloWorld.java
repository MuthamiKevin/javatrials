package code;

import java.time.LocalDate;

class HelloWorld {
    public static void main(String[]args){
        User youngerUser = new User();

        youngerUser.name = "Kevin";
        youngerUser.birthDay = LocalDate.parse("2002-10-23");

        System.out.printf("%s was born in %s and he is now %d years old ", 
        youngerUser.name, youngerUser.birthDay.toString(), youngerUser.age());
   
    }
}
