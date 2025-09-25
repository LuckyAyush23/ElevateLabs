package com.elevate.lms;

public class LibrarySystem {
    public static void main(String[] args) {
        Books book1 = new Books(1,"Java Programming");
        Books book2 = new Books(2,"Data Structures");

        User user1 = new User(1,"Alice");
        User user2 = new User(2,"Bob");

        Library library = new Library();

        library.issueBook(book1, user1);
        library.issueBook(book1, user2);
        library.returnBook(book1);
        library.issueBook(book1, user2);
    }
}
