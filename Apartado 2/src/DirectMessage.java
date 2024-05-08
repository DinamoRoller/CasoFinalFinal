import java.time.LocalDate;

public class DirectMessage extends Tweet {
    private UserAccount receiver;

    public DirectMessage(LocalDate time, String message, UserAccount sender, UserAccount receiver) {
        super(time, message, sender);
        this.receiver = receiver;
    }

    @Override
    public String toString() {
        return "Mensaje directo a: " + receiver + " - Mensaje: " + message + " - Enviado por: " + sender;
    }
}
