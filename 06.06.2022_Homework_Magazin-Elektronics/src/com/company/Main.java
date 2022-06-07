package com.company;

public class Main {

    public static void main(String[] args) {
       /*  Задача 1
	    Допустим , у нас есть магазин. В нашем магазине есть товары трёх категорий:
         продукты, электроника(мобильные телефоны и ноутбуки, одежда.
        У каждого товара есть цена и наименование.
        Каждый товар можно купить (покупателю выставляется счёт и цена).
        1) при покупке продуктов выставляется дополнительная цекна за срочность доставки.
        2) при покупке электроники, покупателю предлагается оформить дополнительную гарантию.
        3) Телефоны продаются только с контрактом оператора.
        4) на отдельные категории иногда действует скидка


         Задача 2
         дан List Integer  нужно развернуть его с конца на начало

         задача 3

        Дан List c именами , вывести все имена что короче  или равны трёх символов
	 */




        Electronic electronic=new Electronic("Acer notebook",1500);

       MobilePhones handy= new MobilePhones("iphone",1000);
       handy.buy();
       Clothing hudi=new Clothing("hudi",30);
        System.out.println();
        System.out.println("This good '"+hudi.getName()+"' have one sale 15%, the started price: "+hudi.getPrice()+" Euro "+
                " and now his price:  "+(hudi.getPrice()-hudi.sale())+" Euro");
    }
}
