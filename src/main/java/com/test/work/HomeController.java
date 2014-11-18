package com.test.work;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.test.work.model.Storefront;
import com.test.work.service.StorefrontService;
import com.test.work.service.Impl.StorefrontServiceImpl;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	@Autowired
	private StorefrontService storefrontService;
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		Storefront storefront = new Storefront();
		String uid = UUID.randomUUID().toString().replace("-", "");
		storefront.setId(uid);
		storefrontService.saveUser(storefront);
	  
	        return "home";
	}
	
}
