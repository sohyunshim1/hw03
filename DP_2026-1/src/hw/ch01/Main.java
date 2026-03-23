package hw.ch01;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(10);
        //Step 4: Main 클래스 수정
        //주어진 테이블의 책 데이터를 갖도록 한다
        bookShelf.appendBook(new Book("클린코드", "기술", 2008, 30000));
        bookShelf.appendBook(new Book("해리포터와 마법사의 돌", "소설", 1997, 15000));
        bookShelf.appendBook(new Book("사피엔스", "역사", 2011, 18000));
        bookShelf.appendBook(new Book("이펙티브 자바", "기술", 2018, 36000));
        bookShelf.appendBook(new Book("객체지향의 사실과 오해", "기술", 2015, 20000));
        bookShelf.appendBook(new Book("레미제라블", "소설", 1862, 12000));
        bookShelf.appendBook(new Book("총균쇠", "역사", 1997, 22000));
        bookShelf.appendBook(new Book("리팩터링", "기술", 2018, 34000));
        bookShelf.appendBook(new Book("로마인 이야기", "역사", 1992, 25000));
        bookShelf.appendBook(new Book("어린왕자", "소설", 1943, 9000));
        

        // 명시적으로 Iterator를 사용하는 방법 
        /*
        Iterator<Book> it = bookShelf.iterator();
        while (it.hasNext()) {
            Book book = it.next();
            System.out.println(book.getName());
        }
        */
       //[4-2] 장르 필터 Iterator 를 테스트
        //장르 필터 Iterator 객체를 이용하여 ‘소설’ 장르에 해당하는 책들을 차례대로 꺼내
        //각 항목을 보기 좋게 출력한다
        System.out.println("===20230831 심소현 ===\n");
        System.out.println("=== 소설 책 ===");
        Iterator<Book> it1 = bookShelf.iteratorByGenre("소설");
        while (it1.hasNext()) {
            Book book = it1.next();
            System.out.println(
                book.getName() + " | " +
                book.getGenre() + " | " +
                book.getYear() + " | " +
                book.getPrice()
            );
        }


        System.out.println();


        //[4-3] 출판연도 역순 Iterator 를 테스트
        //장르 필터 Iterator 객체를 이용하여 최신 책부터 차례대로 꺼내 와서 
        // 각 항목을 보기 좋게 출력한다
        System.out.println("=== 최신순 책 목록 ===");

        Iterator<Book> it2 = bookShelf.iteratorByYear();

        while (it2.hasNext()) {
            Book book = it2.next();
            System.out.println(
                book.getName() + " | " +
                book.getGenre() + " | " +
                book.getYear() + " | " +
                book.getPrice()
            );
        }

        // 확장 for문을 사용하는 방법
        /* 
        for (Book book: bookShelf) {
            System.out.println(book.getName());
        }
        System.out.println();
        */


    }
}
