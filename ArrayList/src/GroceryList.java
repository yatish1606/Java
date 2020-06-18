import java.util.ArrayList;

public class GroceryList {

    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addNewItem(String item) {
        groceryList.add(item);
    }

    public void printList() {
        for(int i = 0; i < groceryList.size(); i++) {
            System.out.println(groceryList.get(i));
        }
    }

    public void removeItem(String item) {
        if(groceryList.contains(item)) {
            groceryList.remove(groceryList.indexOf(item));
        } else {
            System.out.println("Item does not exist");
        }
    }

    public void modifyItem(String initial, String modifiedItem) {
        if(groceryList.contains(initial)) {
            groceryList.set(groceryList.indexOf(initial),modifiedItem);
        } else {
            System.out.println("Item does not exist");
        }
    }

    public void deleteList() {
        groceryList.removeAll(groceryList);
    }
}
