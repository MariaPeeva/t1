package enums;

public enum Username {
    ADMIN_USER("admin"),
    INVALID_USERNAME("dfsakjsfkasjd");

    private String username;

    private Username(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }
}
