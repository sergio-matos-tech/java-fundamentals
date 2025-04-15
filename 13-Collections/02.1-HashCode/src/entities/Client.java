package entities;

import java.util.Objects;

public class Client {
    private String name;
    private String email;
    private String CPF;

    public Client(String name, String email, String CPF) {
        this.name = name;
        this.email = email;
        this.CPF = CPF;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(getCPF(), client.getCPF());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getCPF());
    }
}
