public class Stereo {

    private String name;
    private CDPlayer cdPlayer;
    private Radio radio;
    private CassetteDeck cassetteDeck;
    private int volume;

    public Stereo(String name, CDPlayer cdPlayer, Radio radio, CassetteDeck cassetteDeck) {
        this.name = name;
        this.cdPlayer = cdPlayer;
        this.radio = radio;
        this.cassetteDeck = cassetteDeck;
        this.volume = 50;
    }

    public String getName(){
        return name;
    }

    public void turnOnAllComponents(){
        this.cdPlayer.switchOn();
        this.radio.switchOn();
        this.cassetteDeck.switchOn();
    }

    public void turnOffAllComponents(){
        this.cdPlayer.switchOff();
        this.radio.switchOff();
        this.cassetteDeck.switchOff();
    }

    public void increaseVolume(){
        this.volume++;
    }

    public void decreaseVolume(){
        this.volume--;
    }

    public int getVolume(){
        return volume;
    }

}
