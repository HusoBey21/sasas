package com.example.newSpring;

import entity.adressClass;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.*;
import repository.adresRepository;
@RestController


public class classController implements ErrorController {


	@RequestMapping("/error")
	public String handleError()
	{
		return "error";
	}
	public String getErrorPath()
	{
		return "/error";
	}
	@Autowired
	adresRepository ar;//Veritabanı bağlantısı sağlanacak
	@RequestMapping("/adress")
	@PostMapping("/2")
	public void saveIlIlce(@RequestBody adressClass a)
	{
		ar.save(a);
	}
	@GetMapping("/3")
	public List<adressClass> getIlIlce() //Tüm il ilçe bilgisini döndürür
	{
		return ar.findAll();
	}
	

}
