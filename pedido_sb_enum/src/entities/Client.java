package entities;

import java.util.Date;

public class Client {
    private String name;
    private String eamail;

    private Date birthDate;

    public Client() {
    }

    public Client(String name, String eamail, Date birthDate) {
        this.name = name;
        this.eamail = eamail;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEamail() {
        return eamail;
    }

    public void setEamail(String eamail) {
        this.eamail = eamail;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
}
