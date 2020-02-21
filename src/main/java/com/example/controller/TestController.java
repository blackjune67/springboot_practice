package com.example.controller;

import com.example.dao.MainMapper;
import com.example.domain.UserVO;
import com.example.service.MainService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Optional;


@Controller
@RequiredArgsConstructor
@Slf4j
public class TestController {

    private final MainMapper mainMapper;
    private final MainService mainService;

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(Locale locale, Model model) {

        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
        String formatteDate = dateFormat.format(date);
        model.addAttribute("ServerTime", formatteDate);

        System.out.println(">>>>>" + mainMapper);
        System.out.println(">>>>>" + mainService);

        String id = Optional.ofNullable(mainMapper.findAll()).map(s -> s.getId()).orElse("");
        //String id2 = Optional.ofNullable(mainMapper.getUserVo()).map(UserVO::getId).orElse("");

        System.out.println("ID : " + id);
        //System.out.println("ID2 : " + id2);

        log.info(">>>>>>>>>>>>> [LOG]" + mainService.getUserVO());
        return "index";
    }
}
