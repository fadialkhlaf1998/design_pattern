package Creational.Builder;

public class UserBuilderImp implements UserBuilder{
    User user = new User();

    @Override
    public User build() {
        return user;
    }
    @Override
    public UserBuilder setFirstName(String name){
        user.firstName = name;
        return  this;
    }
    @Override
    public UserBuilder setLastName(String name){
        user.lastName = name;
        return  this;
    }
}
