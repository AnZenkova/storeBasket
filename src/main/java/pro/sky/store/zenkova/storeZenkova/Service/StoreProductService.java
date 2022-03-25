package pro.sky.store.zenkova.storeZenkova.Service;

import pro.sky.store.zenkova.storeZenkova.data.Product;

import java.util.Map;

public interface StoreProductService {
    Map<Integer, Product> getProducts();
}
