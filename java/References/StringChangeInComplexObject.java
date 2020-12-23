class StringChangeInObject {
    public static void main(String[] args) {
        IntermediateClass aIrClass = new IntermediateClass("a");

        ClassWithAnObjectField a = new ClassWithAnObjectField(aIrClass);
        ClassWithAnObjectField b = new ClassWithAnObjectField(a.getValue());
        a.getValue().setNameOfClass("b");

        // what will be printed here?
        System.out.println(b.getValue().getNameOfClass());
    }
}


class IntermediateClass {
    private String nameOfClass;

    IntermediateClass(String value) {
        nameOfClass = value;
    }

    public String getNameOfClass() {
        return nameOfClass;
    }

    public void setNameOfClass(String val) {
        this.nameOfClass = val;
    }
}

class ClassWithAnObjectField {
    private IntermediateClass value;

    public IntermediateClass getValue() {
        return value;
    }

    public void setValue(IntermediateClass value) {
        this.value = value;
    }

    ClassWithAnObjectField(IntermediateClass val) {
        this.value = val;
    }
}
