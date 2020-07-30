package com.lambert.sso.web.auth;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.lambert.sso.common.util.ResponseUtil;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;

/**
 * @author lambert
 * @version $Id: BaseController.java, v 0.1 2020年07月30日 10:22 PM lambert Exp $
 */
@RequestMapping(value = "/auth")
public class BaseController {

    static {
        JSON.DEFFAULT_DATE_FORMAT = "yyyy-MM-dd HH:mm";
    }

    public void writeSuccess2Response(HttpServletResponse response , String result){
        ResponseUtil.writeSuccess2String(response,result);
    }

    public void writeSuccess2Response(HttpServletResponse response , Object result){
        ResponseUtil.writeSuccess2String(response,JSON.toJSONString(result,SerializerFeature.WriteDateUseDateFormat));
    }

    public void writeFail2Response(HttpServletResponse response,Exception e){
        ResponseUtil.writeFail2String(response,e);
    }
}