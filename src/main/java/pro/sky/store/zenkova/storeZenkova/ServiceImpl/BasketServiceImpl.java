package pro.sky.store.zenkova.storeZenkova.ServiceImpl;

import org.springframework.stereotype.Repository;
import org.springframework.web.context.annotation.SessionScope;
import pro.sky.store.zenkova.storeZenkova.Service.BasketService;
import pro.sky.store.zenkova.storeZenkova.Service.StoreProductService;
import pro.sky.store.zenkova.storeZenkova.data.Product;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Repository
@SessionScope
public class BasketServiceImpl implements BasketService {

    StoreProductService storeProductService;

    public BasketServiceImpl(StoreProductService storeProductService) {
        this.storeProductService = storeProductService;
    }


    public Set<Product> basket = new HashSet<>();

    public String addProductInBasket(int[] iD) {
        for (int a : iD) {
            if (a <= 0) {
                throw new RuntimeException("Код продукта не может быть отрицательным или равен нулю");
            }
            basket.add(storeProductService.getProducts().get(a));
        }
        return "Продукт(ы) добавлен(ы) в корзину!";
    }

    public List<Product> getProductInBasket() {
        return basket.stream()
                .collect(Collectors.toList());
    }
}
