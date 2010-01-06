 /*
 * Generated by XDoclet - Do not edit!
 * this class was prodiuced by xdoclet automagically...
 */
package com.amalto.core.objects.synchronization.ejb.remote;

import java.util.*;

/**
 * This class is remote adapter to SynchronizationPlanCtrl. It provides convenient way to access
 * facade session bean. Inverit from this class to provide reasonable caching and event handling capabilities.
 *
 * Remote facade for SynchronizationPlanCtrl.
 * @xdoclet-generated
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version ${version}
 */

public class SynchronizationPlanCtrlRemote extends Observable
{
    static SynchronizationPlanCtrlRemote _instance = null;
    public static SynchronizationPlanCtrlRemote getInstance() {
        if(_instance == null) {
	   _instance = new SynchronizationPlanCtrlRemote();
	}
	return _instance;
    }

  /**
   * cached remote session interface
   */
  com.amalto.core.objects.synchronization.ejb.remote.SynchronizationPlanCtrl _session = null;
  /**
   * return session bean remote interface
   */
   protected com.amalto.core.objects.synchronization.ejb.remote.SynchronizationPlanCtrl getSession() {
      try {
   	if(_session == null) {
	   _session = com.amalto.core.objects.synchronization.ejb.local.SynchronizationPlanCtrlUtil.getHome().create();
	}
	return _session;
      } catch(Exception ex) {
        // just catch it here and return null.
        // somebody can provide better solution
	ex.printStackTrace();
	return null;
      }
   }

   public com.amalto.core.objects.synchronization.ejb.SynchronizationPlanPOJOPK putSynchronizationPlan ( com.amalto.core.objects.synchronization.ejb.SynchronizationPlanPOJO synchronizationPlan )
	  throws com.amalto.core.util.XtentisException, java.rmi.RemoteException
   {
        com.amalto.core.objects.synchronization.ejb.SynchronizationPlanPOJOPK retval;
       retval =  getSession().putSynchronizationPlan( synchronizationPlan );

      return retval;

   }

   public com.amalto.core.objects.synchronization.ejb.SynchronizationPlanPOJOPK putSynchronizationPlan ( java.lang.String revisionID,com.amalto.core.objects.synchronization.ejb.SynchronizationPlanPOJO synchronizationPlan )
	  throws com.amalto.core.util.XtentisException, java.rmi.RemoteException
   {
        com.amalto.core.objects.synchronization.ejb.SynchronizationPlanPOJOPK retval;
       retval =  getSession().putSynchronizationPlan( revisionID,synchronizationPlan );

      return retval;

   }

   public com.amalto.core.objects.synchronization.ejb.SynchronizationPlanPOJO getSynchronizationPlan ( com.amalto.core.objects.synchronization.ejb.SynchronizationPlanPOJOPK pk )
	  throws com.amalto.core.util.XtentisException, java.rmi.RemoteException
   {
        com.amalto.core.objects.synchronization.ejb.SynchronizationPlanPOJO retval;
       retval =  getSession().getSynchronizationPlan( pk );

      return retval;

   }

   public com.amalto.core.objects.synchronization.ejb.SynchronizationPlanPOJO getSynchronizationPlan ( java.lang.String revisionID,com.amalto.core.objects.synchronization.ejb.SynchronizationPlanPOJOPK pk )
	  throws com.amalto.core.util.XtentisException, java.rmi.RemoteException
   {
        com.amalto.core.objects.synchronization.ejb.SynchronizationPlanPOJO retval;
       retval =  getSession().getSynchronizationPlan( revisionID,pk );

      return retval;

   }

   public com.amalto.core.objects.synchronization.ejb.SynchronizationPlanPOJO existsSynchronizationPlan ( com.amalto.core.objects.synchronization.ejb.SynchronizationPlanPOJOPK pk )
	  throws com.amalto.core.util.XtentisException, java.rmi.RemoteException
   {
        com.amalto.core.objects.synchronization.ejb.SynchronizationPlanPOJO retval;
       retval =  getSession().existsSynchronizationPlan( pk );

      return retval;

   }

   public com.amalto.core.objects.synchronization.ejb.SynchronizationPlanPOJOPK removeSynchronizationPlan ( com.amalto.core.objects.synchronization.ejb.SynchronizationPlanPOJOPK pk )
	  throws com.amalto.core.util.XtentisException, java.rmi.RemoteException
   {
        com.amalto.core.objects.synchronization.ejb.SynchronizationPlanPOJOPK retval;
       retval =  getSession().removeSynchronizationPlan( pk );

      return retval;

   }

   public java.util.Collection getSynchronizationPlanPKs ( java.lang.String regex )
	  throws com.amalto.core.util.XtentisException, java.rmi.RemoteException
   {
        java.util.Collection retval;
       retval =  getSession().getSynchronizationPlanPKs( regex );

      return retval;

   }

   public java.util.ArrayList synchronizationGetAllUnsynchronizedObjectsIDs ( java.lang.String revisionID,java.lang.String objectName,java.lang.String instancePattern,java.lang.String synchronizationPlanName )
	  throws com.amalto.core.util.XtentisException, java.rmi.RemoteException
   {
        java.util.ArrayList retval;
       retval =  getSession().synchronizationGetAllUnsynchronizedObjectsIDs( revisionID,objectName,instancePattern,synchronizationPlanName );

      return retval;

   }

   public java.lang.String synchronizationGetMarshaledObject ( java.lang.String revisionID,java.lang.String objectName,java.lang.String uniqueID )
	  throws com.amalto.core.util.XtentisException, java.rmi.RemoteException
   {
        java.lang.String retval;
       retval =  getSession().synchronizationGetMarshaledObject( revisionID,objectName,uniqueID );

      return retval;

   }

   public void synchronizationPutMarshaledObject ( java.lang.String revisionID,java.lang.String objectName,java.lang.String uniqueID,java.lang.String xml )
	  throws com.amalto.core.util.XtentisException, java.rmi.RemoteException
   {
      getSession().synchronizationPutMarshaledObject( revisionID,objectName,uniqueID,xml );

   }

   public java.util.ArrayList synchronizationGetAllUnsynchronizedItemPOJOPKs ( java.lang.String revisionID,com.amalto.core.objects.datacluster.ejb.DataClusterPOJOPK dataClusterPOJOPK,java.lang.String conceptPattern,java.lang.String instancePattern,com.amalto.core.objects.synchronization.ejb.SynchronizationPlanPOJOPK synchronizationPlanPOJOPK,long start,int limit )
	  throws com.amalto.core.util.XtentisException, java.rmi.RemoteException
   {
        java.util.ArrayList retval;
       retval =  getSession().synchronizationGetAllUnsynchronizedItemPOJOPKs( revisionID,dataClusterPOJOPK,conceptPattern,instancePattern,synchronizationPlanPOJOPK,start,limit );

      return retval;

   }

   public java.lang.String synchronizationGetMarshaledItem ( java.lang.String revisionID,com.amalto.core.ejb.ItemPOJOPK itemPOJOPK )
	  throws com.amalto.core.util.XtentisException, java.rmi.RemoteException
   {
        java.lang.String retval;
       retval =  getSession().synchronizationGetMarshaledItem( revisionID,itemPOJOPK );

      return retval;

   }

   public com.amalto.core.ejb.ItemPOJOPK synchronizationPutMarshaledItem ( java.lang.String revisionID,java.lang.String xml )
	  throws com.amalto.core.util.XtentisException, java.rmi.RemoteException
   {
        com.amalto.core.ejb.ItemPOJOPK retval;
       retval =  getSession().synchronizationPutMarshaledItem( revisionID,xml );

      return retval;

   }

   public java.lang.String[] action ( int action,com.amalto.core.objects.synchronization.ejb.SynchronizationPlanPOJOPK pk )
	  throws com.amalto.core.util.XtentisException, java.rmi.RemoteException
   {
        java.lang.String[] retval;
       retval =  getSession().action( action,pk );

      return retval;

   }

  /**
   * override this method to provide feedback to interested objects
   * in case collections were changed.
   */
  public void invalidate() {

  	setChanged();
	notifyObservers();
  }
}
