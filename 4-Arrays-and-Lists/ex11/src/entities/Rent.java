package entities;

public class Rent {
    private String name;
    private String email;
    private int roomNumber;

    public Rent() {}

    public Rent(String name, String email, int roomNumber) {
        this.name = name;
        this.email = email;
        if (roomNumber >= 0 && roomNumber <= 10)
            this.roomNumber = roomNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
