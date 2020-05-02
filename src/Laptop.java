public class Laptop extends Gadget{
    private int memory;
    private int displaySize;


    public Laptop(int price, String color, int memory, int displaySize){
        super(price, color);
        this.memory = memory;
        this.displaySize = displaySize;
    }

    public int getMemory(){
        return memory;
    }

    public int getDisplaySize() {
        return displaySize;
    }

    public final void choiceGadget(String name, int memory){
        System.out.println("I want to choose "+ name + " with memory " + memory);

    }

    public void choiceGadget(int memory, String name){
        System.out.println("I want to choose "+ name + " with memory " + memory);

    }

    public String laptopSpecs(){
        return "Laptop specs are memory is " + memory + " GB, and display size " + displaySize;
    }
}
