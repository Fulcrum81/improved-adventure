package goods.electronics;

import goods.Good;

public class MobilePhone extends Good {


    public MobilePhone(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price * 2;
    }
}
