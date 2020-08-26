package course.udemy.buchalka.innerclasses;

import java.util.ArrayList;

public class Shelf {

  private String name;
  private ArrayList<MyBook> books;

  public Shelf(String name) {
    this.name = name;
    MyBook book1 = new MyBook("Valami", "Laci");
    this.books.add(book1);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ArrayList<MyBook> getBooks() {
    return books;
  }

  public void setBooks(ArrayList<MyBook> books) {
    this.books = books;
  }

  public class MyBook {

    private String title;
    private String author;

    public MyBook(String title, String author) {
      this.title = title;
      this.author = author;
    }

    public String getTitle() {
      return title;
    }

    public void setTitle(String title) {
      this.title = title;
    }

    public String getAuthor() {
      return author;
    }

    public void setAuthor(String author) {
      this.author = author;
    }
  }
}
