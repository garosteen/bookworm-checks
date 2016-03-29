package checks.assetManagement;

public class User {
    private boolean isAuthenticated = false;
    private final String username;

    public User(final String username) {
        this.username = username;
    }

    public void setAuthenticated() {
        isAuthenticated = true;
    }
}
