/**
 * 
 */
package com.quinnox.servicemain;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

import com.quinnox.hibernate.service.CategoryService;
import com.quinnox.hibernate.service.CategoryServiceImpl;
import com.quinnox.hibernate.service.ProductService;
import com.quinnox.hibernate.service.ProductServiceImpl;

import sun.rmi.transport.proxy.*;
/**
 * @author NikhilB
 *
 */
public class ServiceInvoker {

	/**
	 * @param args
	 * @throws RemoteException 
	 */
	public static void main(String[] args) throws RemoteException {
		// TODO Auto-generated method stub

		CategoryService categoryService=new CategoryServiceImpl();
		ProductService productService=new ProductServiceImpl();
		productService=(ProductService)UnicastRemoteObject.exportObject((Remote)productService,0);
		
		categoryService=(CategoryService)UnicastRemoteObject.exportObject((Remote)categoryService,0);
		Registry registry=LocateRegistry.createRegistry(1890);
		
		registry.rebind("RmiProductImpl",(Remote)productService);
		registry.rebind("RmiCategoryImpl",(Remote)categoryService);
		/*try {
			Thread.sleep(50000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}

}
