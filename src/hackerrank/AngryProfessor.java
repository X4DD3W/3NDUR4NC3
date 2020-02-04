package hackerrank;

public class AngryProfessor {

  static String angryProfessor(int k, int[] a) {
    int studentsInTime = 0;
    for (int value : a) {
      if (value <= 0) {
        studentsInTime++;
      }
    }
    return studentsInTime >= k ? "NO" : "YES";
  }
}
