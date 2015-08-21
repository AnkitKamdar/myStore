/**
 * 
 */
package com.sm.svc.restful;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author user
 *
 */
@Controller
public class StoreManagement {
	@RequestMapping("*")
	public String index() {
	   // System.out.println(request.getServletPath());
	    return "index";
	}

}
