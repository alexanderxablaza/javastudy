package io.oops;

import io.oops.cars.car;
import io.oops.friend.friend;
import io.oops.garage.garage;

public class objsasargs {
    public static void main(String[] args) {
        garage g = new garage();
        car c = new car("BMW");
        car c2 = new car("Ford");
        g.park(c);
        g.park(c2);
        
        friend f1 = new friend("Patrick");
        friend f2 = new friend("Pat");

        System.out.println( friend.numofFriends);
    }
}
