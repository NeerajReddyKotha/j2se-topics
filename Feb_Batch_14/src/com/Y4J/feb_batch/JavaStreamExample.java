package com.Y4J.feb_batch;
 import java.util.ArrayList;
import java.util.List;

import java.util.stream.Collectors;


import com.Y4J.feb_batch_package.Product;
public class JavaStreamExample {

	public static void main(String[] args) {
		List<Product> productlist = new ArrayList<Product>();
		productlist.add(new Product(1, "hp",25000f));
		productlist.add(new Product(2, "dell",35000f));
		productlist.add(new Product(3, "lenovo",55000f));
		productlist.add(new Product(4, "mac",15000f));
		productlist.add(new Product(5, "mis",5000f));
		productlist.add(new Product(6, "rog",75000f));
		productlist.add(new Product(7, "benq",2000f));
		productlist.add(new Product(8, "bajaj",20000f));
		productlist.add(new Product(9, "ogeneral",29000f));
		productlist.add(new Product(10, "orient",28000f));
		productlist.add(new Product(11, "oppo",20000f));
		
		Float totalprice = productlist.stream().map(p->p.price).reduce(0.0f,(sum,price)->sum+price);
		System.out.println(totalprice);
		
		}
		
		
				
			}
			
		
		
			
			
		
		
		
	


