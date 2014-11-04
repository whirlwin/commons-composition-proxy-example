package org.whirlwin;

import org.springframework.context.annotation.*;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.whirlwin.commons_composition_proxy.spring.CommonsCompositionProxySpringConfig;

@Configuration
@EnableWebMvc
@ComponentScan("org.whirlwin")
@Import(CommonsCompositionProxySpringConfig.class)
public class AppConfig {

    @Bean
    public ViewResolver getViewResolver(){
        final InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/views/");
        resolver.setSuffix(".jsp");
        return resolver;
    }
}
