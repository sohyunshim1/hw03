package hw.ch01;
//장르 별로 책을 순회하는 Iterator 클래스를 추가
import java.util.Iterator;

public class GenreIterator implements Iterator<Book> {
    private BookShelf bookShelf; // 책저장소
    private int index = 0; // 현재위치 인덱스
    private String genre; // 찾을 장르

    public GenreIterator(BookShelf bookShelf, String genre) {
        this.bookShelf = bookShelf;
        this.genre = genre;
    }
    

    
    // hasNext()는 현재 위치에서 다음 위치로 이동하면서
    //  찾는 장르의 책이 있는지 확인한다
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

    // next()는 hasNext()에서 찾은 위치의 책을 반환한다
    @Override
    public Book next() {
        return bookShelf.getBookAt(index++);
    }
}