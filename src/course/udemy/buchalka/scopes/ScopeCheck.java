package course.udemy.buchalka.scopes;

public class ScopeCheck {

  public int publicVar = 0;
  // első "privateVar" nevű variable
  private int privateVar = 1;

  public ScopeCheck() {
    System.out.println("ScopeCheck created, publicVar = " + publicVar + ": privateVar = " + privateVar);
  }

  public int getPrivateVar() {
    return privateVar;
  }

  public void timesTwo() {
    // második "privateVar" nevű variable
    int privateVar = 2;
    for (int i = 0; i < 10; i++) {
      System.out.println(i + " times two is " + i * privateVar);
    }
  }

  public class InnerClass {
    // negyedik "privateVar" nevű variable
    public int privateVar = 3;

    public InnerClass() {
      System.out.println("InnerCLass created, privateVar = " + privateVar);
    }

    public void timesTwo() {
      for (int i = 0; i < 10; i++) {
        System.out.println(i + " times two is " + i * privateVar);
      }
    }
  }
}