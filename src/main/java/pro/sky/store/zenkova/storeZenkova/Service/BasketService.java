package pro.sky.store.zenkova.storeZenkova.Service;

import pro.sky.store.zenkova.storeZenkova.data.Product;

import java.util.List;

public interface BasketService {
    public String addProductInBasket(int[] iD);
    List<Product> getProductInBasket();
}
