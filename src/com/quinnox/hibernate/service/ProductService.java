/**
 * 
 */
package com.quinnox.hibernate.service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import com.quinnox.hibernate.domain.Product;

/**
 * @author NikhilB
 *
 */
public interface ProductService extends Remote {
	public void addProduct(Product product)throws RemoteException;
	public List<Product> getProducts()throws RemoteException;
	public Product getProductById(int id)throws RemoteException;
	public List<Product> getProductsByCategory(int id)throws RemoteException;
	public List<Product> getProductsByCategory(String categoryName)throws RemoteException;
	public List<Product> getProductsInRange(int min, int max)throws RemoteException;
	public void deleteProduct(Product product)throws RemoteException;
	public void updateProduct(Product product)throws RemoteException;
	public void addBulkProducts(List<Product> productList)throws RemoteException;
	
}
