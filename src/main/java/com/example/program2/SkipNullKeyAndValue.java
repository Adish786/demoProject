package com.example.program2;

import java.util.Arrays;
import java.util.List;
/* TODO Skip Null Key and Null Value And add Value Output Should be Requirement */

public class SkipNullKeyAndValue {
    public static void main(String[] args) {
        List<Item> items = Arrays.asList(
                new Item("apple", 10L),
                new Item("banana", 30L),
                new Item("orange", 10L),
                new Item("papaya", null),
                new Item(null, 10L),
                new Item("banana", 10L),
                new Item("apple", 20L));
        //*output 80
        Long sumOfQuantity = items.stream().filter(item->item.qty !=null && item.getItem()!=null).mapToLong(Item::getQty).sum();
        System.out.println(sumOfQuantity);
    }
}
class Item {
    String item;
    Long qty;

    public String getItem() {
        return item;
    }
    public void setItem(String item) {
        this.item = item;
    }
    public Long getQty() {
        return qty;
    }
    public void setQty(Long qty) {
        this.qty = qty;
    }

    public Item(String item, Long qty) {
        this.item = item;
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Item{" +
                "item='" + item + '\'' +
                ", qty=" + qty +
                '}';
    }
}

