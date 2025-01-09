package extends1.ex;

public class Book extends Item {

    //Book 메서드
    private String author;
    private String isbn;

    //부모 공통 변수 초기화 및 Book 초기화
    public Book(String name, int price, String author, String isbn) {
        super(name, price);
        this.author = author;
        this.isbn = isbn;
    }

    @Override
    public void print() {
        super.print();

        System.out.println("- 저자 : " + author + ", isbn : " + isbn);
    }
}
