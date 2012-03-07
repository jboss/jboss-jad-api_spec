package javax.enterprise.deploy.model;

/**
 * The listener interface for receiving xpath events.
 *
 * @author <a href="mailto:adrian@jboss.org">Adrian Brock</a>
 * @version $Revision$
 */
public interface XpathListener
{
   // Constants -----------------------------------------------------
   
   // Public --------------------------------------------------------

   /**
    * Invoked when an xpath event occurs
    *
    * @param xpe the xpath event
    */
   void fireXpathEvent(XpathEvent xpe);
}
