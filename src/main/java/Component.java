public abstract class Component {

    private String make;
    private String model;
    private boolean isSwitchedOn;

    public Component(String make, String model) {
        this.make = make;
        this.model = model;
        this.isSwitchedOn = false;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public boolean isSwitchedOn() {
        return isSwitchedOn;
    }

    public void switchOn(){
        this.isSwitchedOn = true;
    }

    public void switchOff(){
        this.isSwitchedOn = false;
    }
}
