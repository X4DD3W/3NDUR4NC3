package greenfox.interfaces;

import java.util.Random;

public class Reservation implements Reservations {

  private String[] dow = new String[]{"HET", "KED", "SZE", "CSU", "PEN", "SZO", "VAS"};
  private Random random = new Random();

  @Override
  public String getDowBooking() {
    int rng = random.nextInt(dow.length);
    return dow[rng];
  }

  @Override
  public String getCodeBooking() {
    StringBuilder sb = new StringBuilder(8);
    for (int i = 0; i < 8; i++) {
      String alphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
      int index = random.nextInt(alphaNumericString.length());
      sb.append(alphaNumericString.charAt(index));
    }
    return sb.toString();
  }

  private void generator() {
    System.out.println("Booking# " + getCodeBooking() + " for " + getDowBooking());
  }

  public static void main(String[] args) {

    Reservation res = new Reservation();
    for (int i = 0; i < 8; i++) {
      res.generator();
    }

  }

}
