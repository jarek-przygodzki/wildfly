/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2006, Red Hat Middleware LLC, and individual contributors
 * as indicated by the @author tags. See the copyright.txt file in the
 * distribution for a full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.jboss.as.test.smoke.webservices;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;

/**
 * This class was generated by Apache CXF 2.3.1
 * Mon Mar 14 19:07:07 BRT 2011
 * Generated source version: 2.3.1
 *
 * @author <a href="mailto:flavia.rainone@jboss.com">Flavia Rainone</a>
 */
@WebServiceClient(name = "EndpointService",
                  wsdlLocation = "http://localhost:8080/ws-example?wsdl",
                  targetNamespace = "http://webservices.smoke.test.as.jboss.org/")
public class EndpointService extends Service {

    public static final QName SERVICE = new QName("http://archive.ws.demos.as.jboss.org/", "EndpointService");
    public static final QName EndpointPort = new QName("http://archive.ws.demos.as.jboss.org/", "EndpointPort");


    public EndpointService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public EndpointService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public EndpointService() {
        super(null, SERVICE);
    }

    @WebEndpoint(name = "EndpointPort")
    public Endpoint getEndpointPort() {
        return super.getPort(EndpointPort, Endpoint.class);
    }

    @WebEndpoint(name = "EndpointPort")
    public Endpoint getEndpointPort(WebServiceFeature... features) {
        return super.getPort(EndpointPort, Endpoint.class, features);
    }

}
