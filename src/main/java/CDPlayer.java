public class CDPlayer extends Component implements IStopStart, IEject {

    private boolean isPlaying;

    public CDPlayer(String make, String model){
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

    public String skip(){
        return "Track skipped";
    }

    public String eject(){
        return "CD Ejected";
    }

    public String pause(){
        this.isPlaying = false;
        return "Track paused";
    }

}
