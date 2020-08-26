package jobs.bredex;

import java.util.ArrayList;
import java.util.List;

public class GildedRose {

  public static List<Item> items = null;

  public static void main(String[] args) {
    items = new ArrayList<Item>();
    items.add(new Item("+5 Dexterity Vest", 10, 20));
    items.add(new Item("Aged Brie", 2, 0));
    items.add(new Item("Elixir of the Mongoose", 5, 7));
    items.add(new Item("Sulfuras, Hand of Ragnaros", 0, 80));
    items.add(new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20));
    items.add(new Item("Conjured Mana Cake", 5, 20));

    updateQuality();

  }

  public static void updateQuality() {
    for (Item item : items) {
      String actualName = item.getName();

      // quality value decreasing
      if ((!"Aged Brie".equals(actualName))
          && !"Backstage passes to a TAFKAL80ETC concert".equals(actualName)) {
        if (item.getQuality() > 0) {
          if (!"Sulfuras, Hand of Ragnaros".equals(actualName)) {
            item.setQuality(item.getQuality() - 1);
            // ""Conjured" items degrade in Quality twice as fast as normal items"
            if (actualName.startsWith("Conjured") && item.getQuality() > 0) {
              item.setQuality(item.getQuality() - 1);
            }
          }
        }
        // quality value increasing
      } else {
        // "Aged brie" case
        if (item.getQuality() < 50) {
          item.setQuality(item.getQuality() + 1);

          // "Backstage passes" case
          if ("Backstage passes to a TAFKAL80ETC concert".equals(actualName)) {
            if (item.getSellIn() < 11) {
              if (item.getQuality() < 50) {
                item.setQuality(item.getQuality() + 1);
              }
            }

            if (item.getSellIn() < 6) {
              if (item.getQuality() < 50) {
                item.setQuality(item.getQuality() + 1);
              }
            }
          }
        }
      }

      // sellIn value decreasing (except Sulfuras) (we will by fire be purged)
      if (!actualName.equals("Sulfuras, Hand of Ragnaros")) {
        item.setSellIn(item.getSellIn() - 1);
      }

      // quality - 1 or set 0
      if (item.getSellIn() < 0) {
        if (!"Aged Brie".equals(actualName)) {
          if (!"Backstage passes to a TAFKAL80ETC concert".equals(actualName)) {
            if (item.getQuality() > 0) {
              if (!"Sulfuras, Hand of Ragnaros".equals(actualName)) {
                item.setQuality(item.getQuality() - 1);
              }
            }
          } else {
            item.setQuality(item.getQuality() - item.getQuality());
          }
          // Aged Brie's quality increased twice
        } else {
          if (item.getQuality() < 50) {
            item.setQuality(item.getQuality() + 1);
          }
        }
      }
    }
  }
}
