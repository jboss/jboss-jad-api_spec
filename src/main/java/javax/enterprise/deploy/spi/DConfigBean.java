package javax.enterprise.deploy.spi;

import java.beans.PropertyChangeListener;

import javax.enterprise.deploy.model.DDBean;
import javax.enterprise.deploy.model.XpathEvent;
import javax.enterprise.deploy.spi.exceptions.BeanNotFoundException;
import javax.enterprise.deploy.spi.exceptions.ConfigurationException;

/**
 * A configuration associated with one or more deployment descriptors.
 *
 * @author <a href="mailto:adrian@jboss.org">Adrian Brock</a>
 * @version $Revision$
 */
public interface DConfigBean
{
   // Constants -----------------------------------------------------
   
   // Public --------------------------------------------------------
   
   /**
    * Get the XML text for this configuration
    *
    * @return the xml text
    */
   DDBean getDDBean();
   
   /**
    * Get the xpaths this deployment descriptor requires
    *
    * @return the xpaths
    */
   String[] getXpaths();
   
   /**
    * Return the JavaBean containing server specific deployment information
    *
    * @param bean the xml data to be evaluated
    * @return the server specific configuration 
    * @throws ConfigurationException for errors generating the configuring bean
    */
   DConfigBean getDConfigBean(DDBean bean) throws ConfigurationException;
   
   /**
    * Remove a child
    *
    * @param bean the child
    * @throws BeanNotFoundException when the bean is not found
    */
   void removeDConfigBean(DConfigBean bean) throws BeanNotFoundException;
   
   /**
    * A notification that the DDBean provided has changed and that this bean or
    * child needs re-evaluating
    *
    * @param event the event
    */
   void notifyDDChange(XpathEvent event);
   
   /**
    * Add a property change listener
    *
    * @param listener the listener
    */
   void addPropertyChangeListener(PropertyChangeListener listener);
   
   /**
    * Remove a property change listener
    *
    * @param listener the listener
    */
   void removePropertyChangeListener(PropertyChangeListener listener);
}
