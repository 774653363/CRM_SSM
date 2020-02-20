package ek.zhou.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.PrimitiveIterator.OfDouble;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import ek.zhou.pojo.Customer;
import ek.zhou.pojo.UploadedImageFile;
import ek.zhou.service.CustomerService;
import ek.zhou.util.Page;

@Controller
public class CustomerController {
	@Autowired
	CustomerService customerService;
	@RequestMapping("listCustomer")
	public ModelAndView listCustomer(Customer customer,Page page){
		System.out.println(customer);
		ModelAndView mav = new ModelAndView();
		PageHelper.offsetPage(page.getStartIndex(), page.getPageSize());
		List<Customer> cs = customerService.list(customer);
		PageInfo<Customer> pageInfo = new PageInfo<>(cs);
		mav.addObject("cs", cs);
		page.caculate((int)pageInfo.getTotal());
		mav.setViewName("/jsp/customer/list.jsp");
		return mav;
	}
	@RequestMapping("addUICustomer")
	public ModelAndView addUICustomer(){
		ModelAndView mav = new ModelAndView("redirect:/jsp/customer/add.jsp");
		return mav;
	}
	@RequestMapping("addCustomer")
	public ModelAndView addCustomer(Customer customer,HttpServletRequest request,UploadedImageFile file) throws IllegalStateException, IOException{
		ModelAndView mav = new ModelAndView("redirect:listCustomer");
		if(!file.getUpload().isEmpty()){
			//获取源文件后缀
			String suffix = file.getUpload().getOriginalFilename().substring(file.getUpload().getOriginalFilename().lastIndexOf("."));
			//生成随机文件名
			String randomName = RandomStringUtils.randomAlphanumeric(10)+suffix;
			//获取真实路径
			String realPath = request.getServletContext().getRealPath("/upload");
			System.out.println(realPath);
			File of = new File(realPath, randomName);
			if(!of.getParentFile().exists()){
				of.getParentFile().mkdirs();
			}
			file.getUpload().transferTo(of);
			customer.setCust_image("/upload/"+randomName);
		}
		customerService.add(customer);
		return mav;
	}
	
	@RequestMapping("editCustomer")
	public ModelAndView editCustomer(Customer customer){
		ModelAndView mav = new ModelAndView("jsp/customer/edit.jsp");
		customer = customerService.get(customer.getCust_id());
		mav.addObject("customer", customer);
		return mav;
	}
	@RequestMapping("updateCustomer")
	public ModelAndView updateCustomer(Customer customer,HttpServletRequest request,UploadedImageFile file) throws IllegalStateException, IOException{
		ModelAndView mav = new ModelAndView("redirect:listCustomer");
		if(!file.getUpload().isEmpty()){
			//删除原文件
			if(customer.getCust_image()!=null&&!customer.getCust_image().equals("")){
				//获取真实路径
				String path = request.getServletContext().getRealPath("")+customer.getCust_image();
				File oldFile = new File(path);
				if(oldFile.exists()){
					oldFile.delete();
				}
			}
			//获取源文件后缀
			String suffix = file.getUpload().getOriginalFilename().substring(file.getUpload().getOriginalFilename().lastIndexOf("."));
			//生成随机文件名
			String randomName = RandomStringUtils.randomAlphanumeric(10)+suffix;
			//获取真实路径
			String realPath = request.getServletContext().getRealPath("/upload");
			System.out.println(realPath);
			File of = new File(realPath, randomName);
			if(!of.getParentFile().exists()){
				of.getParentFile().mkdirs();
			}
			file.getUpload().transferTo(of);
			customer.setCust_image("/upload/"+randomName);
		}
		
		customerService.update(customer);
		return mav;
	}
	@RequestMapping("deleteCustomer")
	public ModelAndView deleteCustomer(Customer customer,HttpServletRequest request,Page page){
		ModelAndView mav = new ModelAndView("redirect:listCustomer");

		customer = customerService.get(customer.getCust_id());
		//删除原文件
		if(customer.getCust_image()!=null&&!customer.getCust_image().equals("")){
			//获取真实路径
			String path = request.getServletContext().getRealPath("")+customer.getCust_image();
			File oldFile = new File(path);
			if(oldFile.exists()){
				oldFile.delete();
			}
		}
		customerService.delete(customer.getCust_id());
		mav.addObject("customer", customer);
		return mav;
	}
	
}
