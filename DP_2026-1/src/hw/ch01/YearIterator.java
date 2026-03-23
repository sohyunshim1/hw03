//연도역순으로 책을 순회하는 YearIterator 클래스입니다
// 
package hw.ch01;

import java.util.Iterator;
import java.util.Arrays;
import java.util.Comparator;


public class YearIterator implements Iterator<Book> {
    private Book[] sortedBooks;
    private int index = 0;
    // 생성자에서는 BookShelf에서 책들을 가져와서 배열에 저장한다
    public YearIterator(BookShelf bookShelf) {
        sortedBooks = new Book[bookShelf.getLength()];

        for (int i = 0; i < bookShelf.getLength(); i++) {
            sortedBooks[i] = bookShelf.getBookAt(i);
        }

    // 책 배열을 출판연도 역순으로 정렬한다
        Arrays.sort(sortedBooks, new Comparator<Book>() {
            @Override
            public int compare(Book b1, Book b2) {
                return b2.getYear() - b1.getYear(); // 내림차순
            }
        }); // 큰 값 먼저 → 최신순
    }
    // hasNext()는 정렬된 책 배열에서 다음 위치에 책이 있는지 확인한다
    @Override
    public boolean hasNext() {
        return index < sortedBooks.length;
    }
    // next()는 정렬된 책 배열에서 현재 위치의 책을 반환한다
    @Override
    public Book next() {
        return sortedBooks[index++];
    }
}