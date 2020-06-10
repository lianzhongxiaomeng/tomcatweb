package com.dudu.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

import com.dudu.model.User;
import com.dudu.util.SessionManage;

/**
 * Application Lifecycle Listener implementation class SessionLAttributeListener
 *
 */
@WebListener
public class SessionLAttributeListener implements HttpSessionAttributeListener {

    /**
     * Default constructor. 
     */
    public SessionLAttributeListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see HttpSessionAttributeListener#attributeAdded(HttpSessionBindingEvent)
     */
    public void attributeAdded(HttpSessionBindingEvent arg0)  { 
         // TODO Auto-generated method stub
    	if(arg0.getName().equals("user")) {
    		User u = (User)arg0.getValue();
    		//判断是否有其他客户端已经登录
    		if(SessionManage.sessionMap.containsKey(u.getUsername())) {
    			//获得另一个客户端的session
    			HttpSession session = SessionManage.sessionMap.get(u.getUsername());
    			session.removeAttribute("user");
    		}
    		SessionManage.sessionMap.put(u.getUsername(), arg0.getSession());
    	}
    }

	/**
     * @see HttpSessionAttributeListener#attributeRemoved(HttpSessionBindingEvent)
     */
    public void attributeRemoved(HttpSessionBindingEvent arg0)  { 
         // TODO Auto-generated method stub
    	System.out.println("attributeRemoved");
    }

	/**
     * @see HttpSessionAttributeListener#attributeReplaced(HttpSessionBindingEvent)
     */
    public void attributeReplaced(HttpSessionBindingEvent arg0)  { 
         // TODO Auto-generated method stub
    	System.out.println("attributeReplaced");
    }
	
}
