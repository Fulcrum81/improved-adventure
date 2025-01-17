package goods.grocery;

import goods.Good;

public class Fruit extends Good {

    @Override
    public double getPrice() {
        return price * 1.2;
    }
}
