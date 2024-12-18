package ClassesInternas.dominio;

public class Barco {

    private String name;

    public Barco(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Barco{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
