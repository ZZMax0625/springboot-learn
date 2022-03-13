package com.zzmax.boot.restful.common;

import lombok.Data;

@Data
public class AjaxResponse {
    private Integer code;
    private String message;
    private Object data;

    private AjaxResponse(){

    }

    /**
     * 请求成功的响应：不带查询参数（常用于删除、修改、新增）
     * @return
     */
    public static AjaxResponse success(){
        AjaxResponse ajaxResponse = new AjaxResponse();
        ajaxResponse.setCode(200);
        ajaxResponse.setMessage("请求响应成功");
//        ajaxResponse.setCode(200);
        return ajaxResponse;
    }

    /**
     * 带返回数据的
     * @param data
     * @return
     */
    public static AjaxResponse success(Object data){
        AjaxResponse ajaxResponse = new AjaxResponse();
        ajaxResponse.setCode(200);
        ajaxResponse.setMessage("请求响应成功");
        ajaxResponse.setData(data);
        return ajaxResponse;
    }
}
