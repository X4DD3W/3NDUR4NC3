package hackerrank.problemsolving.almostdone;

public class NewYearChaos {

  public static void main(String[] args) {
    int[] test1 = new int[]{2, 1, 5, 3, 4}; // 3, mert:
    // 12354
    // 12534
    // 21534 (három változtatás után a kívánt eredményt kapjuk
    minimumBribes(test1);

    int[] test2 = new int[]{2, 5, 1, 3, 4}; // "Too chaotic", mert:
    // egy ember sem cserélhet kettőnél többször helyet, de az 5-nek 3-mat kellene "vándorolnia"
    minimumBribes(test2);
  }

  static void minimumBribes(int[] q) {
    // először csekkoljuk, hogy lehetséges-e

    // ha igen, DO IT!
  }
}
