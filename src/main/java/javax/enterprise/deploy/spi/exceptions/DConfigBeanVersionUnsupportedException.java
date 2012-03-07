package javax.enterprise.deploy.spi.exceptions;

/**
 * Errors when a j2ee version is not supported
 */
public class DConfigBeanVersionUnsupportedException extends Exception
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
   public DConfigBeanVersionUnsupportedException(String reason)
   {
      super(reason);
   }
   
   // Public --------------------------------------------------------
   
   // Package protected ---------------------------------------------
   
   // Protected -----------------------------------------------------
   
   // Private -------------------------------------------------------
   
   // Inner classes -------------------------------------------------
}
