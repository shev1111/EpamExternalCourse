package projects.project1.model.entity;


public class Item {
    private final int ITEM_ID;
    private final String ITEM_NAME;
    private final int WEIGHT;

    public Item(int itemID, int weight,
                String itemName) {
        this.ITEM_ID = itemID;
        this.ITEM_NAME = itemName;
        this.WEIGHT = weight;
    }

    public int getITEM_ID() {
        return ITEM_ID;
    }

    public String getITEM_NAME() {
        return ITEM_NAME;
    }

    public int getWEIGHT() {
        return WEIGHT;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Item item = (Item) o;

        return ITEM_ID == item.ITEM_ID && WEIGHT == item.WEIGHT && ITEM_NAME.equals(item.ITEM_NAME);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31*result+ITEM_ID;
        result = 31 * result + ITEM_NAME.hashCode();
        result = 31 * result + WEIGHT;
        return result;
    }
}
