package bitmap.bitmap_backend.services;

import bitmap.bitmap_backend.dto.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import bitmap.bitmap_backend.repositories.ProductRepository;

import java.util.List;

@Service
public class ProductService {


    @Autowired
    private ProductRepository repository;

    @Transactional(readOnly = true)
    public int insertProduct(Product dto){
        return repository.insertProduct(dto);
    }

    @Transactional(readOnly = true)
    public Product selectProduct(String name){
        return repository.getProductById(name);
    }

    @Transactional(readOnly = true)
    public List<Product> selectAllProduct(){
        return repository.getAllProducts();
    }

}
