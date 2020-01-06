import java.util.Random;

public class CustomLogics {

  public static void main(String[] args) {

    System.out.println(randomGeneratedChars());
    System.out.println(passwordEncryptor("ABCD")); // should return NOPQ
    System.out.println(usernameMaker("example@gmail.com"));  // should return example

  }

  // Csoszi #2 "Booking"
  // "The booking reference is 6 random generated character."
  public static String randomGeneratedChars() {
    Random r = new Random();
    String result = "";
    String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    for (int i = 0; i < 6; i++) {
      result += (alphabet.charAt(r.nextInt(alphabet.length())));
    }
    return result;
  }

  // Csoszi #1 "Registration"
  // "The password must be stored in the database using the ROT13 substitution cipher"
  public static String passwordEncryptor(String password) {
    String result = "";
    for (int i = 0; i < password.length(); i++) {
      char c = password.charAt(i);
      if (c >= 'a' && c <= 'm') {
        c += 13;
      } else if (c >= 'A' && c <= 'M') {
        c += 13;
      } else if (c >= 'n' && c <= 'z') {
        c -= 13;
      } else if (c >= 'N' && c <= 'Z') {
        c -= 13;
      }
      result += c;
    }
    return result;
  }

  // Csoszi #1 "Registration"
  // "The username is the first part of the email address. For example the username for noreply@example.com is noreply."
  public static String usernameMaker(String emailAddressAsSource) {
    return emailAddressAsSource.substring(0, emailAddressAsSource.indexOf('@'));
  }
}
