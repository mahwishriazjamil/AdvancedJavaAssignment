package riazjamil.mahwish.supermarket.domain;

import java.util.HashMap;

public class ShoppingBasket {

	HashMap<Long, BasketItem> myBasket = new HashMap<>();

	public void addProduct(BasketItem item) {
		myBasket.put(item.getId(), item);
	}

	public void removeProduct(BasketItem item) {
		myBasket.remove(item.getId(), item);
	}

	public void clearBasket(BasketItem item) {
		myBasket.clear();
	}


}
