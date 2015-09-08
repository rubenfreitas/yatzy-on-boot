package rf.yatzy.webapp.config;

import static rf.yatzy.webapp.config.ResourcesConfigConstants.CSS_RESOURCE_HANDLER;
import static rf.yatzy.webapp.config.ResourcesConfigConstants.CSS_RESOURCE_LOCATION;
import static rf.yatzy.webapp.config.ResourcesConfigConstants.IMG_RESOURCE_HANDLER;
import static rf.yatzy.webapp.config.ResourcesConfigConstants.IMG_RESOURCE_LOCATION;
import static rf.yatzy.webapp.config.ResourcesConfigConstants.JS_RESOURCE_HANDLER;
import static rf.yatzy.webapp.config.ResourcesConfigConstants.JS_RESOURCE_LOCATION;
import static rf.yatzy.webapp.config.ResourcesConfigConstants.STATIC_RESOURCE_HANDLER;
import static rf.yatzy.webapp.config.ResourcesConfigConstants.STATIC_RESOURCE_LOCATION;

/**
 * Created by rfreitas
 */
enum ResourcesConfigs {
    STATIC(STATIC_RESOURCE_HANDLER, STATIC_RESOURCE_LOCATION), //
    CSS(CSS_RESOURCE_HANDLER, CSS_RESOURCE_LOCATION), //
    JS(JS_RESOURCE_HANDLER, JS_RESOURCE_LOCATION), //
    IMG(IMG_RESOURCE_HANDLER, IMG_RESOURCE_LOCATION);

    private String resourceHandler;
    private String resourceLocation;

    ResourcesConfigs(String resourceHandler, String resourceLocation) {
        this.resourceHandler = resourceHandler;
        this.resourceLocation = resourceLocation;
    }

    public String getResourceHandler() {
        return resourceHandler;
    }

    public String getResourceLocation() {
        return resourceLocation;
    }
}
