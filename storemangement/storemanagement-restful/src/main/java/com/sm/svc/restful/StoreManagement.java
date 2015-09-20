/**
 * 
 */
package com.sm.svc.restful;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.sm.svc.domains.Store;
import com.sm.svc.services.store.StoreService;

/**
 * @author user
 *
 */
@Controller
public class StoreManagement {
	
	
	@Autowired
	private StoreService storeService;
	
	@RequestMapping(value="/", method = RequestMethod.GET)
	public String loginForm(ModelMap model) throws Exception {
	        model.addAttribute("store", new Store());
	        return "index";
	}
	
	@RequestMapping(value = "/register", method=RequestMethod.POST)
	public String signup(@ModelAttribute("store") Store store, Model model) {
		storeService.createStore(store);
		model.addAttribute("message", "Saved Store details");
	    return "success";
	}

}
