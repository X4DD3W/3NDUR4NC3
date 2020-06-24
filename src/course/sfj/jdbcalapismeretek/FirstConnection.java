package course.sfj.jdbcalapismeretek;

public class FirstConnection {

  public static void main(String[] args) {
    DB db = new DB();
    // db.addUser("Vivi", "Budapest");
    db.showAllUsers();
    db.showUsersMeta();
    db.getAllUsers().forEach(user -> System.out.println(user.getName()));
  }
}
