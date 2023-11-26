class Flower {
    private String name;
    private int numPetals;
    private float price;

    public Flower(String name, int numPetals, float price) {
        this.name = name;
        this.numPetals = numPetals;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumPetals() {
        return numPetals;
    }

    public void setNumPetals(int numPetals) {
        this.numPetals = numPetals;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
public class Q17 {

    public static void main(String[] args) {
        Flower rose = new Flower("Rose", 10, 10.1f);
        System.out.println("Name: " + rose.getName());
        System.out.println("Number of petals: " + rose.getNumPetals());
        System.out.println("Price: " + rose.getPrice());

        rose.setName("Sunflower");
        rose.setNumPetals(5);
        rose.setPrice(5.9f);

        System.out.println("Name: " + rose.getName());
        System.out.println("Number of petals: " + rose.getNumPetals());
        System.out.println("Price: " + rose.getPrice());
    }
}


