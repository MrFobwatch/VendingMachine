import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class PseudoVendingMachine {
    private String cashCard;
    private Scanner input;
    private Product[] inventory;
    private Stack<Coin> coinHolder = new Stack<Coin>();

    public PseudoVendingMachine() {
        input = new Scanner(System.in);

        inventory = new Product[3];
        fillInventory();
        //    coinHolder = new Coin[30];
//        coinHolder.empty();
//	    coinHolder.setSize(40);
        fillCoinHolder();
        //    cashCard = 0x8A;
    }

	public String toString() {
		return "PseudoVendingMachine{" +
				       "cashCard='" + cashCard + '\'' +
				       ", input=" + input +
				       ", inventory=" + Arrays.toString(inventory) +
				       ", coinHolder=" + coinHolder +
				       '}';
	}

	private void fillInventory() {
        int i = 0;
        inventory[i++] = new Product(95, 'a');
        inventory[i++] = new Product(320, 'b');
        inventory[i] = new Product(340, 'c');
    }

    private void fillCoinHolder() {
        coinHolder.push(makeCoin("Dollar"));
        coinHolder.push(makeCoin("HalfDollar"));
        coinHolder.push(makeCoin("Dime"));
        coinHolder.push(makeCoin("Nickel"));
    }

    private void countCoin(Coin coin) {
        coinHolder.push(coin);
    }

    private void insertCoin() {
        int value = input.nextInt();
        Coin insertedCoin = new Coin(value);
        countCoin(insertedCoin);
    }

    public boolean swipeCard() {
        String inputCard = getCardInHex();
        return (inputCard.toUpperCase().equals(cashCard));
    }

    private String getCardInHex() {
        int cardNum = Integer.parseInt(input.nextLine(), 2);
        return Integer.toHexString(cardNum);
    }

    private Coin makeCoin(String name) {
        //        Coin newCoin = new Coin(0);
        if (name.contentEquals("Dollar")) {
            return new Coin(100);
        } else if (name.contentEquals("HalfDollar")) {
            return new Coin(50);
        } else if (name.contentEquals("Dime")) {
            return new Coin(10);
        } else if (name.contentEquals("Nickel")) {
            return new Coin(5);
        } else {
            throw new IllegalArgumentException();
        }
    }

    public void makePurchase() {
        System.out.println("Please insert your card");
        this.cashCard = "8A";
        if (swipeCard()) {
            System.out.println("Insert a Coin");
            insertCoin();
            System.out.println("Select a Product from 0 - " + inventory.length);
            System.out.println(pickItem(input.nextInt()).toString());
            System.out.println(coinHolder.toString());

        } else {
            System.out.println("Incorrect Card");
        }
    }

    private Product pickItem(int position) {
        return inventory[position];
    }
}
