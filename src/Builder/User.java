package Builder;

public class User {
    String firstName;
    String lastName;

    static UserBuilder getBuilder(){
        return new UserBuilderImp();
    }
}
