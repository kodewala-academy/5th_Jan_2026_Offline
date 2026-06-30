package com.amazon;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ProductController
{

	@GetMapping("viewProductPage")
	public String displayProductPage()
	{
		System.out.println("ProductController.displayProductPage()::::::::::::::::::::::::::::::::::::::::::::");
		return "product-search"; // product-search --> /WEB-INF/views/search/product-search.jsp
	}

	@GetMapping("searchProduct")
	@ResponseBody
	public String searchProducts(@RequestParam("searchText") String inputString)
	{
		System.out.println(" Searchnig the product for String : " + inputString);

		return "iPhone 17e 256 GB: 15.40 cm (6.1″) Super Retina XDR Display, "
				+ "A19 Chip, All-Day Battery Life, 48MP Fusion Camera, 256GB " + "Starting Storage; Soft Pink";
	}

}
