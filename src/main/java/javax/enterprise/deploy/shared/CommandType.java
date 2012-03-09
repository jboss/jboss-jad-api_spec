package javax.enterprise.deploy.shared;

/**
 * An enumeration of deployment commands.
 *
 * @author <a href="mailto:adrian@jboss.org">Adrian Brock</a>
 * @version $Revision$
 */
public class CommandType
{
   // Constants -----------------------------------------------------

   /** The DISTRIBUTE integer value */
   private static final int DISTRIBUTE_INT = 0;
   /** The START integer value */
   private static final int START_INT = 1;
   /** The STOP integer value */
   private static final int STOP_INT = 2;
   /** The UNDEPLOY integer value */
   private static final int UNDEPLOY_INT = 3;
   /** The REDEPLOY integer value */
   private static final int REDEPLOY_INT = 4;
   
   /** The command type for an DISTRIBUTE */
   public static final CommandType DISTRIBUTE = new CommandType(DISTRIBUTE_INT);
   /** The command type for an START */
   public static final CommandType START = new CommandType(START_INT);
   /** The command type for an STOP */
   public static final CommandType STOP = new CommandType(STOP_INT);
   /** The command type for an UNDEPLOY */
   public static final CommandType UNDEPLOY = new CommandType(UNDEPLOY_INT);
   /** The module type for an REDEPLOY */
   public static final CommandType REDEPLOY = new CommandType(REDEPLOY_INT);

   /** The command types */
   private static final CommandType[] commandTypes = new CommandType[]
   {
      DISTRIBUTE, START, STOP, UNDEPLOY, REDEPLOY                          
   };

   /** The command descriptions */
   private static final String[] commandDescs = new String[]
   {
      "Distribute",
      "Start", 
      "Stop", 
      "Undeploy",
      "Redeploy"                                      
   };
   
   // Attributes ----------------------------------------------------
   
   /** The value */
   private int value;
   
   /**
    * Create a new CommandType
    *
    * @param value the value
    */
   protected CommandType(int value)
   {
      this.value = value;
   }
   
   // Public --------------------------------------------------------
   
   /**
    * Get the value
    *
    * @return the value
    */
   public int getValue()
   {
      return value;
   }
   
   /**
    * Get the string table for class command type
    *
    * [todo] check this?
    * @return the string table
    */
   protected String[] getStringTable()
   {
      return commandDescs;
   }
   
   /**
    * Get the enumerated values for module type
    *
    * @return the string table
    */
   protected CommandType[] getEnumValueTable()
   {
      return commandTypes;
   }

   /**
    * Get the command type for an integer
    *
    * @param type the type
    * @return the command type
    */
   public static CommandType getCommandType(int type)
   {
      if (type >= commandTypes.length)
         return null;
      return commandTypes[type];
   }

   public String toString()
   {
      return commandDescs[value];
   }

   /**
    * Return the offset of the first element
    *
    * @return the offset
    */
   protected int getOffset()
   {
      return DISTRIBUTE_INT;
   }
   
}
