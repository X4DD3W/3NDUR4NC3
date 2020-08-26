package course.udemy.buchalka.collections;

public class Main {

  public static void main(String[] args) {
    // Constructorban létrehoz 8 sorban 12-12 ülést, előre beállított módon (seatNumber pl. A01-H12)
    Theatre theatre = new Theatre("Olympian", 8, 12);
    // theatre.getSeats(); // visszaadja a teljes listát

    // Lefoglaljuk a H11-es ülést
    if (theatre.reserveSeat("H11")) {
      System.out.println("Please pay.");
    } else {
      System.out.println("Seat is taken.");
    }

    // Lefoglalnk megint a H11-es ülést
    if (theatre.reserveSeat("H11")) {
      System.out.println("Please pay.");
    } else {
      System.out.println("Seat is taken.");
    }
  }
}
