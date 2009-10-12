 /*
 * Generated by XDoclet - Do not edit!
 * this class was prodiuced by xdoclet automagically...
 */
package com.amalto.core.objects.role.ejb.remote;

import java.util.*;

/**
 * This class is remote adapter to RoleCtrl. It provides convenient way to access
 * facade session bean. Inverit from this class to provide reasonable caching and event handling capabilities.
 *
 * Remote facade for RoleCtrl.
 * @xdoclet-generated at 12-10-09
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version ${version}
 */

public class RoleCtrlRemote extends Observable
{
    static RoleCtrlRemote _instance = null;
    public static RoleCtrlRemote getInstance() {
        if(_instance == null) {
	   _instance = new RoleCtrlRemote();
	}
	return _instance;
    }

  /**
   * cached remote session interface
   */
  com.amalto.core.objects.role.ejb.remote.RoleCtrl _session = null;
  /**
   * return session bean remote interface
   */
   protected com.amalto.core.objects.role.ejb.remote.RoleCtrl getSession() {
      try {
   	if(_session == null) {
	   _session = com.amalto.core.objects.role.ejb.local.RoleCtrlUtil.getHome().create();
	}
	return _session;
      } catch(Exception ex) {
        // just catch it here and return null.
        // somebody can provide better solution
	ex.printStackTrace();
	return null;
      }
   }

   public com.amalto.core.objects.role.ejb.RolePOJOPK putRole ( com.amalto.core.objects.role.ejb.RolePOJO role )
	  throws com.amalto.core.util.XtentisException, java.rmi.RemoteException
   {
        com.amalto.core.objects.role.ejb.RolePOJOPK retval;
       retval =  getSession().putRole( role );

      return retval;

   }

   public com.amalto.core.objects.role.ejb.RolePOJO getRole ( com.amalto.core.objects.role.ejb.RolePOJOPK pk )
	  throws com.amalto.core.util.XtentisException, java.rmi.RemoteException
   {
        com.amalto.core.objects.role.ejb.RolePOJO retval;
       retval =  getSession().getRole( pk );

      return retval;

   }

   public com.amalto.core.objects.role.ejb.RolePOJO existsRole ( com.amalto.core.objects.role.ejb.RolePOJOPK pk )
	  throws com.amalto.core.util.XtentisException, java.rmi.RemoteException
   {
        com.amalto.core.objects.role.ejb.RolePOJO retval;
       retval =  getSession().existsRole( pk );

      return retval;

   }

   public com.amalto.core.objects.role.ejb.RolePOJOPK removeRole ( com.amalto.core.objects.role.ejb.RolePOJOPK pk )
	  throws com.amalto.core.util.XtentisException, java.rmi.RemoteException
   {
        com.amalto.core.objects.role.ejb.RolePOJOPK retval;
       retval =  getSession().removeRole( pk );

      return retval;

   }

   public java.util.Collection getRolePKs ( java.lang.String regex )
	  throws com.amalto.core.util.XtentisException, java.rmi.RemoteException
   {
        java.util.Collection retval;
       retval =  getSession().getRolePKs( regex );

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
