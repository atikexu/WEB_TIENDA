package com.example.ventaliz.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.ventaliz.service.ProductoService;
import com.example.ventaliz.bean.CategoriaBean;
import com.example.ventaliz.bean.ProductoBean;

@Controller
@RequestMapping("/privado")
public class PrivadoController {
	public static Logger log = LogManager.getLogger(PrivadoController.class);
	
	@Autowired
	ProductoService productoService;
	
	@GetMapping("/productos")
	public String productos() {
		return "/privado/productos";
	}
	
}
