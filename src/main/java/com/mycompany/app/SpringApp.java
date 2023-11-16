package com.mycompany.app;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class SpringApp
{
    public static void main(String[] args) {

        Resource resource=new ClassPathResource("applicationContext.xml");
        BeanFactory factory=new XmlBeanFactory(resource);
        Company company=(Company)factory.getBean("companyBean");
        System.out.println("Company: " +company.getName());
        System.out.println("Employees: "+company.getEmployee());
        System.out.println("Dept: "+company.getDepartment());

    }
    //Company, Employee, Dept
}
