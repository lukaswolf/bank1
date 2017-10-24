package pl.lukaszwilk.bank.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    @PostMapping("/")
    public String index(@RequestParam("login") String login,
                        @RequestParam("password") String password,
                        @RequestParam("nickName") String nick, Model model){
        if (login.equals("oskar") && password.equals("admin") && !nick.isEmpty()){
            model.addAttribute("nickName",nick);
            return "redirect:/dashboard";
        }
model.addAttribute("error","Podales zle dane");
        return "bankLogin";
    }
@GetMapping("/")
    public static String index(){
        return "bankLogin";
}
}



//lombok to biblioteka sluzy do generowania klas