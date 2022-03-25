package pro.sky.store.zenkova.storeZenkova.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.store.zenkova.storeZenkova.Service.BasketService;

import java.util.Arrays;

@RestController
@RequestMapping("/store/order")
public class BasketController {

    public BasketService basketService;

    public BasketController(BasketService basketService) {
        this.basketService = basketService;
    }

    @RequestMapping("/add")
    public String addProductInBasket(@RequestParam int[] iD) {
        return basketService.addProductInBasket(iD);
    }

    @RequestMapping("/get")
    public String getProductInBasket() {
        return String.valueOf(basketService.getProductInBasket());
    }
}
