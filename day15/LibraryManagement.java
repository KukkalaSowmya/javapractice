//Library Management System: Create classes for ""Book"" and ""Author"" that represent books and authors in a library. The Book class should have properties such as title, author, ISBN, and publisher, and methods such as getTitle, getAuthor, and setAuthor. The Author class should have properties such as name, email, and a list of books, and methods such as getName, getEmail, and addBook.

import java.util.Scanner;
class Book{
  private String title;
  private String author;
  private String isbn;
  private String publisher;

  public String getTitle(){
    return title;
  }
 
  public String getAuthor(){
    return author;
  }
  public void setAuthor(String author){
    this.author=author;
  } 
}

class Author{
  Book b[];
  int i=0;
  Author(int size){
    b=new Book[size];
  }
  public void addBook(Book book){
    for(int i=0; i<b.length;i++){
      if(b[i].getTitle().equals(add)){
        for(int pos=j; pos<i-1; pos++){
          b[pos]=b[pos+1];
        }
        b[i-1]=null;
        i--;
      }
    }
  }
  public void print(){
    for(int j=0; j<i; j++){
      System.out.println(b[j].getTitle()+ " " +b[j].getAuthor()+ " "+b[j].getIsbn()+ " " +b[j].getpublisher());
    }
  }
  
public class LibraryManagement{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of books:");
    int numBooks = sc.nextInt();
    Book b[] = new Book[numBooks];
    Library l = new Library(numBooks);
    for(int i=0; i<numBooks; i++){
      b[i]=new Book();
      System.out.println("Enter the title:");
      b[i].setTitle(scanner.next());
      System.out.println("Enter the author:");
      b[i].setAuthor(scanner.next());
      System.out.println("Enter the ISBN:");
      b[i].setIsbn(scanner.next());
      System.out.println("Enter the publisher:");
      b[i].setPublisher(scanner.next());
      l.addBook(b[i]);
     l.print();
  }
}
