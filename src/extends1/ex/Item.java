package extends1.ex;

public class Item {
    //상속관계일 경우 자식클래스에서 부모클래스의 생성자를 호출해야한다.

    //공통변수
    private String name;
    private int price;

    //생성자
    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    //공통 메서드_출력
    public void print() {
        System.out.println("이름 :  " + name + ", 가격 : " + price);
    }

    public int getPrice() {
        return price;
    }
}

