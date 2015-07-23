/**
 * 
 */
package com.quinnox.service;

import java.rmi.RemoteException;
import java.util.List;

import com.quinnox.domain.Category;
import com.quinnox.repository.CategoryRepository;
import com.quinnox.repository.CategoryRepositoryDBImpl;

/**
 * @author NikhilB
 *
 */
public class CategoryServiceImpl implements CategoryService {

	CategoryRepository categoryRepository = null;

	/**
	 * Constructor
	 */
	public CategoryServiceImpl() {
		// TODO Auto-generated constructor stub
		categoryRepository = new CategoryRepositoryDBImpl();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.quinnox.repository.CategoryRepository#addCategory(com.quinnox.domain
	 * .Category)
	 */
	@Override
	public void addCategory(Category category) throws RemoteException{
		// TODO Auto-generated method stub
		categoryRepository.addCategory(category);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.quinnox.repository.CategoryRepository#getCategorys()
	 */
	@Override
	public List<Category> getCategorys() throws RemoteException{
		// TODO Auto-generated method stub
		return categoryRepository.getCategorys();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.quinnox.repository.CategoryRepository#deleteCategory(com.quinnox.
	 * domain.Category)
	 */
	@Override
	public void deleteCategory(Category category) throws RemoteException{
		// TODO Auto-generated method stub
		categoryRepository.deleteCategory(category);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.quinnox.repository.CategoryRepository#updateCategory(com.quinnox.
	 * domain.Category)
	 */
	@Override
	public void updateCategory(Category category) throws RemoteException{
		// TODO Auto-generated method stub
		categoryRepository.updateCategory(category);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.quinnox.repository.CategoryRepository#getCategoryById(int)
	 */
	@Override
	public Category getCategoryById(int id) throws RemoteException{
		// TODO Auto-generated method stub
		return categoryRepository.getCategoryById(id);
	}

}
