/**
 * 
 */
package com.quinnox.hibernate.service;

import java.rmi.RemoteException;
import java.util.List;

import com.quinnox.hibernate.domain.Category;
import com.quinnox.hibernate.repository.CategoryRepository;
import com.quinnox.hibernate.repository.CategoryRepositoryDBImpl;

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
	 * com.quinnox.hibernate.repository.CategoryRepository#addCategory(com.quinnox.hibernatedomain
	 * .Category)
	 */
	@Override
	public void addCategory(Category category)throws RemoteException {
		// TODO Auto-generated method stub
		categoryRepository.addCategory(category);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.quinnox.hibernate.repository.CategoryRepository#getCategorys()
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
	 * com.quinnox.hibernaterepository.CategoryRepository#deleteCategory(com.quinnox.hibernate
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
	 * com.quinnox.hibernate.repository.CategoryRepository#updateCategory(com.quinnox.hibernate
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
	 * @see com.quinnox.hibernate.repository.CategoryRepository#getCategoryById(int)
	 */
	@Override
	public Category getCategoryById(int id) throws RemoteException{
		// TODO Auto-generated method stub
		return categoryRepository.getCategoryById(id);
	}
	
	

}
