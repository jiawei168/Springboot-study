package org.example.mp.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.AllArgsConstructor;
import org.example.mp.entity.User;
import org.example.mp.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@AllArgsConstructor
public class UserController {
    private final UserService userService;
    // 创建⽤户
    @PostMapping("/create")
    public String createUser(@RequestBody User user) {
        boolean result = userService.createUser(user);
        return result ? "用户创建成功" : "用户创建失败";
    }
    // 更新⽤户
    @PutMapping("/update")
    public String updateUser(@RequestBody User user) {
        boolean result = userService.updateUser(user);
        return result ? "用户更新成功" : "用户更新失败";
    }
    // 删除⽤户（逻辑删除）
    @DeleteMapping("/delete/{id}")
    public String deleteUser(@PathVariable Long id) {
        boolean result = userService.deleteUserById(id);
        return result ? "用户删除成功" : "用户删除失败";
    }
    // 根据ID查询用户
    @GetMapping("/{id}")
    public User getUser(@PathVariable Long id) {
        return userService.getUserById(id);
    }
    // 按名字模糊查询用户
    @GetMapping("/name")
        public List<User> getUsersByName(@RequestParam String name) {
        return userService.getUsersByName(name);
    }
    // 分⻚查询用户
    @GetMapping("/page")
    public Page<User> getUsersByPage(@RequestParam int currentPage, @RequestParam int pageSize) {
        return userService.getUsersByPage(currentPage, pageSize);
    }
}