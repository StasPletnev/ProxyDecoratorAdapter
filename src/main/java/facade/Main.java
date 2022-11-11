package facade;

public class Main {
    public static void main(String[] args) {
        BinOps binOps = new BinOps();
        System.out.println(binOps.sum("10011010000", "10011010000"));
        System.out.println(binOps.mult("10011010000", "10011010000"));
    }
}