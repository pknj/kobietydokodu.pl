package pl.kobietydokodu.koty;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class KotyController {

	@Autowired
	private KotDAO KotDAO;
	
	

}
	