import java.io.IOException;

public class Car{
    private String nameAuto;

    public Car(String nameAuto) {
        this.nameAuto = nameAuto;
    }

    public String getNameAuto() {
        return nameAuto;
    }

    public void close(){
    System.out.println("Машина жабылып жатат");
    }
    public void drive(){
        System.out.println("Машина журуп жатат");
    }
}
