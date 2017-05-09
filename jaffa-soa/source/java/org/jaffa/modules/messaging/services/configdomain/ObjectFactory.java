//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.3 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.09.29 at 04:28:25 PM PDT 
//


package org.jaffa.modules.messaging.services.configdomain;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.jaffa.modules.messaging.services.configdomain package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.jaffa.modules.messaging.services.configdomain
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MessageFilter }
     * 
     */
    public MessageFilter createMessageFilter() {
        return new MessageFilter();
    }

    /**
     * Create an instance of {@link TopicInfo }
     * 
     */
    public TopicInfo createTopicInfo() {
        return new TopicInfo();
    }

    /**
     * Create an instance of {@link Param }
     * 
     */
    public Param createParam() {
        return new Param();
    }

    /**
     * Create an instance of {@link Security }
     * 
     */
    public Security createSecurity() {
        return new Security();
    }

    /**
     * Create an instance of {@link JndiContext }
     * 
     */
    public JndiContext createJndiContext() {
        return new JndiContext();
    }

    /**
     * Create an instance of {@link DisplayParam }
     * 
     */
    public DisplayParam createDisplayParam() {
        return new DisplayParam();
    }

    /**
     * Create an instance of {@link QueueInfo }
     * 
     */
    public QueueInfo createQueueInfo() {
        return new QueueInfo();
    }

    /**
     * Create an instance of {@link JmsConfig }
     * 
     */
    public JmsConfig createJmsConfig() {
        return new JmsConfig();
    }

    /**
     * Create an instance of {@link Config }
     * 
     */
    public Config createConfig() {
        return new Config();
    }

    /**
     * Create an instance of {@link Filter }
     * 
     */
    public Filter createFilter() {
        return new Filter();
    }

    /**
     * Create an instance of {@link Header }
     * 
     */
    public Header createHeader() {
        return new Header();
    }

    /**
     * Create an instance of {@link MessageInfo }
     * 
     */
    public MessageInfo createMessageInfo() {
        return new MessageInfo();
    }

    /**
     * Create an instance of {@link LockCheck }
     * 
     */
    public LockCheck createLockCheck() {
        return new LockCheck();
    }
}