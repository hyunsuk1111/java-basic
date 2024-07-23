package ref;

public class NullMain4 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        bigData.data = new Data();

        System.out.println("bigData = " + bigData.count);
        System.out.println("bigData = " + bigData.data);
        System.out.println("bigData = " + bigData.data.value);
    }
}
