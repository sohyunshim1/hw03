package hw.ch01;

public class Book {
    private String name;

    private String genre;
    private int year;
    private double price;
    // 필드 추가함

    public Book(String name, String genre, int year, double price) {
        this.name = name;// 기존 생성자
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
