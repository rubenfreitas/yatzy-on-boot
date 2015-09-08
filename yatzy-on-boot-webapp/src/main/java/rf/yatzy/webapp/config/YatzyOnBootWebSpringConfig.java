package rf.yatzy.webapp.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;

import static rf.yatzy.webapp.config.AbstractYatzyOnBootWebSpringConfig.registryResources;
import static rf.yatzy.webapp.config.AbstractYatzyOnBootWebSpringConfig.resolveDefaultLocale;
import static rf.yatzy.webapp.config.AbstractYatzyOnBootWebSpringConfig.resolveLocaleChangeInterceptor;

/**
 * Created by rfreitas
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan
public class YatzyOnBootWebSpringConfig extends WebMvcConfigurerAdapter {

    @Bean
    public LocaleResolver localeResolver() {
        return resolveDefaultLocale();
    }

    @Bean
    public LocaleChangeInterceptor localeChangeInterceptor() {
        return resolveLocaleChangeInterceptor();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(localeChangeInterceptor());
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registryResources(ResourcesConfigs.values(), registry);
    }
}
