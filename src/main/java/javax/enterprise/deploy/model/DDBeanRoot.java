package javax.enterprise.deploy.model;

import javax.enterprise.deploy.shared.ModuleType;

/**
 * The root of a DDBean tree (a standard deployment descriptor)
 *
 * @author <a href="mailto:adrian@jboss.org">Adrian Brock</a>
 * @version $Revision$
 */
public interface DDBeanRoot extends DDBean
{
   // Constants -----------------------------------------------------
   
   // Public --------------------------------------------------------

   /**
    * Return the module type of this descriptor
    *
    * @return the module type
    */
   ModuleType getType();
   
   /**
    * Get the deployable object for this descriptor
    *
    * @return the deployable object 
    */
   DeployableObject getDeployableObject();
   
   /**
    * A convenience method for information on the deployable object
    * 
    * @deprecated use getDDBeanRootVersion
    * @return the dtd version
    */
   String getModuleDTDVersion();
   
   /**
    * Return the version number of the j2ee xml document
    *
    * @return the version
    */
   String getDDBeanRootVersion();
   
   /**
    * Returns the xpath, the root path is "/"
    *
    * @return the root path "/"
    */
   String getXpath();
   
   /**
    * Returns the filename relative to the root of the module this XML
    * instance document.
    *
    * @return The file name relative to the root of the module
    */
   String getFilename();
}
