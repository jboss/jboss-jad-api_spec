package javax.enterprise.deploy.model;

import javax.enterprise.deploy.shared.ModuleType;

/**
 * A deployable object for an ear
 * 
 * @author <a href="mailto:adrian@jboss.org">Adrian Brock</a>
 * @version $Revision$
 */
public interface J2eeApplicationObject extends DeployableObject
{
   // Constants -----------------------------------------------------
   
   // Public --------------------------------------------------------

   /**
    * Retrieve a deployable object
    *
    * @param uri describes where to get the deployable object
    * @return the deployable object or null if there is no such object
    */
   DeployableObject getDeployableObject(String uri);

   /**
    * Get all deployable objects in this application of the given module type
    *
    * @param type the module type
    * @return the deployable objects or null if there are no such objects
    */
   DeployableObject[] getDeployableObjects(ModuleType type);
   
   /**
    * Get all deployable objects in this application
    *
    * @return the deployable objects or null are no such objects
    */
   DeployableObject[] getDeployableObjects();
   
   /**
    * Return the list of module uris for a give module type
    *
    * @param type the module type
    * @return the uris or null if there are none
    */
   String[] getModuleUris(ModuleType type);
   
   /**
    * Return the list of module uris
    *
    * @return the uris or null if there are none
    */
   String[] getModuleUris();
   
   /**
    * Get the child elements with the specified xpath
    *
    * @param xpath the xpath of the children
    * @return an array of children or null if there are none
    */
   DDBean[] getChildBean(ModuleType type, String xpath);
   
   /**
    * Get the text for the given xpath
    *
    * @param xpath the xpath
    * @return an array of Strings for the xpath or null if there are none
    */
   String[] getText(ModuleType type, String xpath);
   
   /**
    * Register a listener for a given xpath
    *
    * @param xpath the xpath
    * @param xpl the listener
    */
   void addXpathListener(ModuleType type, String xpath, XpathListener xpl);
   
   /**
    * Unregister a listener for a given xpath
    *
    * @param xpath the xpath
    * @param xpl the listener
    */
   void removeXpathListener(ModuleType type, String xpath, XpathListener xpl);
}
