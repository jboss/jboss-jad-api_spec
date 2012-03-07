package javax.enterprise.deploy.spi.status;

import javax.enterprise.deploy.spi.TargetModuleID;
import javax.enterprise.deploy.spi.exceptions.OperationUnsupportedException;

/**
 * Tracks the progress of a deployment
 *
 * @author <a href="mailto:adrian@jboss.org">Adrian Brock</a>
 * @version $Revision$
 */
public interface ProgressObject
{
   // Constants -----------------------------------------------------
   
   // Public --------------------------------------------------------
   
   /**
    * Retrieve the status of the deployment
    *
    * @return the status
    */
   DeploymentStatus getDeploymentStatus();
   
   /**
    * Retrieve the resulting target module ids
    *
    * @return the module ids
    */
   TargetModuleID[] getResultTargetModuleIDs();
   
   /**
    * Return the client configuration associated with the module
    *
    * @param id the module id
    * @return the client configuration or null if none exists
    */
   ClientConfiguration getClientConfiguration(TargetModuleID id);
   
   /**
    * Is cancel supported
    *
    * @return true when cancel is supported, false otherwise
    */
   boolean isCancelSupported();
   
   /**
    * Cancels the deployment
    *
    * @throws OperationUnsupportedException when cancel is not supported
    */
   void cancel() throws OperationUnsupportedException;
   
   /**
    * Is stop supported
    *
    * @return true when stop is supported, false otherwise
    */
   boolean isStopSupported();
   
   /**
    * Stops the deployment
    *
    * @throws OperationUnsupportedException when stop is not supported
    */
   void stop() throws OperationUnsupportedException;
   
   /**
    * Add a progress listener
    *
    * @param listener the listener
    */
   void addProgressListener(ProgressListener listener);
   
   /**
    * Remove a progress listener
    *
    * @param listener the listener
    */
   void removeProgressListener(ProgressListener listener);
}
