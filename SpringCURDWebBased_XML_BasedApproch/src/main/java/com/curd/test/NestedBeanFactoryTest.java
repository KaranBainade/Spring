package com.curd.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.curd.controller.EmployeeSearchController;
import com.curd.vo.EmployeeVO;


public class NestedBeanFactoryTest {

	public static void main(String[] args) {
		ApplicationContext pCtx=null,cCtx=null;
		EmployeeSearchController controller=null;
		List<EmployeeVO> listVO=null;
		//create ParentContainer
		pCtx=new ClassPathXmlApplicationContext("com/curd/cfgs/business-beans.xml");
		cCtx=new ClassPathXmlApplicationContext(new String[]{"com/curd/cfgs/presentation-beans.xml"},pCtx);
		//get Bean (Controller)
		controller=cCtx.getBean("empController",EmployeeSearchController.class);
		try{
		//inovke method
		listVO=controller.getEmpsByDesg(new String[]{"CLERK","MANAGER"});
		listVO.forEach(vo->{
			System.out.println(vo.getSno()+" "+vo.getEno()+" "+vo.getEname()+" "+vo.getJob()+" "+vo.getSalary()+" "+vo.getDeptno());
		});
		}
		catch(Exception e){
			System.out.println("Internal problem--->"+e.getMessage());
		}
	}//main
}//class
