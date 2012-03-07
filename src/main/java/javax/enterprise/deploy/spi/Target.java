package javax.enterprise.deploy.spi;

/**
 * A single logical server.
 *
 * @author <a href="mailto:adrian@jboss.org">Adrian Brock</a>
 * @version $Revision$
 */
public interface Target
{
   // Constants -----------------------------------------------------
   
   // Public --------------------------------------------------------
   
   /**
    * Get the target's name
    *
    * @return the name
    */
   String getName();
   
   /**
    * Get the target's description
    *
    * @return the description
    */
   String getDescription();

}
