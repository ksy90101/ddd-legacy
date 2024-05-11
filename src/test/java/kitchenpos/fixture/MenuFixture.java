package kitchenpos.fixture;

import kitchenpos.domain.Menu;
import kitchenpos.domain.MenuProduct;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

public class MenuFixture {
    private MenuFixture() {

    }

    public static Menu createMenu(UUID menuGroupId, String name, BigDecimal price,
                                  boolean displayed, List<MenuProduct> menuProducts) {
        final Menu menu = new Menu();
        menu.setMenuGroupId(menuGroupId);
        menu.setName(name);
        menu.setPrice(price);
        menu.setDisplayed(displayed);
        menu.setMenuProducts(menuProducts);
        return menu;
    }

    public static Menu createMenu(UUID menuGroupId, BigDecimal price,
                                  boolean displayed, List<MenuProduct> menuProducts) {
        final Menu menu = new Menu();
        menu.setMenuGroupId(menuGroupId);
        menu.setPrice(price);
        menu.setDisplayed(displayed);
        menu.setMenuProducts(menuProducts);
        return menu;
    }

    public static Menu createMenu(UUID menuGroupId, String name,
                                  boolean displayed, List<MenuProduct> menuProducts) {
        final Menu menu = new Menu();
        menu.setMenuGroupId(menuGroupId);
        menu.setName(name);
        menu.setDisplayed(displayed);
        menu.setMenuProducts(menuProducts);
        return menu;
    }
}
