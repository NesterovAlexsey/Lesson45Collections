public class Book {

  private final String author;

  private final String bookName;

  private final int numberOfPages;

  public Book(String author, String bookName, int numberOfPages) {
    this.author = author;
    this.bookName = bookName;
    this.numberOfPages = numberOfPages;
  }

  public String getAuthor() {
    return author;
  }

  public String getBookName() {
    return bookName;
  }

  public int getNumberOfPages() {
    return numberOfPages;
  }
}
