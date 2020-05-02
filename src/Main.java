public class Main {

    public static void main(String[] args) {
        Laptop lA  = new Laptop(500, "Grey", 512, 15);
        Smartphone sA = new Smartphone(450,"White", 128, 8,16,
                Brands.APPLE,new Country("USA", "Sacramento"));
        Smartphone sB = new Smartphone(400, "Black", 256, 7, 14,
                Brands.SAMSUNG, new Country("Korea", "Seoul"));

        System.out.println(sA.aboutSmarthone());
        sA.choiceGadget(128, "Smartphone");
        System.out.println(sB.aboutSmarthone());
        sB.choiceGadget(256, "Smartphone");
        System.out.println(lA.laptopSpecs());
        lA.choiceGadget(512,"Laptop");



    }

}
