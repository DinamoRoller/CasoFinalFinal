import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

class UserManagement {
    private List<UserAccount> userList;
    private Map<String, UserAccount> userAliasMap;

    public UserManagement() {
        userList = new LinkedList<>();
        userAliasMap = new HashMap<>();
    }
}
