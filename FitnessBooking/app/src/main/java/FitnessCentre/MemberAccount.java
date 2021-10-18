package FitnessCentre;

public class MemberAccount extends UserAccount {
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    String username,password;

    @Override
    public String getName() {
        return username;
    }

    @Override
    public boolean login() {
        return false;
    }

    @Override
    public boolean logout() {
        return false;
    }

    @Override
    public String getPass() {
        return password;
    }
}
