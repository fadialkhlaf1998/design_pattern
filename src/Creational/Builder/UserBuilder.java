package Creational.Builder;

public interface UserBuilder {
    User build();
    UserBuilder setFirstName(String name);
    UserBuilder setLastName(String name);
}
