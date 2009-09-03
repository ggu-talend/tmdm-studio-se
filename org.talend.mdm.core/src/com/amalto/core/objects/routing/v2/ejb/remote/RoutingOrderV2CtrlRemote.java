 /*
 * Generated by XDoclet - Do not edit!
 * this class was prodiuced by xdoclet automagically...
 */
package com.amalto.core.objects.routing.v2.ejb.remote;

import java.util.*;

/**
 * This class is remote adapter to RoutingOrderV2Ctrl. It provides convenient way to access
 * facade session bean. Inverit from this class to provide reasonable caching and event handling capabilities.
 *
 * Remote facade for RoutingOrderV2Ctrl.
 * @xdoclet-generated at 3-09-09
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version ${version}
 */

public class RoutingOrderV2CtrlRemote extends Observable
{
    static RoutingOrderV2CtrlRemote _instance = null;
    public static RoutingOrderV2CtrlRemote getInstance() {
        if(_instance == null) {
	   _instance = new RoutingOrderV2CtrlRemote();
	}
	return _instance;
    }

  /**
   * cached remote session interface
   */
  com.amalto.core.objects.routing.v2.ejb.remote.RoutingOrderV2Ctrl _session = null;
  /**
   * return session bean remote interface
   */
   protected com.amalto.core.objects.routing.v2.ejb.remote.RoutingOrderV2Ctrl getSession() {
      try {
   	if(_session == null) {
	   _session = com.amalto.core.objects.routing.v2.ejb.local.RoutingOrderV2CtrlUtil.getHome().create();
	}
	return _session;
      } catch(Exception ex) {
        // just catch it here and return null.
        // somebody can provide better solution
	ex.printStackTrace();
	return null;
      }
   }

   public void executeASynchronously ( com.amalto.core.objects.routing.v2.ejb.AbstractRoutingOrderV2POJO routingOrderPOJO )
	  throws com.amalto.core.util.XtentisException, java.rmi.RemoteException
   {
      getSession().executeASynchronously( routingOrderPOJO );

   }

   public java.lang.String executeSynchronously ( com.amalto.core.objects.routing.v2.ejb.AbstractRoutingOrderV2POJO routingOrderPOJO )
	  throws com.amalto.core.util.XtentisException, java.rmi.RemoteException
   {
        java.lang.String retval;
       retval =  getSession().executeSynchronously( routingOrderPOJO );

      return retval;

   }

   public java.lang.String executeSynchronously ( com.amalto.core.objects.routing.v2.ejb.AbstractRoutingOrderV2POJO routingOrderPOJO,boolean cleanUpRoutingOrder )
	  throws com.amalto.core.util.XtentisException, java.rmi.RemoteException
   {
        java.lang.String retval;
       retval =  getSession().executeSynchronously( routingOrderPOJO,cleanUpRoutingOrder );

      return retval;

   }

   public void executeAsynchronously ( com.amalto.core.objects.routing.v2.ejb.AbstractRoutingOrderV2POJO routingOrderPOJO,long delayInMillis )
	  throws com.amalto.core.util.XtentisException, java.rmi.RemoteException
   {
      getSession().executeAsynchronously( routingOrderPOJO,delayInMillis );

   }

   public void executeAsynchronously ( com.amalto.core.objects.routing.v2.ejb.AbstractRoutingOrderV2POJO routingOrderPOJO )
	  throws com.amalto.core.util.XtentisException, java.rmi.RemoteException
   {
      getSession().executeAsynchronously( routingOrderPOJO );

   }

   public com.amalto.core.objects.routing.v2.ejb.AbstractRoutingOrderV2POJOPK removeRoutingOrder ( com.amalto.core.objects.routing.v2.ejb.AbstractRoutingOrderV2POJOPK pk )
	  throws com.amalto.core.util.XtentisException, java.rmi.RemoteException
   {
        com.amalto.core.objects.routing.v2.ejb.AbstractRoutingOrderV2POJOPK retval;
       retval =  getSession().removeRoutingOrder( pk );

      return retval;

   }

   public com.amalto.core.objects.routing.v2.ejb.AbstractRoutingOrderV2POJOPK putRoutingOrder ( com.amalto.core.objects.routing.v2.ejb.AbstractRoutingOrderV2POJO routingOrderPOJO )
	  throws com.amalto.core.util.XtentisException, java.rmi.RemoteException
   {
        com.amalto.core.objects.routing.v2.ejb.AbstractRoutingOrderV2POJOPK retval;
       retval =  getSession().putRoutingOrder( routingOrderPOJO );

      return retval;

   }

   public com.amalto.core.objects.routing.v2.ejb.AbstractRoutingOrderV2POJO getRoutingOrder ( com.amalto.core.objects.routing.v2.ejb.AbstractRoutingOrderV2POJOPK pk )
	  throws com.amalto.core.util.XtentisException, java.rmi.RemoteException
   {
        com.amalto.core.objects.routing.v2.ejb.AbstractRoutingOrderV2POJO retval;
       retval =  getSession().getRoutingOrder( pk );

      return retval;

   }

   public com.amalto.core.objects.routing.v2.ejb.AbstractRoutingOrderV2POJO existsRoutingOrder ( com.amalto.core.objects.routing.v2.ejb.AbstractRoutingOrderV2POJOPK pk )
	  throws com.amalto.core.util.XtentisException, java.rmi.RemoteException
   {
        com.amalto.core.objects.routing.v2.ejb.AbstractRoutingOrderV2POJO retval;
       retval =  getSession().existsRoutingOrder( pk );

      return retval;

   }

   public com.amalto.core.objects.routing.v2.ejb.ActiveRoutingOrderV2POJO[] findActiveRoutingOrders ( long lastScheduledTime,int maxRoutingOrders )
	  throws com.amalto.core.util.XtentisException, java.rmi.RemoteException
   {
        com.amalto.core.objects.routing.v2.ejb.ActiveRoutingOrderV2POJO[] retval;
       retval =  getSession().findActiveRoutingOrders( lastScheduledTime,maxRoutingOrders );

      return retval;

   }

   public com.amalto.core.objects.routing.v2.ejb.ActiveRoutingOrderV2POJO[] findDeadRoutingOrders ( long maxLastRunStartedTime,int maxRoutingOrders )
	  throws com.amalto.core.util.XtentisException, java.rmi.RemoteException
   {
        com.amalto.core.objects.routing.v2.ejb.ActiveRoutingOrderV2POJO[] retval;
       retval =  getSession().findDeadRoutingOrders( maxLastRunStartedTime,maxRoutingOrders );

      return retval;

   }

   public java.util.Collection getActiveRoutingOrderPKs ( java.lang.String regex )
	  throws com.amalto.core.util.XtentisException, java.rmi.RemoteException
   {
        java.util.Collection retval;
       retval =  getSession().getActiveRoutingOrderPKs( regex );

      return retval;

   }

   public java.util.Collection getCompletedRoutingOrderPKs ( java.lang.String regex )
	  throws com.amalto.core.util.XtentisException, java.rmi.RemoteException
   {
        java.util.Collection retval;
       retval =  getSession().getCompletedRoutingOrderPKs( regex );

      return retval;

   }

   public java.util.Collection getFailedRoutingOrderPKs ( java.lang.String regex )
	  throws com.amalto.core.util.XtentisException, java.rmi.RemoteException
   {
        java.util.Collection retval;
       retval =  getSession().getFailedRoutingOrderPKs( regex );

      return retval;

   }

   public java.util.Collection getAllRoutingOrderPKs ( java.lang.String regex )
	  throws com.amalto.core.util.XtentisException, java.rmi.RemoteException
   {
        java.util.Collection retval;
       retval =  getSession().getAllRoutingOrderPKs( regex );

      return retval;

   }

   public java.util.Collection getRoutingOrderPKsByCriteria ( java.lang.Class routingOrderV2POJOClass,java.lang.String anyFieldContains,java.lang.String name,long timeCreatedMin,long timeCreatedMax,long timeScheduledMin,long timeScheduledMax,long timeLastRunStartedMin,long timeLastRunStartedMax,long timeLastRunCompletedMin,long timeLastRunCompletedMax,java.lang.String itemConceptContains,java.lang.String itemIDsContain,java.lang.String serviceJNDIContains,java.lang.String serviceParametersContains,java.lang.String messageContains )
	  throws com.amalto.core.util.XtentisException, java.rmi.RemoteException
   {
        java.util.Collection retval;
       retval =  getSession().getRoutingOrderPKsByCriteria( routingOrderV2POJOClass,anyFieldContains,name,timeCreatedMin,timeCreatedMax,timeScheduledMin,timeScheduledMax,timeLastRunStartedMin,timeLastRunStartedMax,timeLastRunCompletedMin,timeLastRunCompletedMax,itemConceptContains,itemIDsContain,serviceJNDIContains,serviceParametersContains,messageContains );

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
