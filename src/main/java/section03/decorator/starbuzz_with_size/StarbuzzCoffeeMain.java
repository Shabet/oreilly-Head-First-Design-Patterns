package section03.decorator.starbuzz_with_size;

import section03.decorator.starbuzz_with_size.Beverage.Size;

public class StarbuzzCoffeeMain {

    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        print(beverage);
        System.out.println("-----------------------------------------------------");

        Beverage beverage2 = new DarkRoast();
        beverage2.setSize(Size.GRANDE);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        print(beverage2);
        System.out.println("-----------------------------------------------------");

        Beverage beverage3 = new HouseBlend();
        beverage3.setSize(Size.VENTI);
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        print(beverage3);
        System.out.println("-----------------------------------------------------");

        Beverage tallSoy = new HouseBlend();
        tallSoy.setSize(Size.TALL);
        tallSoy = new Soy(tallSoy);
        print(tallSoy);

        Beverage grandeSoy = new HouseBlend();
        grandeSoy.setSize(Size.GRANDE);
        grandeSoy = new Soy(grandeSoy);
        print(grandeSoy);

        Beverage ventiSoy = new HouseBlend();
        ventiSoy.setSize(Size.VENTI);
        ventiSoy = new Soy(ventiSoy);
        print(ventiSoy);
    }

    private static void print(Beverage beverage) {
        System.out.println(beverage.getSize() + " " + beverage.getDescription()
                + " $" + String.format("%.2f", beverage.cost()));
    }
}
