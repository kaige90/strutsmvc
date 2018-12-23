package com.chenkai.demo.strutsmvc.action.api;

import com.chenkai.demo.strutsmvc.util.JsonResult;
import com.opensymphony.xwork2.ActionContext;

public class ExceptionHandlerAction extends BaseAPIAction{

    /**
     * 全局可读异常拦截
     * @param e
     * @return
     */
    public String execute(Exception e){
        System.out.println("进入可读异常中...");
        JsonResult result = new JsonResult();
        result.setFalse();
        result.setMessage(e.getMessage());
        ActionContext.getContext().getValueStack().push(result);
        return "errorJson";
    }
}
