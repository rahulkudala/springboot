package com.example.Relationships.Controller;

import com.example.Relationships.Models.CustomerModel;
import com.example.Relationships.Models.ItemModel;
import com.example.Relationships.Services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping("/add-customers")
    public void adding(@RequestBody CustomerModel customerModel)
    {
        customerService.add(customerModel);

    }

    @GetMapping("/get-customers")
    public List<CustomerModel> getting()
    {
        return customerService.get();
    }

}
