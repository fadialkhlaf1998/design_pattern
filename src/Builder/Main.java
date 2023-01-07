package Builder;

public class Main {

    public static void main(String[] args) {
        UserBuilder userBuilder = User.getBuilder();
        User user = userBuilder.setFirstName("Fadi").setLastName("Alkhlaf").build();
        System.out.println(user.firstName+" "+user.lastName);
    }

}
