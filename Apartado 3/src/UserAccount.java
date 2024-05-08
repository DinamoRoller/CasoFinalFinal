import java.util.ArrayList;
import java.util.List;

public class UserAccount {
    private String alias;
    private String email;
    private List<Tweet> tweets;

    public UserAccount(String alias, String email) {
        if (!Utils.isValidAlias(alias)) {
            throw new IllegalArgumentException("El alias no es válido.");
        }
        if (!Utils.isValidEmail(email)) {
            throw new IllegalArgumentException("El email no es válido.");
        }
        this.alias = alias;
        this.email = email;
        this.tweets = new ArrayList<>();
    }

    public void tweet(Tweet tweet) {
        if (tweet.getMessage().length() > 140) {
            throw new IllegalArgumentException("El mensaje excede los 140 caracteres.");
        }
        tweets.add(tweet);
        // Lógica para publicar el tweet
    }

    public String getEmail() {
        return email;
    }

    // otros metodos y atributos necesarios
}
