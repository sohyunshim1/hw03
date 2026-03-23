package hw.ch01;
//장르 별로 책을 순회하는 Iterator 클래스 GenreIterator를 추가
import java.util.Iterator;

public class GenreIterator implements Iterator<Book> {
    private BookShelf bookShelf;
    private int index = 0;
    private String genre;

    public GenreIterator(BookShelf bookShelf, String genre) {
        this.bookShelf = bookShelf;
        this.genre = genre;
    }

    @Override
    public boolean hasNext() {
        while (index < bookShelf.getLength()) {
            if (bookShelf.getBookAt(index).getGenre().equals(genre)) {
                return true;
            }
            index++;
        }
        return false;
    }

    @Override
    public Book next() {
        return bookShelf.getBookAt(index++);
    }
}