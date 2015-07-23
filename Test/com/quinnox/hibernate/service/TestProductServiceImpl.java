/**
 * 
 */
package com.quinnox.hibernate.service;

import static org.junit.Assert.*;

import java.rmi.RemoteException;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.quinnox.hibernate.domain.Product;

/**
 * @author NikhilB
 *
 */
public class TestProductServiceImpl {
ProductService productService;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		productService=new ProductServiceImpl();
	 }

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		productService=null;
	}

	@Test
	public void testAddProduct() throws RemoteException {
		Product product=new Product();
		product.setPrice(60);
		product.setProductName("Product1");
		product.getCategory().setId(2);
		productService.addProduct(product);
		
	}
	@Test
	public void testGetProduct() throws RemoteException
	{
		List<Product> products=productService.getProducts();
		for(int i=0;i<products.size();i++)
		{
			System.out.println(products.get(i).getId()+" "+products.get(i).getProductName()
					+"  "+products.get(i).getPrice()+"  "+products.get(i).getCategory().getCategoryName());
		}
	
	}
	
	@Test
	public void testGetProductById() throws RemoteException
	{
		System.out.println(productService.getProductById(7));
	}
	@Test
	public void testGetProductByCategory() throws RemoteException
	{
		List<Product> products=productService.getProductsByCategory("Food");
		System.out.println(products);
	}

}
