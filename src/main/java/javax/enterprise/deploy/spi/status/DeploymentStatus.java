package javax.enterprise.deploy.spi.status;

import javax.enterprise.deploy.shared.ActionType;
import javax.enterprise.deploy.shared.CommandType;
import javax.enterprise.deploy.shared.StateType;

/**
 * The status of the deployment.
 *
 * @author <a href="mailto:adrian@jboss.org">Adrian Brock</a>
 * @version $Revision$
 */
public interface DeploymentStatus
{
   // Constants -----------------------------------------------------
   
   // Public --------------------------------------------------------
   
   /**
    * Get the state of the deployment
    *
    * @return the state
    */
   StateType getState();
   
   /**
    * The deployment command
    *
    * @return the command
    */
   CommandType getCommand();
   
   /**
    * The action of this deployment
    *
    * @return the action
    */
   ActionType getAction();
   
   /**
    * Get the message
    *
    * @return the message
    */
   String getMessage();
   
   /**
    * Is the deployment complete
    *
    * @return true when complete, false otherwise
    */
   boolean isCompleted();
   
   /**
    * Has the deployment failed
    *
    * @return true when failed, false otherwise
    */
   boolean isFailed();
   
   /**
    * Is the deployment in progress
    *
    * @return true when in progress, false otherwise
    */
   boolean isRunning();
}
