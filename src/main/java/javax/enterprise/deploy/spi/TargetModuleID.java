package javax.enterprise.deploy.spi;

/**
 * A module deployed to a target.
 *
 * @author <a href="mailto:adrian@jboss.org">Adrian Brock</a>
 * @version $Revision$
 */
public interface TargetModuleID
{
   // Constants -----------------------------------------------------
   
   // Public --------------------------------------------------------
   
   /**
    * Get the target
    *
    * @return the target
    */
   Target getTarget();
   
   /**
    * Get the module id
    *
    * @return the id
    */
   String getModuleID();
   
   /**
    * The URL for a web module
    *
    * @return the url
    */
   String getWebURL();

   /**
    * Return the identifier of this module 
    *
    * @return the identifier
    */
   String toString();
   
   /**
    * The parent of this module
    *
    * @return the parent or null if there is no parent
    */
   TargetModuleID getParentTargetModuleID();
   
   /**
    * Get the child modules
    *
    * @return an array of child modules or null if there are no children
    */
   TargetModuleID[] getChildTargetModuleID();
}
