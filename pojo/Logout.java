·       User should be logged out immediately after clicking on log out button.·       User should be redirected to the login screen.

public class Logout {

  private String username;
  private String password;

  public Logout(String username, String password) {
    this.username = username;
    this.password = password; 
  }

  public void logOut() {
    //Code to logout the user
  }

  public void redirectToLoginScreen() {
    //Code to redirect the user to the login screen
  }

}