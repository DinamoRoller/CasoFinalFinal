import java.time.LocalDate;

public class Retweet extends Tweet {
    private Tweet originalTweet;

    public Retweet(LocalDate time, String message, UserAccount sender, Tweet originalTweet) {
        super(time, message, sender);
        this.originalTweet = originalTweet;
    }

    @Override
    public String toString() {
        return "Retweet de: " + originalTweet.sender + " - " + originalTweet.message + " - Enviado por: " + sender;
    }
}
