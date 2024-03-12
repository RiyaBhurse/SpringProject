package com.example.Product.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.example.Product.dto.FakeStoreCartDto;
import com.example.Product.service.CartService;

@RestController  
public class cartController {
    CartService cs;

    cartController(CartService cs){
        this.cs=cs;
    }

    @GetMapping("/carts")
    public FakeStoreCartDto[] getAllCarts(){
        return cs.getAllCarts();
    }

    @GetMapping("/carts/{id}")
    public FakeStoreCartDto getASingleCart(@PathVariable Long id){
        return cs.getASingleCart(id);
    }

    @GetMapping("/carts?{startdate}&{enddate}")// is it correct? 
    public FakeStoreCartDto[] getCartsInADateRange(@PathVariable String startdate, @PathVariable String enddate){
        return cs.getCartsInADateRange(startdate, enddate);
    }

    @GetMapping("/carts/user/{id}")
    public FakeStoreCartDto getUserCarts(@PathVariable Long id){
        return cs.getUserCarts(id);
    }

    
// to add new products i will use postmapping
// to update i will use putmapping
// to delete i will use deletemapping
// and i dont know any of them :)

    @PostMapping("/carts/{id}")
    public FakeStoreCartDto addNewProduct(@RequestBody FakeStoreCartDto id){
        return cs.addNewProduct(id);
    }

    @PutMapping("/carts/{id}")
    public FakeStoreCartDto updateAProduct(@RequestBody FakeStoreCartDto id){
        return cs.updateAProduct(id);
    }

    @DeleteMapping("/carts/{id}")
    public void deleteAProduct(@PathVariable Long id){
        cs.deleteAProduct(id);
    }
/*bro please resolve these errors :(
cartController.java:3: error: package org.springframework.web.bind.annotation does not exist
import org.springframework.web.bind.annotation.DeleteMapping;
                                              ^
cartController.java:4: error: package org.springframework.web.bind.annotation does not exist
import org.springframework.web.bind.annotation.GetMapping;
                                              ^
cartController.java:5: error: package org.springframework.web.bind.annotation does not exist
import org.springframework.web.bind.annotation.PathVariable;
                                              ^
cartController.java:6: error: package org.springframework.web.bind.annotation does not exist
import org.springframework.web.bind.annotation.PostMapping;
                                              ^
cartController.java:7: error: package org.springframework.web.bind.annotation does not exist
import org.springframework.web.bind.annotation.PutMapping;
                                              ^
cartController.java:8: error: package org.springframework.web.bind.annotation does not exist
import org.springframework.web.bind.annotation.RequestBody;
                                              ^
cartController.java:9: error: package org.springframework.web.bind.annotation does not exist
import org.springframework.web.bind.annotation.RestController;
                                              ^
cartController.java:12: error: package com.example.Product.dto does not exist
import com.example.Product.dto.FakeStoreCartDto;
                              ^
cartController.java:13: error: package com.example.Product.service does not exist
import com.example.Product.service.CartService;
                                  ^
cartController.java:15: error: cannot find symbol
@RestController  
 ^
  symbol: class RestController
cartController.java:17: error: cannot find symbol
    CartService cs;
    ^
  symbol:   class CartService
  location: class cartController
cartController.java:18: error: cannot find symbol
    cartController(CartService cs){
                   ^
  symbol:   class CartService
  location: class cartController
cartController.java:22: error: cannot find symbol
    public FakeStoreCartDto[] getAllCarts(){
           ^
  symbol:   class FakeStoreCartDto
  location: class cartController
cartController.java:27: error: cannot find symbol
    public FakeStoreCartDto getASingleCart(@PathVariable Long id){
           ^
  symbol:   class FakeStoreCartDto
  location: class cartController
cartController.java:32: error: cannot find symbol
    public FakeStoreCartDto[] getCartsInADateRange(@PathVariable String startdate, @PathVariable String enddate){
           ^
  symbol:   class FakeStoreCartDto
  location: class cartController
cartController.java:37: error: cannot find symbol
    public FakeStoreCartDto getUserCarts(@PathVariable Long id){
           ^
  symbol:   class FakeStoreCartDto
  location: class cartController
cartController.java:48: error: cannot find symbol
    public FakeStoreCartDto addNewProduct(@RequestBody FakeStoreCartDto cart){
                                                       ^
  symbol:   class FakeStoreCartDto
  location: class cartController
cartController.java:48: error: cannot find symbol
    public FakeStoreCartDto addNewProduct(@RequestBody FakeStoreCartDto cart){
           ^
  symbol:   class FakeStoreCartDto
  location: class cartController
cartController.java:53: error: cannot find symbol
    public FakeStoreCartDto updateAProduct(@RequestBody FakeStoreCartDto cart){
                                                        ^
  symbol:   class FakeStoreCartDto
  location: class cartController
cartController.java:53: error: cannot find symbol
    public FakeStoreCartDto updateAProduct(@RequestBody FakeStoreCartDto cart){
           ^
  symbol:   class FakeStoreCartDto
  location: class cartController
cartController.java:21: error: cannot find symbol
    @GetMapping("/carts")
     ^
  symbol:   class GetMapping
  location: class cartController
cartController.java:27: error: cannot find symbol
    public FakeStoreCartDto getASingleCart(@PathVariable Long id){
                                            ^
  symbol:   class PathVariable
  location: class cartController
cartController.java:26: error: cannot find symbol
    @GetMapping("/carts/{id}")
     ^
  symbol:   class GetMapping
  location: class cartController
cartController.java:32: error: cannot find symbol
    public FakeStoreCartDto[] getCartsInADateRange(@PathVariable String startdate, @PathVariable String enddate){
                                                    ^
  symbol:   class PathVariable
  location: class cartController
cartController.java:32: error: cannot find symbol
    public FakeStoreCartDto[] getCartsInADateRange(@PathVariable String startdate, @PathVariable String enddate){
                                                                                    ^
  symbol:   class PathVariable
  location: class cartController
cartController.java:31: error: cannot find symbol
    @GetMapping("/carts?{startdate}&{enddate}")// is it correct? 
     ^
  symbol:   class GetMapping
  location: class cartController
cartController.java:37: error: cannot find symbol
    public FakeStoreCartDto getUserCarts(@PathVariable Long id){
                                          ^
  symbol:   class PathVariable
  location: class cartController
cartController.java:36: error: cannot find symbol
    @GetMapping("/carts/user/{id}")
     ^
  symbol:   class GetMapping
  location: class cartController
cartController.java:48: error: cannot find symbol
    public FakeStoreCartDto addNewProduct(@RequestBody FakeStoreCartDto cart){
                                           ^
  symbol:   class RequestBody
  location: class cartController
cartController.java:47: error: cannot find symbol
    @PostMapping("/carts, user/{id}, date/{date},  products/{products}")
     ^
  symbol:   class PostMapping
  location: class cartController
cartController.java:53: error: cannot find symbol
    public FakeStoreCartDto updateAProduct(@RequestBody FakeStoreCartDto cart){
                                            ^
  symbol:   class RequestBody
  location: class cartController
cartController.java:52: error: cannot find symbol
    @PutMapping("/carts/{id}, user/{id}, date/{date},  products/{products}")
     ^
  symbol:   class PutMapping
  location: class cartController
cartController.java:58: error: cannot find symbol
    public void deleteAProduct(@PathVariable Long id){
                                ^
  symbol:   class PathVariable
  location: class cartController
cartController.java:57: error: cannot find symbol
    @DeleteMapping("/carts/{id}")
     ^
  symbol:   class DeleteMapping
  location: class cartController
34 errors
 */


}
