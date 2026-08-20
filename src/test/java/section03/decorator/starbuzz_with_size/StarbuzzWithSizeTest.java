package section03.decorator.starbuzz_with_size;

import org.junit.jupiter.api.Test;
import section03.decorator.starbuzz_with_size.Beverage.Size;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StarbuzzWithSizeTest {

    private static final double DELTA = 0.001;

    @Test
    void soyCostsTenFifteenTwentyCentsBySize() {
        assertEquals(.99, soyHouseBlend(Size.TALL).cost(), DELTA);
        assertEquals(1.04, soyHouseBlend(Size.GRANDE).cost(), DELTA);
        assertEquals(1.09, soyHouseBlend(Size.VENTI).cost(), DELTA);
    }

    @Test
    void decoratorDelegatesSizeToWrappedBeverage() {
        Beverage beverage = new HouseBlend();
        beverage.setSize(Size.VENTI);
        beverage = new Soy(beverage);
        beverage = new Mocha(beverage);

        assertEquals(Size.VENTI, beverage.getSize());
    }

    @Test
    void setSizeAfterDecoratingStillAffectsCondimentPrice() {
        Beverage beverage = new Soy(new HouseBlend());
        beverage.setSize(Size.VENTI);

        assertEquals(Size.VENTI, beverage.getSize());
        assertEquals(1.09, beverage.cost(), DELTA);
    }

    @Test
    void ventiHouseBlendWithSoyMochaWhip() {
        Beverage beverage = new HouseBlend();
        beverage.setSize(Size.VENTI);
        beverage = new Soy(beverage);
        beverage = new Mocha(beverage);
        beverage = new Whip(beverage);

        assertEquals("House Blend Coffee, Soy, Mocha, Whip", beverage.getDescription());
        assertEquals(1.49, beverage.cost(), DELTA);
    }

    private static Beverage soyHouseBlend(Size size) {
        Beverage beverage = new HouseBlend();
        beverage.setSize(size);
        return new Soy(beverage);
    }
}
