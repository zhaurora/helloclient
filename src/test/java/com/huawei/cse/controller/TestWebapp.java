package com.huawei.cse.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestWebapp {

        WebappDelegate webappDelegate = new WebappDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = webappDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}