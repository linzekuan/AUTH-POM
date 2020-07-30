package com.lambert.sso.adapter;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import com.lambert.sso.adapter.loader.InterceptorAdaperLoader;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.http.converter.ByteArrayHttpMessageConverter;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.ResourceHttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.http.converter.support.AllEncompassingFormHttpMessageConverter;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

/**
 * @author lambert
 * @version $Id: WebConfigurer.java, v 0.1 2019年05月14日 9:16 PM lambert Exp $
 */

@Configuration
@ImportResource("classpath*:spring/*.xml")
public class WebConfigurer implements WebMvcConfigurer {

    private static final Logger LOG = LoggerFactory.getLogger(WebConfigurer.class);
    // 这个方法用来注册拦截器，我们自己写好的拦截器需要通过这里添加注册才能生效
    @Autowired(required = false)
    private InterceptorAdaperLoader interceptorAdaperLoader;


    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        LOG.info("ADD INTERCEPTORS START");
        if(interceptorAdaperLoader != null){
            List<InterceptorAdaper> interceptorAdaperList = interceptorAdaperLoader.getInterceptorAdapers();
            LOG.info("INTERCEPTOR LIST SIZE : "+interceptorAdaperList.size());
            if(interceptorAdaperList != null){

                for (InterceptorAdaper interceptorAdaper : interceptorAdaperList){
                    registry.addInterceptor(interceptorAdaper)
                            .addPathPatterns(interceptorAdaper.getPathPatterns())
                            .excludePathPatterns(interceptorAdaper.getExcludePathPatterns());
                }
            }
        }else{
            LOG.info("INTERCEPTOR ADAPER LOADER IS NOT NULL");
        }
        LOG.info("ADD INTERCEPTORS START");
    }

    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        converters.add(new ByteArrayHttpMessageConverter());
        converters.add(new StringHttpMessageConverter());
        converters.add(new ResourceHttpMessageConverter());
        converters.add(new AllEncompassingFormHttpMessageConverter());
        converters.add(new StringHttpMessageConverter());
        converters.add(longToStringConverter());
    }



    /***
     * 配置Swagger2静态资源访问
     * @date 2019/10/23 0023
     * @return void
     * @author ckw
     **/
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {

        LOG.info("ADD RESOURCE START");
        if(StringUtils.isNotBlank(WebProperty.ASSETS_RESOURCE)){
            LOG.info("ADD RESOURCE : "+WebProperty.ASSETS_RESOURCE);
            registry.addResourceHandler("/**").addResourceLocations(
                    "file://"+WebProperty.ASSETS_RESOURCE);
        }
        LOG.info("ADD RESOURCE END");
    }



    /***
     * 将返回给前端的Long和long，统一转化成字符串
     * @date 2019/10/22 0022
     * @return org.springframework.http.converter.json.MappingJackson2HttpMessageConverter
     * @author ckw
     **/
    private MappingJackson2HttpMessageConverter longToStringConverter() {
        MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
        ObjectMapper mapper = new ObjectMapper();
        SimpleModule simpleModule = new SimpleModule();
        //Long
        simpleModule.addSerializer(Long.class, ToStringSerializer.instance);
        //long
        simpleModule.addSerializer(Long.TYPE, ToStringSerializer.instance);
        mapper.registerModule(simpleModule);
        converter.setObjectMapper(mapper);
        return converter;
    }



}
