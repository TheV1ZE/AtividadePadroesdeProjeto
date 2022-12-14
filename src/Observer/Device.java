package Observer;

public class Device implements Observer{

    private String name;

    public Device(String name) {
        super();
        this.name = name;
    }

    public void notify(Observable observable, String message) {
        System.out.println("NOTIFICACAO PARA " + name + ": " + message);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
