public class Smartphone extends Laptop{
    private int cameraPixel;
    private Brands brand;
    private Country country;



    public Smartphone(int price, String color, int memory, int displaySize,int cameraPixel, Brands brand, Country country){
        super(price, color,memory,displaySize);
        this.cameraPixel = cameraPixel;
        this.brand = brand;
        this.country = country;

    }

    public int getCameraPixel() {
        return cameraPixel;
    }

    public Brands getBrand(){
        return brand;
    }

    public Country country(){
        return country;
    }

    @Override
    public void choiceGadget(int memory, String name){
        System.out.println("I want to choose "+ name + " with memory " + memory);

    }

    public String aboutSmarthone(){
        return "Specs of smartphone: price is $" + getPrice() + ", color is " + getColor()+ ", memory is " + getMemory()
                + ", display is " + getDisplaySize() + ", camera is " + cameraPixel + ", brand is " + brand +
                ", made in " + country().getName() + ", city " + country().getCityName();

    }
}
