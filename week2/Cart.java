public class Cart {

	private CartItem cartItems;
	public int id;

	public Cart(int i, CartItem c) {
		id = i;
		cartItems = c;

	}

public void print(){
System.out.println("cart : " +cartItems);


}}
