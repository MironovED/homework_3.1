public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
//        int price = 12_000;
        int miles = service.calculate(12 000);
        System.out.println(miles);
    }
}