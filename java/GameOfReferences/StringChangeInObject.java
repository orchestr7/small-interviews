class A {
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    A(String val) {
        this.value = val;
    }
}

// ===== main call =====

class StringChangeInObject {
    public static void main(String[] args) {
        A a = new A("a");
        A b = new A(a.getValue());
        a.setValue("b");

        System.out.println(b.getValue());
    }
}
