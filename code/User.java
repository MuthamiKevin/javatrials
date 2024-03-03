package code;

import java.time.LocalDate;
import java.time.Period;

public class User {
    public String name;
    public LocalDate birthDay;

    public int age(){
        int age = Period.between(this.birthDay, 
    LocalDate.now()).getYears();

        return age;
    }
    
}
