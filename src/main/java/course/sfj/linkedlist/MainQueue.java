package course.sfj.linkedlist;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class MainQueue {

  public static void main(String[] args) {
    Queue<String> qu = new PriorityQueue<>();
    qu.offer("Samu");
    qu.offer("Frodó");
    qu.offer("Gandalf");

    // Mutasd, a sorbanállók közül ki a VIP? :)
    System.out.println(qu.peek());  // Frodó (ábécé szerint?)

    // Engedd be a VIP-t a buliba
    qu.poll();

    // Ki maradt? Gandalf és Samu
    System.out.println(qu);

    // Engedd be az aktuális VIP-t a buliba
    qu.poll();

    // Ki maradt? Szegény Samu...
    System.out.println(qu);

    // Ha fontos, hogy a bekerülési sorrendben legyenek a srácok VIP-k, akkor:
    Queue<String> qu2 = new LinkedList<>();
    qu2.offer("Harry");
    qu2.offer("Ron");
    qu2.offer("Hermione");
    System.out.println(qu2.peek());  // Harry
    qu2.poll();
    System.out.println(qu2);  // Ron, Hermione
    qu2.poll();
    System.out.println(qu2);  // Hermione
  }
}
