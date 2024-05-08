import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UserAccount {
    private String alias;
    private String email;
    private List<Tweet> tweets;
    private Set<UserAccount> following;

    // constructor
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
        this.following = new HashSet<>();
    }

    // metodo para seguir a otro usuario
    public void follow(UserAccount user) {
        if (this == user) {
            throw new IllegalArgumentException("No puedes seguirte a ti mismo.");
        }
        following.add(user);
    }

    // metodo para publicar un Tweet
    public void tweet(Tweet tweet) {
        tweets.add(tweet);
        for (UserAccount follower : following) {
            follower.receiveTweet(tweet);
        }
    }

    // metodo auxiliar para que los seguidores reciban el tweet en su timeline
    private void receiveTweet(Tweet tweet) {
        // Implementa la lógica para recibir el tweet en el timeline del seguidor
    }

    // metodo toString para mostrar el nombre de usuario y el correo electrónico
    @Override
    public String toString() {
        return "Usuario: " + alias + ", Email: " + email;
    }
}


