package com.elevate.lms;


public class Library {

    public void issueBook(Books book , User user) {
        if(!book.isIssued()) {
            book.setIssued(true);
            book.setIssuedBy(user);
            System.out.println(user.getName() + " issued the book: " + book.getName());
        }
        else{
            System.out.println("Sorry, " + book.getName() + " is already issued.");
        }
    }

    public void returnBook(Books book) {
        User user = book.getIssuedBy();
        if (user != null) {
            book.setIssuedBy(null);
            book.setIssued(false);
            user.setIssuedBook(null);
            System.out.println(user.getName() + " returned the book: " + book.getName());
        }
        else{
            System.out.println(book.getName() + " has no user assigned.");
        }
    }
}
