 package be.pxl.ja.streamingservice.model;

public class Documentary extends Movie implements Playable{
    private int topic;

    public Documentary(String title, Rating maturityRating, int topic) {
        super(title, maturityRating);
        this.topic = topic;
        setGenre(Genre.DOCUMENTARY);
    }

    public int getTopic() {
        return topic;
    }

    public void setTopic(int topic) {
        this.topic = topic;
    }

    @Override
    public void play() {
        System.out.println("Playing " + this);
    }

    @Override
    public void pause() {
        System.out.println("Playing " + this);
    }
}
