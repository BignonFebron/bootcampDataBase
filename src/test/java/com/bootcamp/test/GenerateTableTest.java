package com.bootcamp.test;

import com.bootcamp.AppConstants;
import org.testng.annotations.Test;

import javax.persistence.Persistence;
import java.util.Properties;

/**
 * Created by darextossa on 9/22/17.
 */


public class GenerateTableTest {

    @Test
    public void generateTablesMySQL(){
        System.out.println("Generate Table Test");
        Persistence.generateSchema(AppConstants.PERSISTENCE_UNIT, new Properties());
    }
}
