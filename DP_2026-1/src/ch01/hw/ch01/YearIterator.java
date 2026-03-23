//연도역순으로 책을 순회하는 YearIterator 클래스입니다
// 
package hw.ch01;

import java.util.Iterator;
import java.util.Arrays;
import java.util.Comparator;

public class YearIterator implements Iterator<Book> {
    private Book[] sortedBooks;
    private int index = 0;

    public YearIterator(BookShelf bookShelf) {
        sortedBooks = new Book[bookShelf.getLength()];

        for (int i = 0; i < bookShelf.getLength(); i++) {
            sortedBooks[i] = bookShelf.getBookAt(i);
        }

        Arrays.sort(sortedBooks, new Comparator<Book>() {
            @Override
            public int compare(Book b1, Book b2) {
                return b2.getYear() - b1.getYear(); // 내림차순
            }
        });
    }

    @Override
    public boolean hasNext() {
        return index < sortedBooks.length;
    }

    @Override
    public Book next() {
        return sortedBooks[index++];
    }
}