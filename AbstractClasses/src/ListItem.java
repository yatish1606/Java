public abstract class ListItem {
    protected ListItem nextLink = null;
    protected ListItem prevLink = null;

    protected Object value;

    public ListItem (Object value) {
        this.value = value;
    }

    abstract ListItem next();
    abstract ListItem setNext(ListItem item);
    abstract ListItem previous();
    abstract ListItem setPrevious(ListItem item);

    public void setValue(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return this.value;
    }

    abstract int compareTo(ListItem item);
}
