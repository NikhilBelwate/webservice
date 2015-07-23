/**
 * 
 */
package com.quinnox.hibernate.service;



import java.rmi.RemoteException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.quinnox.hibernate.domain.Category;

/**
 * @author NikhilB
 *
 */
public class TestCategoryServiceImpl {
CategoryService categoryService=null;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		categoryService=new CategoryServiceImpl();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		categoryService=null;
	}

	/**
	 * Test method for {@link com.quinnox.service.CategoryServiceImpl#addCategory(com.quinnox.domain.Category)}.
	 * @throws RemoteException 
	 */
	@Test
	public void testAddCategory() throws RemoteException {
		Category category=new Category();
		category.setCategoryName("Food");
		categoryService.addCategory(category);
	}

	/**
	 * Test method for {@link com.quinnox.service.CategoryServiceImpl#getCategorys()}.
	 * @throws RemoteException 
	 */
	@Test
	public void testGetCategorys() throws RemoteException {
		System.out.println(categoryService.getCategorys());
	}

	/**
	 * Test method for {@link com.quinnox.service.CategoryServiceImpl#deleteCategory(com.quinnox.domain.Category)}.
	 * @throws RemoteException 
	 */
	@Test
	public void testDeleteCategory() throws RemoteException {
		Category category=new Category();
		category.setId(3);
		category.setCategoryName("Electronics");
		categoryService.deleteCategory(category);
	}

	/**
	 * Test method for {@link com.quinnox.service.CategoryServiceImpl#updateCategory(com.quinnox.domain.Category)}.
	 * @throws RemoteException 
	 */
	@Test
	public void testUpdateCategory() throws RemoteException {
		Category category=new Category();
		category.setId(4);
		category.setCategoryName("Electronics_Goods");
		categoryService.updateCategory(category);

	}

	/**
	 * Test method for {@link com.quinnox.service.CategoryServiceImpl#getCategoryById(int)}.
	 * @throws RemoteException 
	 */
	@Test
	public void testGetCategoryById() throws RemoteException {
		System.out.println(categoryService.getCategoryById(4));
	}

}
