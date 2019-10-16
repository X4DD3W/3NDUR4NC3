package gnirts;

public class Main {

  public static void main(String[] args) {

    Gnirts g = new Gnirts("valami");
    // System.out.println(g.length());
    // System.out.println(g.subSequence(1, 4));
    System.out.println(g.charAt(1));
    // should print out: m

    Shifter s = new Shifter("kismalac", 2);
    System.out.println(s.charAt(0));
    // should print out: s

  }

}
