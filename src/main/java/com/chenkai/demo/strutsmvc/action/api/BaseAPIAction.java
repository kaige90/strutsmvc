package com.chenkai.demo.strutsmvc.action.api;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.*;

@ParentPackage("json-default")
//@ExceptionMappings(@ExceptionMapping(exception = "com.chenkai.demo.strutsmvc.exception.ReadMessageException",result = "myexception1"))
@Results({@Result(name="json",type="json")})
public class BaseAPIAction extends ActionSupport {
    // 将结果压入栈顶
    public String pushJson(Object o){
        ActionContext.getContext().getValueStack().push(o);
        return "json";
    }
}
