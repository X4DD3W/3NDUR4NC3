package course.sfj.western;

public class Western {

  public String methodName(String input1, String input2) {
    return methodName(input1, input2, false);
  }

  // Hozzá kellene adni egy booleant a fenti methodhoz. Hogy csinálod?
  // Átmásolom a kalkulációt az újba és a régit "átirányítom" az újhoz
  public String methodName(String input1, String input2, boolean input3) {
    // Kalkuláció
    return input1 + input2;
  }
}
