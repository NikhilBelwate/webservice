/**
 * 
 */
package com.quinnox.hibernate.service;

import java.rmi.RemoteException;
import java.util.List;

import com.quinnox.hibernate.domain.Product;
import com.quinnox.hibernate.repository.ProductRepository;
import com.quinnox.hibernate.repository.ProductRepositoryDBImpl;

/**
 * @author NikhilB
 *
 */
public class ProductServiceImpl implements ProductService {
	ProductRepository productRepository;

	/**
	 * constructor
	 */
	public ProductServiceImpl() {
		
		productRepository = new ProductRepositoryDBImpl();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.quinnox.hibernate.service.ProductService#addProduct(com.quinnox.hibernate.domain.Product)
	 */
	@Override
	public void addProduct(Product product)throws RemoteException {
		
		if (product.getPrice() > 20) {
			productRepository.addProduct(product);
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.quinnox.hibernate.service.ProductService#getPoducts()
	 */
	@Override
	public List<Product> getProducts()throws RemoteException {
	
		return productRepository.getProducts();
	}

	@Override
	public Product getProductById(int id)throws RemoteException {
		
		return productRepository.getProductById(id);
	}

	@Override
	public void deleteProduct(Product product)throws RemoteException {
		

		productRepository.deleteProduct(product);
	}

	@Override
	public void updateProduct(Product product)throws RemoteException {
		
		productRepository.updateProduct(product);
	}

	@Override
	public List<Product> getProductsByCategory(int id)throws RemoteException {
		
		return productRepository.getProductsByCategory(id);
	}

	@Override
	public List<Product> getProductsByCategory(String categoryName)throws RemoteException {
		
		return productRepository.getProductsByCategory(categoryName);
	}

	@Override
	public List<Product> getProductsInRange(int min, int max)throws RemoteException {
		// TODO Auto-generated method stub
		return productRepository.getProductsInRange(min, max);
	}

	@Override
	public void addBulkProducts(List<Product> productList)throws RemoteException {
		// TODO Auto-generated method stub
		productRepository.addBulkProducts(productList);
	}

	

}
