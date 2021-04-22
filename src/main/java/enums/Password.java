package enums;

public enum Password {
    ADMIN_PASSWORD("parola123!"),
    INVALID_PASSWORD("dfdasfasfasdfdasfdasfdasf"),
    SUPERVISOR_PASSWORD("blabla"),
    GUEST_PASSWORD("adsfasdfasd");

    private String password;

    private Password(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
}
