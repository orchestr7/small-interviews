public class ObjectPassByReference {
    public static void main(String[] args) {
        IntermediateClass aClass = new IntermediateClass("a");
        IntermediateClass bClass = aClass;

        foo1(aClass);
        System.out.println(bClass.getNameOfClass());
        System.out.println(aClass.getNameOfClass());

        foo0(aClass);
        System.out.println(bClass.getNameOfClass());
        System.out.println(aClass.getNameOfClass());
    }

    public static void foo1(IntermediateClass argument) {
        argument = new IntermediateClass("b");
    }

    public static void foo0(IntermediateClass argument) {
        argument.setNameOfClass("b");
    }
}

public class IntermediateClass {
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
