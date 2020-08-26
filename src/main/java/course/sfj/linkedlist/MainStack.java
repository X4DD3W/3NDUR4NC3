package course.sfj.linkedlist;

import java.util.Stack;

public class MainStack {

  public static void main(String[] args) {
    // Last In First Out!
    Stack<String> st = new Stack<>();
    // st.add() vagy st.push()?
    st.push("Legalja");
    st.push("Közepe");
    st.push("Teteje");
    System.out.println(st); // [Legalja, Közepe, Teteje]

    // Vedd ki a "legfelső" (= legutoljára hozzáadott) elemet
    st.pop();
    printStack(st); // [Legalja, Közepe]
    st.pop();
    printStack(st); // [Közepe]
    st.pop();
    printStack(st); // A verem üres.
  }

  public static void printStack(Stack<String> st) {
    System.out.println(st.isEmpty() ? "A verem üres." : st.toString());
  }
}
