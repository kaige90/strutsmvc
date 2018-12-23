package com.chenkai.demo.strutsmvc.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.*;


@Results({@Result(location = "/index.jsp"),
        @Result(name = "error", location = "/error.jsp")})
public class IndexAction extends ActionSupport {

    @Action(value = "fun1")
    public String fun1() throws Exception {
        System.out.println("fun01 收到了请求....");
        return SUCCESS;
    }

    @Action(value = "fun2")
    public String fun2(){
        System.out.println("fun02 收到了请求....");
        return ERROR;
    }
}
