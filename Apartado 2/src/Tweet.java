import java.time.LocalDate;

public class Tweet {
    protected LocalDate time;
    protected String message;
    protected UserAccount sender;

    public Tweet(LocalDate time, String message, UserAccount sender) {
        if (message.length() > 140) {
            throw new IllegalArgumentException("El mensaje excede los 140 caracteres.");
        }
        this.time = time;
        this.message = message;
        this.sender = sender;
    }

    @Override
    public String toString() {
        return "Tweet: " + message + " - Enviado por: " + sender;
    }
}

