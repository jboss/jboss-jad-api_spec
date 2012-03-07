package javax.enterprise.deploy.spi.exceptions;

/**
 * Errors while generating a configuration bean
 */
public class ConfigurationException extends Exception
{
   // Constants -----------------------------------------------------
   
   // Attributes ----------------------------------------------------
   
   // Static --------------------------------------------------------
   
   // Constructors --------------------------------------------------
   
   /**
	 * Create an exception with a null reason.
	 */
   public ConfigurationException()
   {
      super();
   }

   /**
	 * Create an exception with a reason.
	 * 
	 * @param reason the reason
	 */
   public ConfigurationException(String reason)
   {
      super(reason);
   }
   
   // Public --------------------------------------------------------
   
   // Package protected ---------------------------------------------
   
   // Protected -----------------------------------------------------
   
   // Private -------------------------------------------------------
   
   // Inner classes -------------------------------------------------
}
