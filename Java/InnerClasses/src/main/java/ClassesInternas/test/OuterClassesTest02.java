package ClassesInternas.test;

public class OuterClassesTest02 {
    private String name = "Kayky";

    void print(){
        class LocalClass{
            final String lastName = "Oliveira";
            public void printLocal(){
                System.out.println(name + " " + lastName);
            }
        }
        new LocalClass().printLocal();
    }

    public static void main(String[] args) {
        OuterClassesTest02 outerClasses = new OuterClassesTest02();
        outerClasses.print();
    }
}
