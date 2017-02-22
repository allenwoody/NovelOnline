package com.angentle.novel.web.controller.author;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.angentle.novel.core.common.Const;
import com.angentle.novel.core.generic.GenericController;
import com.angentle.novel.core.util.MD5Util;
import com.angentle.novel.web.model.User;
import com.angentle.novel.web.model.UserInSession;
/**
 * 
* @ClassName: AuthorController 
* @Description: 作家专区Controller 
* @author allen
* @date 2017年2月18日 下午2:25:30 
*
 */
import com.angentle.novel.web.service.author.AuthorService;
import com.angentle.novel.web.service.user.UserService;

@Controller
@RequestMapping("/author")
public class AuthorController extends GenericController {

	@Resource
	AuthorService authorService;
	@Resource
	UserService userService;
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(@Valid User user, BindingResult result, Model model, HttpServletRequest request) throws NoSuchAlgorithmException, UnsupportedEncodingException {
		try {
			Subject subject = SecurityUtils.getSubject();
			// 已登陆则 跳到首页
			if (subject.isAuthenticated()) {
				/*判断是否初始密码，若是则跳转至修改密码*/
				if(user.getPassword().equals(Const.INITIAL_PASSWORD)){
					return "redirect:/setPassword.html";
				}
				return "redirect:/index.html";
			}
			if (result.hasErrors()) {
				model.addAttribute("error", "参数错误！");
				return "/author/login";
			}
			// 身份验证
			subject.login(new UsernamePasswordToken(user.getUsername(), MD5Util.getEncryptedPwd(user.getPassword())));
			// 验证成功在Session中保存用户信息
			final User authUserInfo = userService.selectByLoginName(user.getUsername());
			UserInSession uis = new UserInSession();
			uis.setLoginName(authUserInfo.getLoginname());
			uis.setUsername(authUserInfo.getUsername());
			uis.setUserId(authUserInfo.getUserId());
			this.getSession().setAttribute(Const.UserInSession, uis);
			request.getSession().setAttribute("currentUser", authUserInfo.getUsername());
		} catch (AuthenticationException e) {
			// 身份验证失败
			model.addAttribute("error", "用户名或密码错误 ！");
			return "/author/login";
		}
		return "redirect:/author/index.html";
	}
	
	/**
	 * 
	* @Title: login 
	* @Description: 作家登录页 
	* @param @return    设定文件 
	* @return String    返回类型 
	* @throws
	 */
	@RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {
        return "/author/login";
    }
	
	@RequestMapping("/index")
	public String index(){
		
		return "/author/index";
	}
}
