package riazjamil.mahwish.supermarket.domain;

public class BasketItem {

	private String productName;
	private long id;
	private double latestPrice;

	public BasketItem(String productName, long id, double latestPrice) {
		super();
		this.productName = productName;
		this.id = id;
		this.latestPrice = latestPrice;
	}

	public String getproductName() {
		return productName;
	}

	public long getId() {
		return id;
	}

	public double getlatestPrice() {
		return latestPrice;
	}

	public void setlatestPrice(double latestPrice) {
		this.latestPrice = latestPrice;
	}



}
