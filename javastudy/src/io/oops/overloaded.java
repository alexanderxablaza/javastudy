package io.oops;

import io.oops.food.food;
import io.oops.pizza.pizza;

public class overloaded {
    public static void main(String[] args) {

        food[] manyfoodhere = new food[3];
        food hamburger = new food("hambruger");
        food hotdog = new food("hotodogs");
        food corn = new food("cron");
        manyfoodhere[0] = hamburger;
        manyfoodhere[1] = hotdog;
        manyfoodhere[2] = corn;
        System.out.println(manyfoodhere[0].name);
        System.out.println(manyfoodhere[1].name);
        System.out.println(manyfoodhere[2].name);
    }

    public static void m_ain(String[] args) {
        pizza newpziza = new pizza();
        pizza pizza1 = new pizza("breadfat");
        pizza pizza2 = new pizza("breadfat", "orange");
        pizza pizza3 = new pizza("breadfat", "brown", "many cheeze");
        pizza pizza4 = new pizza("breadfat", "green", "few cheeze", "many peperroni");
        System.out.println(pizza1.toString());
        System.out.println(pizza2);
        System.out.println(pizza3);
        System.out.println(pizza4);
        System.out.println(newpziza);

    }
}
