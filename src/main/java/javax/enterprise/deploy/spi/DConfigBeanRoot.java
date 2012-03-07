package javax.enterprise.deploy.spi;

import javax.enterprise.deploy.model.DDBeanRoot;

/**
 * The root of a configuration.
 *
 * @author <a href="mailto:adrian@jboss.org">Adrian Brock</a>
 * @version $Revision$
 */
public interface DConfigBeanRoot extends DConfigBean
{
   // Constants -----------------------------------------------------
   
   // Public --------------------------------------------------------
   
   /**
    * Return the configuration that is not the primary deployment descriptor
    *
    * @param beanRoot the root of the deployment descriptor
    * @return the configuration
    */
   DConfigBean getDConfigBean(DDBeanRoot beanRoot);
}
