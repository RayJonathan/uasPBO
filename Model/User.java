package Model;

public abstract class User extends CategoryUser {
    int userId;
    String userPassword;
    String userName;
    String userEmail;
    String userGender;
    CategoryUser categoryUser;
    int userFollowers;

    public User(int categoryId, String categoryName, int userId, String userPassword, String userName, String userEmail,
            String userGender, CategoryUser categoryUser, int userFollowers) {
        super(categoryId, categoryName);
        this.userId = userId;
        this.userPassword = userPassword;
        this.userName = userName;
        this.userEmail = userEmail;
        this.userGender = userGender;
        this.categoryUser = categoryUser;
        this.userFollowers = userFollowers;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserGender() {
        return userGender;
    }

    public void setUserGender(String userGender) {
        this.userGender = userGender;
    }

    public CategoryUser getCategoryUser() {
        return categoryUser;
    }

    public void setCategoryUser(CategoryUser categoryUser) {
        this.categoryUser = categoryUser;
    }

    public int getUserFollowers() {
        return userFollowers;
    }

    public void setUserFollowers(int userFollowers) {
        this.userFollowers = userFollowers;
    }

}
