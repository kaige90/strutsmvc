package com.chenkai.demo.strutsmvc.action.api;

import com.chenkai.demo.strutsmvc.exception.ReadMessageException;
import com.chenkai.demo.strutsmvc.util.JsonResult;
import com.google.common.collect.Lists;
import org.apache.struts2.convention.annotation.*;

import java.util.List;

/**
 * 用户相关接口
 */
@ParentPackage("custom-api")

public class UserController extends BaseAPIAction {
    /**
     * 获取用户列表
     * @return
     */
    @Action(value = "/api/users")
    public String getUsers() throws ReadMessageException {
        //页面结果
        List<Integer> users = Lists.newArrayList(1, 2, 3, 10);
        if(users.size() <10){
            throw new ReadMessageException("用户的数量不足10人！");
        }
        //将结果压入栈顶
        return pushJson(JsonResult.successResult(users));
    }
}
