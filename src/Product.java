public class Product {
	int price; //in cents
	char letter;

	public Product(int price, char name){
		setPrice(price);
		letter = name;
	}
	private void setPrice(int price) {
		this.price = price;
	}
}
