public class Radio extends Component {

    private String tunedStation;

    public Radio(String make, String model){
        super(make, model);
        this.tunedStation = null;
    }

    public String getTunedStation() {
        return tunedStation;
    }

    public void tuneToStation(String station) {
        this.tunedStation = station;
    }
}
