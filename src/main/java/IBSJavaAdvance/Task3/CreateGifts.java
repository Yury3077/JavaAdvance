package IBSJavaAdvance.Task3;

public class CreateGifts {
    public static void main(String[] args) {
        Candy candy1 = new Candy("Рафаэлло", 1.0, 130.00, true);
        Candy candy2 = new Candy("Snikers", 3.0, 50.00, true);

        Сhocolate choco1 = new Сhocolate("Виспа", 4.2, 100.00, "Черный шокалад");
        Сhocolate choco2 = new Сhocolate("Таблерон", 7.0, 200.10, "Молочный шокалад");

        Lollipop lol1 = new Lollipop("Бон пари", 6.0, 15.50, "Разные");
        Lollipop lol2 = new Lollipop("Петушек", 1.0, 1.00, "Рыжий");

        Gift gift1 = new Gift(candy1, choco1, lol1);
        Gift gift2 = new Gift(candy2, choco2, lol2);

        System.out.println(gift1.toString());
        System.out.println(gift2.toString());
    }
}
