package jobs.tesztfeladatok;

public class JavaFeladatok {

  // 1. Milyen láthatóságot módosító kulcsszavakat ismersz? Ismertesd az egyes láthatóságok szerepét!
  // public, private, protected, default?

  // 2. Mire jó a static kulcsszó?
  // Method esetén anélkül meghívható, hogy példányosítanám a classt
  // Változó esetén akárhány példányt hozok létre, osztozni fognak a static változón

  // 3. Sorold fel azokat az eseteket, ahol a final kulcsszót használhatjuk!
  // Mit érünk el vele az egyes eseteknél?
  // final class: nem extendálható
  // final int (pl.): abban a pillanatban, hogy értéket kap, azon már nem változtathatunk
  // final method(): nem változtatható, ha a class esetleg ki lenne terjesztve

  // 4. Mi a különbség az interface és az abstract class között?
  // ???

  // 5. Írhatunk-e egy osztály számára több konstruktort? Ha igen, miért? Ha nem, miért nem?
  // ??? Igen, írhatunk - hogy többféleképpen példányosíthassuk. Van olyan eset, amikor pl. egy
  // talált kutyánál nem tudunk bizonyos értékeket (pl. eredeti neve? :D)

  // 6. Mi a különbség a “==” operátorral,
  // illetve a .Equals() függvény segítségével történő összehasonlítás között?
  // ???

  // 7. Lehet-e absztrakt metódust létrehozni olyan osztályban,
  // amely nem absztraktként lett megjelölve? Ha igen, miért?
  // ???

  // 8. Adott az alábbi kiragadott kódrészlet egy programból.
  // A Vegrehajt() metódus működését nem fontos ismernünk.
  // Milyen kivételek keletkezésének esetében futnak le az egyes ágakban található kódok?
  // ??? MyException esetén a MyException-ös, bármilyen Exception esetén pedig az Exception-ös sor
  // Mi történik, ha a Vegrehajt() nem dob kivételt?
  // ??? a Vegrehajt() végrehajtódik, azután pedig a finally blokkban lévő sor fut le

  /*static void myFunc()
  {
    try{
      MyType t = new MyType();
      t.Vegrehajt();
    }
    catch(MyException){
      System.out.println(“MyException keletkezett!”);
    }
    catch(Exception){
      System.out.println(“Kivétel keletkezett!”);
    }
    finally{
      System.out.println(“Finally!”);
    }
  }*/

  // 9. Mit ír ki az alábbi program? Válaszod indokold!
  // 1-et ír ki, mert az ertek értéke az első esetnek (case 1) felel meg, így az abban lévő sor
  // fut le, ami azt írja ki, hogy "1"

  /*public class SwitchCase {

    public static void main(String[] args) {
      int ertek = 1;
      switch (ertek) {
        case 1:
          System.out.print("1");
        case 2:
        case 3:
          System.out.print("2");
          break;
        case 4:
          System.out.print("4");
        default:
          System.out.print("D");
      }
    }
  }*/

  // 10. Írj példát egy osztályra, ami az Abstrc absztrakt osztályból származik,
  // és megvalósítja az Intrf interfészt!
  // ??? abstract class Pelda extends Abstrc, implements Intrf

  // 11. Adott az alábbi Nev osztály, ami vezetékneveket és keresztneveket tartalmaz, illetve egy lista
  // amiben példányok vannak az osztályból. A Java 8 stream api segítségével keresd meg és add vissza az
  // első Sándor keresztnevű személy vezetéknevét. Amennyiben nem létezik adj vissza null-t. A feladatot
  // egyetlen függvényhívási lánccal old meg.
  /* String vezeteknev = nameList.stream()
      .filter(name -> name.getKeresztnev().equals("Sándor"))
      .findFirst()
      .orElse(null)
      .vezeteknev;*/

  /*public static class Nev {
    private String vezeteknev;
    private String keresztnev;
    public Nev(String vezeteknev, String keresztnev) {
      this.vezeteknev = vezeteknev;
      this.keresztnev = keresztnev;
    }
    public String getKeresztnev() {
      return keresztnev;
    }
    public String getVezeteknev() {
      return vezeteknev;
    }}

  public static void main(String[] args) {
    List<Nev> nameList = new ArrayList<>(Arrays.asList(
        new Nev("Tóth", "Pista"),
        new Nev("Kovács", "Béla"),
        new Nev("Kiss", "Sándor"),
        new Nev("Szabó", "Balázs")));
  }*/

  // 12. Mire való a throws kulcsszó egy függvény fejlécében?
  // ???

  // 13. Írj unit testet az alábbi osztályhoz! A teszt ellenőrizze,
  // hogy a függvény valóban a megfelelő értéket írja ki, tehát két szám szorzatát!
  // ???
  /*@Test
  public void testCaseOne()  {
    MyClass myClass = new MyClass();
    assertEquals(12, myClass.szorzat(3, 4));
  }*/

  /*public MyClass
  {
    public int szorzat(int a, int b)
    {
      return a * b;
    }}*/

  // 14. Írjunk programot, amely bekér a felhasználótól N db számot, majd kiírja az összegüket, az
  // átlagukat, és eldönti, hogy van-e köztük két azonos szám!
  // ???

  // 15. Készítsünk egy virtuális könyvtárat, ahol különböző szoftvereket tárolhatunk! Készítsünk
  // osztályhierarchiát az egyes programtípusok számára. A közös ősük egy absztrakt osztály legyen!
  // Például: Software -> UtilitySoftware, VideoGame, SmallApplications. Készítsünk egy ITelepitheto
  // interfészt, amely egyetlen metódust tartalmaz, a Telepit() metódust. A virtuális könyvtárunkba legyen
  // lehetőségünk új szoftver felvitelére, valamint annak törlésére! A felvitelt és a törlést név szerint
  // jelezzük a konzolon, például: “A *név* szoftver hozzáadásra/törlésre került!”. A felhasználó
  // választhasson ki egy szoftvert a listából, és ha megvalósítja az ITelepitheto interfészt, akkor
  // telepíthesse azt! Ezt jelezzük a konzolon névvel ellátva: “A *név* szoftver települ!”
  // ???

}
