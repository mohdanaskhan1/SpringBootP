package com.example.springboot2.controller;
import com.example.springboot2.dto.EmployeeDTO;
import com.example.springboot2.service.MyService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MyController {

    @Autowired
    private MyService myService;


    @GetMapping(path = {"/","index","welcome"})
    public String welcomeView(){
        return "index";
    }

    @GetMapping("insert")
    public String insertView (){
        return "insert";
    }

    @GetMapping("read")
    public String readView(Model model){
        model.addAttribute("ReadData",myService.readData());
        return "read";
    }

    @PostMapping("insert")
    public String insertPostView(@Valid @ModelAttribute EmployeeDTO employeeDTO, BindingResult bindingResult, Model model){
        ArrayList<Object> errorList = new ArrayList<>();

        if(bindingResult.hasErrors()){
            List<ObjectError> allErrors = bindingResult.getAllErrors();
            for(ObjectError error : allErrors){
                String message = error.getDefaultMessage();
                errorList.add(message);
            }
            model.addAttribute("errorList", errorList);
        }
        else{
            String result = myService.insertData(employeeDTO);
            model.addAttribute("errorList",result);

        }
        System.out.println(employeeDTO);
        return "insert";
    }

    @GetMapping("delete")
    public String deleteData(@RequestParam int id, RedirectAttributes  redirectAttributes){
        redirectAttributes.addFlashAttribute("deleteData",myService.deleteData(id));
        return "redirect:read";
    }



}
