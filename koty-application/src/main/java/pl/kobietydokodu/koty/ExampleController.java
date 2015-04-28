package pl.kobietydokodu.koty;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ExampleController {

	@RequestMapping("/przyklad/model")
	public String przykladModelu(Model model) {
		model.addAttribute("message", "To jest jakaœ super informacja");
		return "glowny";
	}
	
    @RequestMapping("/kot/{imie}")
    public String szczegolyKota(@PathVariable("imie") String imieKota) {
        return "glowny";
    }
}

