
public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("A" , 10 , 120 ,95 , 30);
        Fighter f2 = new Fighter("B", 20 , 85 , 90 , 40);

        Match match = new Match(f1 , f2 , 90 , 95);
        match.run();
    }
}