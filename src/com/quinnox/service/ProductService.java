/**
 * 
 */
package com.quinnox.service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import com.quinnox.domain.Product;

/**
 * @author NikhilB
 *
 */
public interface ProductService extends Remote{
	public void addProduct(Product product)throws RemoteException;
	public List<Product> getPoducts()throws RemoteException;
	public Product getProductById(int id)throws RemoteException;
	
	public void deleteProduct(Product product)throws RemoteException;
	public void updateProduct(Product product)throws RemoteException;

}
