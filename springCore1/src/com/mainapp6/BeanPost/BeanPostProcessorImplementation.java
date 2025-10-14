package com.mainapp6.BeanPost;

import com.mainapp3.DAO;
import com.mainapp6.Controller.Controller;
import com.mainapp6.Dao.Dao;
import com.mainapp6.Service.Service;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeanPostProcessorImplementation implements BeanPostProcessor {

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof Controller) {
            System.out.println("After init "+ beanName);
        } else if (bean instanceof Service) {
            System.out.println("After init "+ beanName);
        }
        else{
            Dao dao = (Dao) bean;
            String result = dao.init();
            if(result.equals("Connection Success")){
                System.out.println("After init "+ beanName);
            }
            else {
                System.out.println("Dao Failed to init "+ beanName);
            }


        }
        return bean;
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof Controller) {
            System.out.println("Before init "+ beanName);
        } else if (bean instanceof Service) {
            System.out.println("Before init "+ beanName);
        }
        else{
            System.out.println("Before init "+ beanName);
        }
        return bean;
    }
}
