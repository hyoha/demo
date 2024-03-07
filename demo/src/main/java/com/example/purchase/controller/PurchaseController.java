package com.example.purchase.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/category")
public class PurchaseController {

    @RequestMapping(value = "/purchase", method = RequestMethod.GET)
    public String showPurchasePage(Model model) {
        // Any data you want to pass to the JSP
        String productInfo = "Product information for category purchase";
        model.addAttribute("productInfo", productInfo);

        // Return the JSP file name without the extension
        return "category/purchase";
    }
}
