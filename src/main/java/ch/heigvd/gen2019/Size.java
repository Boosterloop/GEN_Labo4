package ch.heigvd.gen2019;

public enum Size {

        xs(1,"XS"),
        s(2, "S"),
        m(3, "M"),
        l(4, "L"),
        xl(5, "XL"),
        xxl(6, "XXL"),
        noSize(-1, "Invalid Size");

        private int value;
        private String label;

        Size(int value, String label) {
            this.value = value;
            this.label = label;
        }

        int getValue() {
            return value;
        }

        public String toString() {
            return label;
        }

}
