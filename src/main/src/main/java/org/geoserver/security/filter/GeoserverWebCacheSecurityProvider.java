/**
 * 
 */
package org.geoserver.security.filter;

import org.geoserver.config.util.XStreamPersister;
import org.geoserver.security.config.SecurityNamedServiceConfig;
import org.geoserver.security.config.UsernamePasswordAuthenticationFilterConfig;

/**
 * Security provider for {@link GeoserverWebCacheSecurityFilter}
 * 
 * @author Mauricio Pazos
 *
 */
public class GeoserverWebCacheSecurityProvider extends AbstractFilterProvider {

    @Override
    public void configure(XStreamPersister xp) {
        super.configure(xp);
        xp.getXStream().alias("usernamePasswordFilter", UsernamePasswordAuthenticationFilterConfig.class);
    }

    @Override
    public Class<? extends GeoServerSecurityFilter> getFilterClass() {
        return GeoserverWebCacheSecurityFilter.class;
    }

    @Override
    public GeoServerSecurityFilter createFilter(SecurityNamedServiceConfig config) {
        return new GeoserverWebCacheSecurityFilter();
    }
}
