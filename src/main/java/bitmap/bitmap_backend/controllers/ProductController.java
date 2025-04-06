package bitmap.bitmap_backend.controllers;

import bitmap.bitmap_backend.dto.Product;
import bitmap.bitmap_backend.form.ProductCache;
import bitmap.bitmap_backend.services.ProductService;
import bitmap.bitmap_backend.shared.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequestMapping("/api/products") // Base path for all product endpoints
//@CrossOrigin(origins = "http://localhost:3000") If you just want to enable CORS for this specific controller
public class ProductController extends BaseController {

    @Autowired
    private ProductService service;


    @GetMapping("")
    public List<Product> getAllProducts(@RequestParam(name = "start", required = false) final String start) {
        return service.selectAllProduct();  // This will return JSON directly
    }


}
