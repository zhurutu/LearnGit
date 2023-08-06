package com.example.priject.Configration;

import org.springframework.boot.web.server.ErrorPage;
import org.springframework.boot.web.server.ErrorPageRegistrar;
import org.springframework.boot.web.server.ErrorPageRegistry;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;

@Configuration
public class ErrorConfig implements ErrorPageRegistrar
{

    @Override
    public void registerErrorPages(ErrorPageRegistry registry) {
        ErrorPage page404=new ErrorPage(HttpStatus.INTERNAL_SERVER_ERROR,"/errors/error404");
        registry.addErrorPages(page404);
    }
}
