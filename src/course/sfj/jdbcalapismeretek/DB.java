package course.sfj.jdbcalapismeretek;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DB {

  final String JDBC_DRIVER = "org.apache.derby.jdbc.EmbeddedDriver";
  final String URL = "jdbc:derby:adatbazisneve;create=true";
  final String USERNAME = "";
  final String PASSWORD = "";
  // Létrehozzuk a kapcsolatot (hídat)
  Connection conn = null;
  // Ha életre kelt, csinálunk egy megpakolható teherautót
  Statement createStatement = null;

  public DB() {
    // Megpróbáljuk életre kelteni a kapcsolatot
    try {
      conn = DriverManager.getConnection(URL);
      System.out.println("A kapcsolat létrejött.");
    } catch (SQLException throwables) {
      System.out.println("Valami baj van a kapcsolat létrehozásával.");
      throwables.printStackTrace();
    }

    if (conn != null) {
      try {
        createStatement = conn.createStatement();
      } catch (SQLException throwables) {
        System.out.println("Hiba a Statement létrehozásánál.");
        throwables.printStackTrace();
      }
    }

    // Megnézzük, üres-e az adatbázis.
    DatabaseMetaData dbmd = null;
    try {
      dbmd = conn.getMetaData();
    } catch (SQLException throwables) {
      System.out.println("Hiba a DatabaseMetaData létrehozásánál.");
      throwables.printStackTrace();
    }

    // Megnézzük, létezik-e az adott adattábla
    try {
      ResultSet rs = dbmd.getTables(null, "APP", "USERS", null);
      // Ha a result üres, most futtatják először a programot, létrehozzuk a "users" táblát
      if (!rs.next()) {
        createStatement.execute("CREATE TABLE users (name varchar (20), address varchar (20))");
      }
    } catch (SQLException throwables) {
      System.out.println("Hiba az ResultSet létrehozásánál.");
      throwables.printStackTrace();
    }
  }

  public void addUser(String name, String address) {
    try {
      // Teherató:
      // String sql = "INSERT INTO users values ('" + name + "', '" + address + "')";
      // createStatement.execute(sql);

      // Sportkocsi:
      String sql = "INSERT INTO users values (?, ?)";
      PreparedStatement preparedStatement = conn.prepareStatement(sql);
      preparedStatement.setString(1, name);
      preparedStatement.setString(2, address);
      preparedStatement.execute();

    } catch (SQLException throwables) {
      System.out.println("Hiba a user hozzáadásánál.");
      throwables.printStackTrace();
    }
  }

  public void showAllUsers() {
    String sql = "SELECT * FROM users";
    try {
      ResultSet resultSet = createStatement.executeQuery(sql);
      while (resultSet.next()) {
        String name = resultSet.getString("name");
        String address = resultSet.getString("address");
        System.out.println(name + " " + address);
      }
    } catch (SQLException throwables) {
      System.out.println("Hiba az összes user lekérésekor.");
      throwables.printStackTrace();
    }
  }

  public void showUsersMeta() {
    String sql = "SELECT * FROM users";
    ResultSet rs = null;
    ResultSetMetaData rsmd = null;
    try {
      rs = createStatement.executeQuery(sql);
      rsmd = rs.getMetaData();
      int columnCount = rsmd.getColumnCount();
      for (int i = 1; i <= columnCount; i++) {
        System.out.println(rsmd.getColumnName(i));
      }
    } catch (SQLException throwables) {
      System.out.println("Hiba a metaadatok olvasásakor");
      throwables.printStackTrace();
    }
  }

  public ArrayList<User> getAllUsers() {
    String sql = "SELECT * FROM users";
    ArrayList<User> users = null;
    try {
      ResultSet rs = createStatement.executeQuery(sql);
      users = new ArrayList<>();
      while (rs.next()) {
        User actualUser = new User(rs.getString("name"), rs.getString("address"));
        users.add(actualUser);
      }
    } catch (SQLException throwables) {
      System.out.println("Hiba az összes user beolvasásakor.");
      throwables.printStackTrace();
    }
    return users;
  }

}
