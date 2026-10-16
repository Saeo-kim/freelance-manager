
package com.example.freelancemanager.project;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ProjectController {

    @GetMapping("/projects")
    public String home() {
        return "task_list";
    }

    @GetMapping("/projects/{id}")
    public String detail(@PathVariable String id, Model model) {
        model.addAttribute("projectId", id);
        return "project_detail";
    }
}
