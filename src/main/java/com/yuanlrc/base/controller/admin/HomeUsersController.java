package com.yuanlrc.base.controller.admin;

import com.yuanlrc.base.bean.CodeMsg;
import com.yuanlrc.base.bean.PageBean;
import com.yuanlrc.base.bean.Result;
import com.yuanlrc.base.bean.WithdrawalStatus;
import com.yuanlrc.base.entity.home.HomeUser;
import com.yuanlrc.base.service.home.HomeUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * 后台显示前台用户Controller
 */
@RequestMapping("/admin/homeUser")
@Controller
public class HomeUsersController {

    @Autowired
    private HomeUserService homeUserService;


    /**
     * 前台用户分页查询
     * @param homeUser
     * @param pageBean
     * @param model
     * @return
     */
    @RequestMapping("/list")
    public String list(HomeUser homeUser, PageBean<HomeUser> pageBean, Model model){
        model.addAttribute("title","前台用户列表");
        model.addAttribute("username",homeUser.getUsername());
        model.addAttribute("pageBean",homeUserService.findList(homeUser,pageBean));
        return "admin/home_user/list";
    }

    /**
     * 编辑前台用户页面
     * @param homeUserId
     * @param model
     * @return
     */
    @RequestMapping("/edit")
    public String edit(Long homeUserId,Model model){
        model.addAttribute("homeUser",homeUserService.find(homeUserId));
        return "admin/home_user/edit";
    }

    /**
     * 更改前台用户状态
     * @param homeUser
     * @return
     */
    @RequestMapping(value = "/edit",method = RequestMethod.POST)
    @ResponseBody
    public Result<Boolean> edit(HomeUser homeUser){
        if(homeUserService.updateStatus(homeUser) != 1){
            return Result.error(CodeMsg.UPDATE_STATUS_ERROR);
        }
        return Result.success(true);
    }




}
