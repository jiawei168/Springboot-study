package org.example.thymeleaf.controller;

import org.example.thymeleaf.model.Task;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class TaskController2 {

    //用于存储任务列表
    private List<Task> tasks = new ArrayList<>();

    //任务列表页面：显示所有待办事项
    @GetMapping("/taskList1")
    public String index(Model model) {
        model.addAttribute("tasks", tasks);
        //返回任务列表页面
        return "taskList1";
    }

    //处理添加新任务的表单提交
    @PostMapping("/addTask1")
    public String addTask(@RequestParam String description) {
        Long id = (long) (tasks.size() + 1);
        Task task = new Task(id, description);
        //将新任务添加到列表
        tasks.add(task);
        //重定向到任务列表页面
        return "redirect:/taskList1";
    }

    //更新任务状态（完成/未完成）
    @PostMapping("/updateTask1")
    public String updateTask(@RequestParam Long id) {
        Task task = tasks.stream()//将任务列表`tasks`转化为Stream流，以便进行后续的流式操作
                .filter(t -> t.getId().equals(id)) //使用filter方法过滤任务列表，过滤条件是每个任务`t`de`id`是否等于传入的`id`
                .findFirst()
                //在过滤后的任务流中，找到第一个匹配条件的任务（如果存在）
                .orElse(null);//如果没有找到匹配的任务，则返回null
        if (task != null) {
            //切换任务状态
            task.setCompleted(!task.isCompleted());
        }
        //重定向到任务列表页面
        return "redirect:/taskList1";
    }

    //删除任务
    @PostMapping("/deleteTask1")
    public String deleteTask(@RequestParam Long id) {
        //从列表中移除任务
        tasks.removeIf(t -> t.getId().equals(id));
        //重定向到任务列表页面
        return "redirect:/taskList1";
    }
}
