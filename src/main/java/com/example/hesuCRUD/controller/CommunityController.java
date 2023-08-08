package com.example.hesuCRUD.controller;


import com.example.hesuCRUD.model.Community;
import com.example.hesuCRUD.service.ICommunityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/four")
public class CommunityController {
    @Autowired
    ICommunityService communityService;

    @GetMapping("/all")
    public String selectAllCommunity(Model model) {
        List<Community> communityList = communityService.selectAllCommunity();
        model.addAttribute(communityList);
        return "hesuMain";
    }

    @GetMapping("/detail")
    public String selectACommunity(@RequestParam("no") int no, Model model) {

        Community community = communityService.selectACommunity(no);

        model.addAttribute(community);
        return "hesuDetail";
    }

    @GetMapping("/insert")
    public String insertCommunityGet() {
        return "hesuInsert";
    }

    @PostMapping("/insert")
    public String insertCommunity(@RequestParam("title") String title, @RequestParam("content") String content) {
        communityService.insertCommunity(title, content);
        return "redirect:/four/all";
    }

    @GetMapping("/update")
    public String updateCommunityGet(@RequestParam("no") int no, Model model) {

        Community community = communityService.selectACommunity(no);
        model.addAttribute("community", community);
        return "hesuUpdate";
    }

    @PostMapping("/update")
    public String updateCommunity(@RequestParam("no") int no, @RequestParam("title") String title, @RequestParam("content") String content) {
        communityService.updateCommunity(no, title, content);
        return "redirect:/four/all";
    }

    @GetMapping("/delete")
    public String deleteCommunity(@RequestParam("no") String no) {
        System.out.println(no);
        communityService.deleteCommunity(Integer.parseInt(no));
        return "redirect:/four/all";
    }

}
