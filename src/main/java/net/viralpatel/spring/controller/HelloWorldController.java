package net.viralpatel.spring.controller;

import net.viralpatel.spring.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/student")
public class HelloWorldController {

    @RequestMapping("/showForm")
    public String showForm(Model theModel) {
        theModel.addAttribute("student", new Student());
        return "student-form";
    }

    @GetMapping("/processForm")
    public String processForm(@ModelAttribute("student") Student theStudent) {
        System.out.println("The Student last name : " + theStudent.getLastName());
        return "student-confirmation";
    }

    @GetMapping("/processFormVersionTwo")
    public String letsShout(@RequestParam("studentName") String theName, Model model) {
       // String theName = request.getParameter("studentName");
        theName = theName.toUpperCase();
        String result = "Yo!! " + theName;
        model.addAttribute("message",result);
        return "helloworld";
    }
}
