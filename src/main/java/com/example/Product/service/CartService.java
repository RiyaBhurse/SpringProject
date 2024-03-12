package com.example.Product.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;

import com.example.Product.dto.FakeStoreCartDto;

//didnt understand dependency injection
@Service
public class CartService {
    RestTemplate restTemplate=new RestTemplate();
    String url="https://fakestoreapi.com/";

    public FakeStoreCartDto getASingleCart(Long id){
        FakeStoreCartDto response = restTemplate.getForObject(url+"carts/"+id, FakeStoreCartDto.class);
        return response;
    }
    public FakeStoreCartDto[] getAllCarts(){
        FakeStoreCartDto[] response = restTemplate.getForObject(url+"carts/", FakeStoreCartDto[].class);
        return response;
    }
    public FakeStoreCartDto[] getCartsInADateRange(String startdate, String enddate){
        FakeStoreCartDto[] response = restTemplate.getForObject(url+"carts?startdate="+startdate+"&enddate="+enddate, FakeStoreCartDto[].class);
        return response;
    }
    public FakeStoreCartDto getUserCarts(Long id){
        FakeStoreCartDto response = restTemplate.getForObject(url+"carts/user/"+id, FakeStoreCartDto.class);
        return response;
    }
    public FakeStoreCartDto addNewProduct(FakeStoreCartDto cart){
        FakeStoreCartDto response = restTemplate.postForObject(url+"carts", cart, FakeStoreCartDto.class);
        return response;
    }
    public FakeStoreCartDto updateAProduct(FakeStoreCartDto cart){
        restTemplate.put(url+"carts/"+cart.getId(), cart);
        return cart;
    }
    public void deleteAProduct(Long id){
        restTemplate.delete(url+"carts/"+id);
    }

   
}
