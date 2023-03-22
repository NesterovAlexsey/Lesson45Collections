//Задача 1
//    Создайте класс Book (книга), в конструктор которого передавайте автора,
//    название книги и количество страниц.
//
//    Реализуйте интерфейс для сравнения книг: они должны сортироваться по авторам,
//    а если авторы совпадают - по названиям (и там, и там - по алфавиту, "в словарном порядке").

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainBookList {
  public static void main(String[] args) {

    List<Book> myBestBook = new ArrayList<>();
    myBestBook.add(new Book("Remark", "Three friends", 200));
    myBestBook.add(new Book("Stevin Kowi", "7 Effective skills", 300));
    myBestBook.add(new Book("Достоевский", "Братья Карамазовы", 680));
    myBestBook.add(new Book("Remark", "No change on the western front", 300));

    Collections.sort(myBestBook);

    for (Book book : myBestBook) {
      System.out.println(book);
    }
  }
}
