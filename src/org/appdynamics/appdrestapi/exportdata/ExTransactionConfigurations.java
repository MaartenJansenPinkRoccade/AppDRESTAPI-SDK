/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.exportdata;

import org.appdynamics.appdrestapi.resources.AppExportS;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 *
 * @author gilbert.solorzano
 */


@XmlSeeAlso(ExEEPointConfiguration.class)
public class ExTransactionConfigurations {
    private ArrayList<ExEEPointConfiguration> configurations=new ArrayList<ExEEPointConfiguration>();
    private int level=6;
    
    public ExTransactionConfigurations(){}

    @XmlTransient
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    
    @XmlElement(name=AppExportS.CONFIGURATION)
    public ArrayList<ExEEPointConfiguration> getConfigurations() {
        return configurations;
    }

    public void setConfigurations(ArrayList<ExEEPointConfiguration> configurations) {
        this.configurations = configurations;
    }

    public String whatIsDifferent(ExTransactionConfigurations obj){
        if(this.equals(obj)) return AppExportS._U;
        
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.I[level]).append(AppExportS.TRANSACTION_CONFIGURATIONS);
        level++;
        for(ExEEPointConfiguration value:configurations){
            boolean fnd=false;
            for(ExEEPointConfiguration _value: obj.getConfigurations()){
                if(value.getTransactionEntryPointType().equals(_value.getTransactionEntryPointType())){
                    fnd=true;
                    value.setLevel(level);
                    bud.append(value.whatIsDifferent(_value));
                }
            }
            
            if(!fnd){value.setLevel(level);bud.append(AppExportS.I[level]).append(AppExportS.SRC).append(value);}
        }
        
        for(ExEEPointConfiguration value:obj.getConfigurations()){
            boolean fnd=false;
            for(ExEEPointConfiguration _value: configurations){
                if(value.getTransactionEntryPointType().equals(_value.getTransactionEntryPointType())){
                    fnd=true;     
                }
            }
            if(!fnd){value.setLevel(level);bud.append(AppExportS.I[level]).append(AppExportS.DEST).append(value);}
        }
        
        return bud.toString();
    }
    @Override
    public String toString() {
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.I[level]).append(AppExportS.TRANSACTION_CONFIGURATIONS);
        level++;
        for(ExEEPointConfiguration eep: configurations){eep.setLevel(level); bud.append(eep);}
        level--;
        return bud.toString();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + (this.configurations != null ? this.configurations.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ExTransactionConfigurations other = (ExTransactionConfigurations) obj;
        
        if(configurations.size() != other.getConfigurations().size()) return false;
        for(ExEEPointConfiguration value:configurations){
            boolean fnd=false;
            for(ExEEPointConfiguration _value: other.getConfigurations()){
                if(value.getTransactionEntryPointType().equals(_value.getTransactionEntryPointType())){
                    if(value.equals(_value)) fnd=true;
                }
            }
            
            if(!fnd){return false;}
        }
        
        return true;
    }
    
    
    
    
}

 /* <transaction-configurations>
                <configuration transaction-entry-point-type="BINARY_REMOTING">
                    <enable>true</enable>
                    <discovery-config discovery-resolution="FIRST_ENTRY_POINT">
                        <discovery-config-enabled>true</discovery-config-enabled>
                        <excludes/>
                        <naming-config scheme="SIMPLE_CLASS_NAME_AND_METHOD_NAME">
                            <name-values/>
                        </naming-config>
                    </discovery-config>
                </configuration>
                <configuration transaction-entry-point-type="EJB">
                    <enable>true</enable>
                    <discovery-config discovery-resolution="FIRST_ENTRY_POINT">
                        <discovery-config-enabled>false</discovery-config-enabled>
                        <excludes/>
                        <naming-config scheme="EJB_NAME_AND_METHOD_NAME">
                            <name-values/>
                        </naming-config>
                    </discovery-config>
                </configuration>
                <configuration transaction-entry-point-type="JMS">
                    <enable>true</enable>
                    <discovery-config discovery-resolution="FIRST_ENTRY_POINT">
                        <discovery-config-enabled>true</discovery-config-enabled>
                        <excludes/>
                        <naming-config scheme="DESTINATION_NAME">
                            <name-values/>
                        </naming-config>
                    </discovery-config>
                </configuration>
                <configuration transaction-entry-point-type="POJO">
                    <enable>true</enable>
                    <discovery-config discovery-resolution="FIRST_ENTRY_POINT">
                        <discovery-config-enabled>false</discovery-config-enabled>
                        <excludes/>
                        <naming-config scheme="FULLY_QUALIFIED_CLASS_NAME">
                            <name-values/>
                        </naming-config>
                    </discovery-config>
                </configuration>
                <configuration transaction-entry-point-type="SERVLET">
                    <enable>true</enable>
                    <discovery-config discovery-resolution="FIRST_ENTRY_POINT">
                        <discovery-config-enabled>true</discovery-config-enabled>
                        <excludes>
                            <exclude name="Apache Axis Servlet">
                                <servlet-rule>
                                    <enabled>true</enabled>
                                    <priority>0</priority>
                                    <class-name filter-type="EQUALS" filter-value="org.apache.axis.transport.http.AxisServlet"/>
                                </servlet-rule>
                            </exclude>
                            <exclude name="Apache Axis2 Admin Servlet">
                                <servlet-rule>
                                    <enabled>true</enabled>
                                    <priority>0</priority>
                                    <class-name filter-type="EQUALS" filter-value="org.apache.axis2.transport.http.AxisAdminServlet"/>
                                </servlet-rule>
                            </exclude>
                            <exclude name="Apache Axis2 Servlet">
                                <servlet-rule>
                                    <enabled>true</enabled>
                                    <priority>0</priority>
                                    <class-name filter-type="EQUALS" filter-value="org.apache.axis2.transport.http.AxisServlet"/>
                                </servlet-rule>
                            </exclude>
                            <exclude name="CometD Annotation Servlet">
                                <servlet-rule>
                                    <enabled>true</enabled>
                                    <priority>0</priority>
                                    <class-name filter-type="EQUALS" filter-value="org.cometd.annotation.AnnotationCometdServlet"/>
                                </servlet-rule>
                            </exclude>
                            <exclude name="CometD Servlet">
                                <servlet-rule>
                                    <enabled>true</enabled>
                                    <priority>0</priority>
                                    <class-name filter-type="EQUALS" filter-value="org.cometd.server.CometdServlet"/>
                                </servlet-rule>
                            </exclude>
                            <exclude name="JAX WS RI Dispatcher Servlet">
                                <servlet-rule>
                                    <enabled>true</enabled>
                                    <priority>0</priority>
                                    <class-name filter-type="EQUALS" filter-value="com.sun.xml.ws.transport.http.servlet.WSServlet"/>
                                </servlet-rule>
                            </exclude>
                            <exclude name="JBoss web-services servlet">
                                <servlet-rule>
                                    <enabled>true</enabled>
                                    <priority>0</priority>
                                    <class-name filter-type="EQUALS" filter-value="org.jboss.wsf.stack.jbws.EndpointServlet"/>
                                </servlet-rule>
                            </exclude>
                            <exclude name="Spring WS - Base servlet for Spring's web framework">
                                <servlet-rule>
                                    <enabled>true</enabled>
                                    <priority>0</priority>
                                    <class-name filter-type="EQUALS" filter-value="org.springframework.web.servlet.FrameworkServlet"/>
                                </servlet-rule>
                            </exclude>
                            <exclude name="Spring WS - dispatching of Web service messages">
                                <servlet-rule>
                                    <enabled>true</enabled>
                                    <priority>0</priority>
                                    <class-name filter-type="EQUALS" filter-value="org.springframework.ws.transport.http.MessageDispatcherServlet"/>
                                </servlet-rule>
                            </exclude>
                            <exclude name="Struts Action Servlet">
                                <servlet-rule>
                                    <enabled>true</enabled>
                                    <priority>0</priority>
                                    <class-name filter-type="EQUALS" filter-value="org.apache.struts.action.ActionServlet"/>
                                </servlet-rule>
                            </exclude>
                            <exclude name="Weblogic JAX RPC Servlets">
                                <servlet-rule>
                                    <enabled>true</enabled>
                                    <priority>0</priority>
                                    <class-name filter-type="STARTSWITH" filter-value="weblogic.wsee.server.servlet."/>
                                </servlet-rule>
                            </exclude>
                            <exclude name="Weblogic JAX WS Servlet">
                                <servlet-rule>
                                    <enabled>true</enabled>
                                    <priority>0</priority>
                                    <class-name filter-type="EQUALS" filter-value="weblogic.wsee.jaxws.JAXWSWebAppServlet"/>
                                </servlet-rule>
                            </exclude>
                            <exclude name="Weblogic JAX WS Webservice Servlet">
                                <servlet-rule>
                                    <enabled>true</enabled>
                                    <priority>0</priority>
                                    <class-name filter-type="EQUALS" filter-value="weblogic.wsee.jaxws.JAXWSServlet"/>
                                </servlet-rule>
                            </exclude>
                            <exclude name="Websphere web-services axis Servlet">
                                <servlet-rule>
                                    <enabled>true</enabled>
                                    <priority>0</priority>
                                    <class-name filter-type="EQUALS" filter-value="com.ibm.ws.websvcs.transport.http.WASAxis2Servlet"/>
                                </servlet-rule>
                            </exclude>
                            <exclude name="Websphere web-services Servlet">
                                <servlet-rule>
                                    <enabled>true</enabled>
                                    <priority>0</priority>
                                    <class-name filter-type="EQUALS" filter-value="com.ibm.ws.webservices.engine.transport.http.WebServicesServlet"/>
                                </servlet-rule>
                            </exclude>
                            <exclude name="XFire web-services servlet">
                                <servlet-rule>
                                    <enabled>true</enabled>
                                    <priority>0</priority>
                                    <class-name filter-type="EQUALS" filter-value="org.codehaus.xfire.transport.http.XFireConfigurableServlet"/>
                                </servlet-rule>
                            </exclude>
                        </excludes>
                        <naming-config scheme="URI">
                            <name-values>
                                <name-value>
                                    <name>uri-length</name>
                                    <value>first-n-segments</value>
                                </name-value>
                                <name-value>
                                    <name>segment-length</name>
                                    <value>2</value>
                                </name-value>
                            </name-values>
                        </naming-config>
                    </discovery-config>
                </configuration>
 * 
 */