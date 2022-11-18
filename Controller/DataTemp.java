package Controller;

import java.util.ArrayList;

import Model.CategoryUser;

public class DataTemp {
    ArrayList<CategoryUser> category = new ArrayList<>();

    public DataTemp() {
        category.add(new CategoryUser(1, "Private Account"));
        category.add(new CategoryUser(2, "Creator Account"));
        category.add(new CategoryUser(3, "Business Account"));

    }
}
