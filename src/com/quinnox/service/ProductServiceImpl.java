/**
 * 
 */
package com.quinnox.service;

import java.rmi.RemoteException;
import java.util.List;

import com.quinnox.domain.Product;
import com.quinnox.repository.ProductRepository;
import com.quinnox.repository.ProductRepositoryDBImpl;

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
		// TODO Auto-generated constructor stub
		productRepository = new ProductRepositoryDBImpl();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.quinnox.service.ProductService#addProduct(com.quinnox.domain.Product)
	 */
	@Override
	public void addProduct(Product product) throws RemoteException{
		// TODO Auto-generated method stub

		
			productRepository.addProduct(product);
		

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.quinnox.service.ProductService#getPoducts()
	 */
	@Override
	public List<Product> getPoducts() throws RemoteException{
		// TODO Auto-generated method stub

		return productRepository.getPoducts();
	}

	@Override
	public Product getProductById(int id) throws RemoteException{
		// TODO Auto-generated method stub
		return productRepository.getProductById(id);
	}

	@Override
	public void deleteProduct(Product product) throws RemoteException{
		// TODO Auto-generated method stub

		productRepository.deleteProduct(product);
	}

	@Override
	public void updateProduct(Product product) throws RemoteException{
		// TODO Auto-generated method stub

		productRepository.updateProduct(product);
	}

}
