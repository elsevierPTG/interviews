/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.elsevier.education;

import java.io.File;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 * @author nico
 * 
 * Example on how to test this.
 */
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = {"test/resources/testConfig.xml"})
public class Example2Test implements ApplicationContextAware{

    private ApplicationContext applicationContext;
    
    
    
    public Example2Test() {
        
    }
    
    //@Test
    //@Ignore
    public void testWithGasEngine(){
       
    }
    
    //@Test
    //@Ignore
    public void testWithElectricEngine(){
        
    }

    @Override
    public void setApplicationContext(ApplicationContext ac) throws BeansException {
        this.applicationContext = ac;
    }
}
