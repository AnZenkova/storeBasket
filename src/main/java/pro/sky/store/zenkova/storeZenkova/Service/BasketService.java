package pro.sky.store.zenkova.storeZenkova.Service;

import pro.sky.store.zenkova.storeZenkova.data.Product;

import java.util.List;

public interface BasketService {
    String addProductInBasket(Integer[] iD);
    List<Product> getProductInBasket();
}
