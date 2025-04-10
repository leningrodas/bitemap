package bitmap.bitmap_backend.controllers;

import bitmap.bitmap_backend.dto.Product;
import bitmap.bitmap_backend.form.ProductRequest;
import bitmap.bitmap_backend.services.ProductService;
import bitmap.bitmap_backend.shared.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api") // Base path for all product endpoints
//@CrossOrigin(origins = "http://localhost:3000") If you just want to enable CORS for this specific controller
public class ProductController extends BaseController {

    @Autowired
    private ProductService service;


    @GetMapping("/products")
    public List<Product> getPage(@RequestParam(name = "start", required = false) final String start) {
        return service.selectAllProduct();  // This will return JSON directly
    }

    @PostMapping("/products")
    public int createProduct(@RequestBody ProductRequest request) {
        Product dto = new Product();
        System.out.println("Received product: " + request.getName() + ", " +
                request.getDescription() + ", $" + request.getPrice());
        dto.setDescription(request.getDescription());
        dto.setName(request.getName());
        dto.setPrice(request.getPrice());
        return service.insertProduct(dto); // Implement saveProduct in your ProductService
    }


}
