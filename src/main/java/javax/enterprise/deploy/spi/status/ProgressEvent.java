package javax.enterprise.deploy.spi.status;

import java.util.EventObject;
import java.io.ObjectStreamField;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.enterprise.deploy.spi.TargetModuleID;

import org.jboss.util.id.SerialVersion;

/**
 * An event describing the progress of a deployment
 */
public class ProgressEvent extends EventObject
{
   /** @since 4.0.2 */
   static final long serialVersionUID;

   // Constants -----------------------------------------------------
   /**
    * These field names match the j2ee 1.4.1 ri version names
    */
   private static final ObjectStreamField[] serialPersistentFields;
   private static final int STATUS_IDX = 0;
   private static final int MODULE_ID_IDX = 1;

   static
   {
      if (SerialVersion.version == SerialVersion.LEGACY)
      {
         serialVersionUID = 3097551795061550569L;
         serialPersistentFields = new ObjectStreamField[] {
         /** @serialField statuscode DeploymentStatus current deployment status */
         new ObjectStreamField("status", DeploymentStatus.class),
         /** @serialField targetModuleID TargetModuleID id of the event target */
         new ObjectStreamField("moduleID", TargetModuleID.class)
         };
      }
      else
      {
         // j2ee 1.4.1 RI values
         serialVersionUID = 7815118532096485937L;
         serialPersistentFields = new ObjectStreamField[] {
         /** @serialField statuscode DeploymentStatus current deployment status */
         new ObjectStreamField("statuscode", DeploymentStatus.class),
         /** @serialField targetModuleID TargetModuleID id of the event target */
         new ObjectStreamField("targetModuleID", TargetModuleID.class)
         };         
      }
   }

   // Attributes ----------------------------------------------------
   
   /** The deployment status */
   private DeploymentStatus status;
   /** The module id */
   private TargetModuleID moduleID;
   
   // Static --------------------------------------------------------
   
   // Constructors --------------------------------------------------
   
   /**
    * Create a new progress event
    *
    * @param source the source
    * @param status the deployment status
    * @param moduleID the module id
    */
   public ProgressEvent(Object source, TargetModuleID moduleID, DeploymentStatus status)
   {
      super(source);
      this.status = status;
      this.moduleID = moduleID;
   }
   
   // Public --------------------------------------------------------

   /**
    * Get the target module id
    *
    * @return the module id
    */
   public TargetModuleID getTargetModuleID()
   {
      return moduleID;
   }

   /**
    * Get the deployment status
    *
    * @return the deployment status
    */
   public DeploymentStatus getDeploymentStatus()
   {
      return status;
   }
   
   // Package protected ---------------------------------------------
   
   // Protected -----------------------------------------------------
   
   // Private -------------------------------------------------------
   private void readObject(ObjectInputStream ois)
      throws ClassNotFoundException, IOException
   {
      ObjectInputStream.GetField fields = ois.readFields();
      String name = serialPersistentFields[STATUS_IDX].getName();
      this.status = (DeploymentStatus) fields.get(name, null);
      name = serialPersistentFields[MODULE_ID_IDX].getName();
      this.moduleID = (TargetModuleID) fields.get(name, null);
   }

   private void writeObject(ObjectOutputStream oos)
      throws IOException
   {
      // Write j2ee 1.4.1 RI field names
      ObjectOutputStream.PutField fields =  oos.putFields();
      String name = serialPersistentFields[STATUS_IDX].getName();
      fields.put(name, status);
      name = serialPersistentFields[MODULE_ID_IDX].getName();
      fields.put(name, moduleID);
      oos.writeFields();
   }

   // Inner classes -------------------------------------------------
}
