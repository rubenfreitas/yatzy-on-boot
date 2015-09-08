package rf.yatzy.webapp.config;

import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import static java.util.Locale.UK;
import static rf.yatzy.webapp.config.YatzyOnBootWebSpringConfigConstants.LOCALE_CHANGE_INTERCEPTOR_PARAMETER;

/**
 * Created by rfreitas
 */
abstract class AbstractYatzyOnBootWebSpringConfig {

    public static LocaleResolver resolveDefaultLocale(){
        SessionLocaleResolver slr = new SessionLocaleResolver();
        slr.setDefaultLocale(UK);
        return slr;
    }

    public static LocaleChangeInterceptor resolveLocaleChangeInterceptor() {
        LocaleChangeInterceptor lci = new LocaleChangeInterceptor();
        lci.setParamName(LOCALE_CHANGE_INTERCEPTOR_PARAMETER);
        return lci;
    }

    public static void registryResources(ResourcesConfigs[] values, ResourceHandlerRegistry registry) {
        for(ResourcesConfigs cfg : values) {
            registry.addResourceHandler(cfg.getResourceHandler())
                    .addResourceLocations(cfg.getResourceLocation());
        }
    }
}
