/**
 * 
 */
package com.quinnox.service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import com.quinnox.domain.Category;

/**
 * @author NikhilB
 *
 */
public interface CategoryService extends Remote{

	public void addCategory(Category category)throws RemoteException;
	public List<Category> getCategorys()throws RemoteException;
	public void deleteCategory(Category category)throws RemoteException;
	public void updateCategory(Category category)throws RemoteException;
	public Category getCategoryById(int id)throws RemoteException;

}
