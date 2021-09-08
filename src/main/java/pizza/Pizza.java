package pizza;

public class Pizza {
    private String pizzaTye;
    private String size;
    private String crustType;

    public Pizza(String pizzaTye, String size, String crustType) {
        this.pizzaTye = pizzaTye;
        this.size = size;
        this.crustType = crustType;
    }

    @Override
    public String toString() {
        String crustText = crustType;
        if(crustType.equalsIgnoreCase("thin")) {
            crustText += "crust";
        }
        return size + " " + crustType + " " + pizzaTye + " Pizza";
    }

    public String getPizzaTye() {
return pizzaTye;
    }
}
