package com.ITcoffee.CoffeeShop.Configs;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.io.File;

@Configuration
public class MvcConfig implements WebMvcConfigurer {



  //  @Value("${upload.path}")
  //  private String uploadPath;

    final String dir = System.getProperty("user.dir");//текущий рабочий каталог в Java


    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry){

        registry.addResourceHandler("/css/**")
                .addResourceLocations("file:///"+dir+File.separator +"src"+File.separator +"main"+File.separator +"resources"
                        +File.separator +"css"+ File.separator );

        registry.addResourceHandler("/img/**")
                .addResourceLocations("file:///"+dir+File.separator +"src"+File.separator +"main"+File.separator +"resources"
                        +File.separator +"img"+ File.separator);

      //  registry.addResourceHandler("/imgs/**")
      //          .addResourceLocations("file:///"+"E:/CoffeeShop/img"+ File.separator );
        //E:\CoffeeShop\img
    }

}
