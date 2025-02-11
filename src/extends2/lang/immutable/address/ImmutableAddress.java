package extends2.lang.immutable.address;

public class ImmutableAddress {

    //불변으로 생성 및 set메서드 삭제, 의도 명확
    private final String value;

    public ImmutableAddress(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Address{" +
                "value='" + value + '\'' +
                '}';
    }
}
