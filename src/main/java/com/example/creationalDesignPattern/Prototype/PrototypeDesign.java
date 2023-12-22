package com.example.creationalDesignPattern.Prototype;

public class PrototypeDesign {
    public static void main(String[] args) throws CloneNotSupportedException {
        BookShop bs = new BookShop();
        bs.setShopName("AdishShop");
        bs.loadData();
        System.out.println(bs);
        BookShop bs1 = (BookShop) bs.clone();
        bs.getBooks().remove(2);
        bs1.setShopName("A1");
        System.out.println(bs);
        System.out.println(bs1);
    }
}
