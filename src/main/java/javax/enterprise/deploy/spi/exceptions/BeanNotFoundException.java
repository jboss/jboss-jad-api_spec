package javax.enterprise.deploy.spi.exceptions;

/**
 * Errors when a bean is not found
 */
public class BeanNotFoundException extends Exception
{
   // Constants -----------------------------------------------------
   
   // Attributes ----------------------------------------------------
   
   // Static --------------------------------------------------------
   
   // Constructors --------------------------------------------------
   
   /**
	 * Create an exception with a reason.
	 * 
	 * @param reason the reason
	 */
   public BeanNotFoundException(String reason)
   {
      super(reason);
   }
   
   // Public --------------------------------------------------------
   
   // Package protected ---------------------------------------------
   
   // Protected -----------------------------------------------------
   
   // Private -------------------------------------------------------
   
   // Inner classes -------------------------------------------------
}
