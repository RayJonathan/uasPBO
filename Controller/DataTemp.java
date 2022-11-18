package Controller;

import java.util.ArrayList;

import Model.CategoryUser;
import Model.User;

public class DataTemp {
    ArrayList<User> data = new ArrayList<>();
    ArrayList<CategoryUser> categoryUsers = new ArrayList<>();

    public DataTemp() {
        CategoryUser.add(new CategoryUser(1, "Private Account"));
        CategoryUser.add(new CategoryUser(2, "Creator Account"));
        CategoryUser.add(new CategoryUser(3, "Bussiness Account"));

        data.add(
                new User(1, "Private Account", 001, "132", "Ray Jonathan", "rayjonathan5415@gmail.com", "Pria",
                        categoryUsers.get(1),
                        200));
    }
}
