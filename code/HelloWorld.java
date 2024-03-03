package code;

import java.time.LocalDate;

class HelloWorld {
    public static void main(String[]args){
        User user = new User();

        user.name = "Kevin";
        user.birthDay = LocalDate.parse("2002-10-23");

        Book book = new Book();
        book.title = "Camilla";
        book.author = "Tom";

        user.borrow(book);

       
        System.out.printf("%s has borrowed this book: %s", user.name,user.books.toString());

       
    }
}
