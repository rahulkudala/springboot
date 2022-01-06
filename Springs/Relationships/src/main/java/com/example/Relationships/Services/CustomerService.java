package com.example.Relationships.Services;

import com.example.Relationships.Entities.CustomerEntity;
import com.example.Relationships.Entities.ItemEntity;
import com.example.Relationships.Models.CustomerModel;
import com.example.Relationships.Models.ItemModel;
import com.example.Relationships.Repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public void add(CustomerModel customerModel) {

        CustomerEntity customerEntity = new CustomerEntity();

        customerEntity.setName(customerModel.getName());
        customerEntity.setItemEntity(customerEntity.getItemEntity());

        ItemEntity itemE = new ItemEntity();
        itemE.setId(customerModel.getItemModel().getId());
        itemE.setName(customerModel.getItemModel().getName());
        customerEntity.setItemEntity(itemE);
        customerRepository.save(customerEntity);
    }

    public List<CustomerModel> get()
    {
        List<CustomerEntity> l1 = customerRepository.findAll();

        return l1.stream().map(c -> getCustomers(c)).collect(Collectors.toList());
    }

    private CustomerModel getCustomers(CustomerEntity customerEntity) {

        return new CustomerModel(
                customerEntity.getId(),
                customerEntity.getName(),
                new ItemModel(customerEntity.getItemEntity().getId(),customerEntity.getItemEntity().getName()));
    }
}
