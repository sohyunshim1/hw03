package hw.ch01;

public class Book {
    private String name;

    private String genre;
    private int year;
    private double price;
    //Book 클래스에 3개 필드를 추가

    public Book(String name, String genre, int year, double price) {
        //기존 Book(String name) 생성자를 유지하면서
        // 새 필드를 받는 생성자를 오버로딩으로 추가
        this.name = name;// 기존 생성자
        
        // 생성자와 getter를 구현함
        this.genre = genre;
        this.year = year;
        this.price = price;
    } 

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }
}
