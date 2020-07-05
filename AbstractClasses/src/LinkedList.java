import java.util.List;

public class LinkedList implements NodeList {

    private ListItem root = null;

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem item) {
        if(root == null) {
            this.root = item;
            return true;
        } else {
            ListItem currentItem = this.root;
            while(currentItem != null) {
                int comparison = currentItem.compareTo(item);
                if(comparison < 0) {
                    if(currentItem.next() != null) {
                        currentItem = currentItem.next();
                    } else {
                        currentItem.setNext(item);
                        item.setPrevious(currentItem);
                        return true;
                    }
                } else if (comparison > 0) {
                    if(currentItem.previous() != null) {
                        currentItem.previous().setNext(item);
                        item.setPrevious(currentItem.previous());
                        item.setNext(currentItem);
                        currentItem.setPrevious(item);
                    } else {
                        item.setNext(this.root);
                        this.root.setPrevious(item);
                        this.root = item;
                    }
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        return false;
    }

    @Override
    public void traverse() {

    }
}
