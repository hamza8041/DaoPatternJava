package Models;

public class Menu extends Base {

    private int itemId;
    private String itemName;


    private int quantity;
    private long amount;


    public Menu(int id, int itemId, String itemName, int quantity, long amount) {
        super(id);
        this.itemId = itemId;
        this.itemName = itemName;
        this.quantity = quantity;
        this.amount = amount;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }
}
