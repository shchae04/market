package com.market.common;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller("/basic")
public class CommonController {

    @GetMapping("/")
    public String Main(Model model){
        model.addAttribute("main", "로그인 해주셔서 감사합니다 .. 쿠폰발행");

        return "index";

    }


}
