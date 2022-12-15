package pt.up.fe.ldts.example4;

import java.util.Objects;

public class Client extends Human {

    public Client(String name, String phoneNumber) {
        super(name, phoneNumber);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !(o instanceof Worker)) return false;
        if (!(o instanceof Client)) return false;
        Client worker = (Client) o;
        return Objects.equals(getName(), worker.getName()) && Objects.equals(getPhoneNumber(), worker.getPhoneNumber());
    }
    @Override
    public int hashCode() {
        return Objects.hash(getName(), getPhoneNumber());
    }
}
