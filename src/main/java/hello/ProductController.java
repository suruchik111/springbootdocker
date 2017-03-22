package hello;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ProductController {   
	@RequestMapping(value = "/productlist", method = RequestMethod.GET)
    public List<Product> getAllProducts(Model model) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("general", "milk"));
        productList.add(new Product("general", "cream"));
        model.addAttribute("productlist", productList);
        return productList;   
    }
}
