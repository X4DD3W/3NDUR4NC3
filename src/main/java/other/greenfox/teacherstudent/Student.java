package other.greenfox.teacherstudent;

public class Student {

  Student(){

  }

  public void learn() {
    System.out.println("The student is learning smg new.");
  }

  public void question(Teacher teacher) {
    teacher.answer();
  }


}
