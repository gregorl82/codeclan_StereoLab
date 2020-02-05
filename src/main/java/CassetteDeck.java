public class CassetteDeck extends Component implements IStopStart, IEject {

    private boolean isPlaying;

    public CassetteDeck(String make, String model){
        super(make, model);
        this.isPlaying = IStopStart.isPlaying;
    }

    public boolean isPlaying() {
        return isPlaying;
    }

    public void play(){
        this.isPlaying = true;
    }

    public void stop(){
        this.isPlaying = false;
    }

    public String eject(){
        return "Tape ejected";
    }

    public String pause(){
        return "Tape paused";
    }

}
