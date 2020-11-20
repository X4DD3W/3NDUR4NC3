package temp;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class MiniCRM {

  // A fejlesztőink számának,
  // az aktív előfizetőink számának,
  // a rendszerünk fejlesztése során eddig felvett hibajegyek és fejlesztési igények számának
  // és a fejlesztési vezető életkorának
  // szorzata 6932416653.
  // Hány éves a fejlesztési vezető
  //
  // programozók száma = P
  // aktív előfizetők száma = E
  // felvett hibajegyek száma = H
  // fejlesztési vezető életkora = F
  //
  // Mennyi F?
  //
  // P * E * H * F = 6932416653
  // 41-gyel osztva 169 083 333


  public static void main(String[] args) {
    // Elosztom a számot 18-tól 60-ig mindennel, ahol egész az eredmény, az megfejtés?
    double osszeg = 6932416653d;
    for (int i = 10; i < 90; i++) {
      if (osszeg % i == 0.0) {
        System.out.println(i);
      }
    }
  }
}
