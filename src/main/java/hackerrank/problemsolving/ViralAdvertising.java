package hackerrank.problemsolving;

public class ViralAdvertising {

  static int viralAdvertising(int n) {
    int startingCount = 5;
    int likes = 0;

    for (int i = 0; i < n; i++) {
      likes += startingCount / 2;
      startingCount = ((startingCount / 2) * 3);
    }
    return likes;
  }
}
