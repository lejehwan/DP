package builder_pattern;

public class Car {

    private String engine;
    private int wheels;
    private String color;
    private boolean hasGPS;
    private boolean hasSunroof;

    private Car(Builder builder) {
        this.engine = builder.engine;
        this.wheels = builder.wheels;
        this.color = builder.color;
        this.hasGPS = builder.hasGPS;
        this.hasSunroof = builder.hasSunroof;
    }

    @Override
    public String toString() {
        return "소개{" +
                "엔진은 '" + engine + '\'' + "이고" +
                ", 바퀴는 " + wheels + "개 이며" +
                ", 색상은 '" + color + '\'' + "입니다." +
                " 선택 옵션은 각각" +
                ", GPS는 " + hasGPS +
                ", sunroof는 " + hasSunroof +
                " 입니다." +
                '}';
    }

    public static class Builder {
        // 필수 요소
        private final String engine;
        private final int wheels;
        private final String color;

        // 선택 요소
        private boolean hasGPS;
        private boolean hasSunroof;

        // 필수 필드의 생성자
        public Builder(String engine, int wheels, String color) {
            this.engine = engine;
            this.wheels = wheels;
            this.color = color;
        }

        // 선택 필드를 설정하는 메서드(체이닝을 위해 자신 반환)
        public Builder withGPS(boolean hasGPS) {
            this.hasGPS = hasGPS;
            return this;
        }

        public Builder withSunroof(boolean hasSunroof) {
            this.hasSunroof = hasSunroof;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}
