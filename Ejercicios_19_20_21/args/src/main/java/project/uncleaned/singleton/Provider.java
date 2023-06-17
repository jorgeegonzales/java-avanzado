package project.uncleaned.singleton;

public class Provider {
    private String name;
    private Integer documentNumber;
    private String address;
    private String email;
    private Integer phone;

    public Provider() {
    }

    public Provider(String name, Integer documentNumber, String address, String email, Integer phone) {
        this.name = name;
        this.documentNumber = documentNumber;
        this.address = address;
        this.email = email;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(Integer documentNumber) {
        this.documentNumber = documentNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", documentNumber=" + documentNumber +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", phone=" + phone +
                '}';
    }
}
