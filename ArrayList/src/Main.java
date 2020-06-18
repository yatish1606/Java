public class Main {
    public static void main(String[] args) {
        GroceryList list = new GroceryList();
        list.addNewItem("OKay");
        list.addNewItem("OKayyyy");
        list.printList();
        list.removeItem("OKay");
        list.printList();
        list.modifyItem("OKayyyy", "hello");
        list.printList();
        list.deleteList();
        list.printList();
    }
}
