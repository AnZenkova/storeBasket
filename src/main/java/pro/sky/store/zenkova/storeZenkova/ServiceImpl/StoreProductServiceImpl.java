package pro.sky.store.zenkova.storeZenkova.ServiceImpl;

import org.springframework.stereotype.Service;
import pro.sky.store.zenkova.storeZenkova.Service.StoreProductService;
import pro.sky.store.zenkova.storeZenkova.data.Product;

import java.util.*;

@Service
public class StoreProductServiceImpl implements StoreProductService {

    public Map<Integer, Product> store = new HashMap<>(Map.of(
            1, new Product("Хлеб"),
            2, new Product("Масло"),
            3, new Product("Молоко"),
            4, new Product("Йогурт"),
            5, new Product("Яблоки"),
            6, new Product("Морковь")
    ));

    public List<Product> getProducts() {
        return new ArrayList<>(store.values());
    }

}
