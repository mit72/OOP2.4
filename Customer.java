public class Customer {
    private int id;
    private String name;
    private int discount;
    
    public Customer(int id, String name, int discount){
        this.discount = discount;
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    
    public String toString() {
        return ""+name+"("+id+")"+"("+discount+"%)";
    }
}