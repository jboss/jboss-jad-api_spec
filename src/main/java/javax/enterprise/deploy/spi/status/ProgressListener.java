package javax.enterprise.deploy.spi.status;

import java.util.EventListener;

/**
 * A listener for progress events.
 *
 * @author <a href="mailto:adrian@jboss.org">Adrian Brock</a>
 * @version $Revision$
 */
public interface ProgressListener extends EventListener
{
   // Constants -----------------------------------------------------
   
   // Public --------------------------------------------------------
   
   /**
    * Fired when a progress event occurs
    *
    * @param event the progress event
    */
   void handleProgressEvent(ProgressEvent event);
}
