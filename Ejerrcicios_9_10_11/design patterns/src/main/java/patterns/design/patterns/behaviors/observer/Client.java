package patterns.design.patterns.behaviors.observer;

public class Client {
    private Integer Id;
    private String username;
    private String email;

    public Client() {
    }

    public Client(Integer id, String username, String email) {
        Id = id;
        this.username = username;
        this.email = email;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Client{" +
                "Id=" + Id +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
