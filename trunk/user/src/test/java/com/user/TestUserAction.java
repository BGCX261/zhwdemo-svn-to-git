package com.user;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.web.servlet.ModelAndView;

import com.JUnitActionBase;

public class TestUserAction extends JUnitActionBase {  
    @Test  
    public void testAdd() throws Exception {  
    MockHttpServletRequest request = new MockHttpServletRequest();  
        MockHttpServletResponse response = new MockHttpServletResponse();  
        request.setRequestURI("/user/list.jhtml");  
//        request.addParameter("id", "1002");  
//        request.addParameter("date", "2010-12-30");  
        request.setMethod("POST");  
        // 执行URI对应的action  
        final ModelAndView mav = this.excuteAction(request, response);  
        // Assert logic  
        Assert.assertEquals("order/list.jhtml", mav.getViewName());  
        String msg=(String)request.getAttribute("msg");  
        System.out.println(msg);  
    }  
}  