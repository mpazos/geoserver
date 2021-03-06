/* Copyright (c) 2014 OpenPlans - www.openplans.org. All rights reserved.
 * This code is licensed under the GPL 2.0 license, available at the root
 * application directory.
 */
package org.geoserver.platform.resource;

import java.io.File;

import javax.servlet.ServletContext;

import org.geoserver.platform.GeoServerResourceLoader;
import org.springframework.web.context.ServletContextAware;

/**
 * ResourceStore using ServletContext to look up data directory.
 * 
 * @see GeoServerResourceLoader#lookupGeoServerDataDirectory(ServletContext)
 * @author Jody Garnett (Boundless)
 */
public class DataDirectoryResourceStore extends FileSystemResourceStore implements
        ServletContextAware {

    public DataDirectoryResourceStore() {
        // base directory obtained from servlet context
    }

    @Override
    public void setServletContext(ServletContext servletContext) {
        String data = GeoServerResourceLoader.lookupGeoServerDataDirectory(servletContext);
        if (data != null) {
            this.baseDirectory = new File(data);
        } else {
            throw new IllegalStateException("Unable to determine data directory");
        }
    }
}
