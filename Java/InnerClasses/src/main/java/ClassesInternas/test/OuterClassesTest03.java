package ClassesInternas.test;

public class OuterClassesTest03 {
    private String name = "Kayky";

    static class Nested{
        public void print(){
            System.out.println(new OuterClassesTest03().name);
        }
    }

    public static void main(String[] args) {
        Nested nested = new Nested();
        nested.print();
    }
}
