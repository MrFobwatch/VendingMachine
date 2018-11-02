import java.util.Scanner;

public class PseudoVendingMachine {
  private int cashCard;
  private Scanner input;
  private Product[] inventory;
  private Coin[] coinHolder;

  public PseudoVendingMachine() {
    input = new Scanner(System.in);

    inventory = new Product[3];

    coinHolder = new Coin[30];

    cashCard = 0x8A;
  }

  public void countCoin(Coin coin) {}

  private void insertCoin() {
    int value = input.nextInt();
  }
}
