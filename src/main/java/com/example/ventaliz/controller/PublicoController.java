package com.example.ventaliz.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
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

import com.example.ventaliz.service.CarritoService;
import com.example.ventaliz.service.ProductoService;
import com.google.gson.Gson;
import com.example.ventaliz.bean.CarritoBean;
import com.example.ventaliz.bean.CategoriaBean;
import com.example.ventaliz.bean.ProductoBean;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.BeanUtilsBean;

@Controller
@RequestMapping("/publico")
public class PublicoController {
	public static Logger log = LogManager.getLogger(PublicoController.class);
	
	@Autowired
	ProductoService productoService;
	
	@Autowired
	CarritoService carritoService;
	
	List<CarritoBean> listaCarrito =  new ArrayList<>();
	
	Cookie cookie;
	
	@GetMapping("/productos")
	public String productos() {
		return "/publico/productos";
	}
	
	@GetMapping("/eventos")
	public String productosEventos(Model model) throws Exception {
		ProductoBean productoBean = new ProductoBean();
		productoBean.setIdCategoria(1);
		List<ProductoBean> productos = productoService.listarProductosXCategoria(productoBean);
		
		CarritoBean carritoBean = new CarritoBean();
		List<CarritoBean> carritos = carritoService.listarCarrito(carritoBean);
		
		model.addAttribute("productos", productos);
		model.addAttribute("listarcarrito", carritos);
		return "/publico/productos_eventos";
	}
	
	@GetMapping("/cumple")
	public String productosCumple() {
		return "/publico/productos_cumple";
	}
	
	@GetMapping("/parael")
	public String productosParael() {
		return "/publico/productos_parael";
	}
	
	@GetMapping("/paraella")
	public String productosParaella() {
		return "/publico/productos_paraella";
	}
	
	@GetMapping("/login")
	public String login() {
		return "/login/login";
	}
	
	@GetMapping("/contactenos")
	public String contactenos() {
		return "/publico/contactenos";
	}
	
//	@PostMapping("/prueba")
//	public ResponseEntity<ProductoBean> prueba() {
//		ProductoBean productoBean = new ProductoBean();
//		return new ResponseEntity<ProductoBean>(productoBean, HttpStatus.OK);
//	}
	
	@PostMapping("/listarCarritos")
	public ResponseEntity<List<CarritoBean>> listarCarritos() throws Exception {
		System.out.println("ENTROLISTA");
		CarritoBean carritoBean = new CarritoBean();
		List<CarritoBean> carritos = carritoService.listarCarrito(carritoBean);

		return new ResponseEntity<List<CarritoBean>>(carritos, HttpStatus.OK);
	}
	
	@PostMapping("/agregarCarritos")
	@ResponseBody
	public ResponseEntity<List<CarritoBean>> agregarCarritos(HttpServletRequest request, HttpSession session, HttpServletResponse response) throws Exception {
		System.out.println("ENTRO AGREGAR");
		System.out.println(session);
		CarritoBean carrito = new CarritoBean();
		BeanUtils.populate(carrito, request.getParameterMap());	
		List<CarritoBean> carritos = carritoService.agregarCarrito(carrito, listaCarrito);
		System.out.println("TAMAÑO "+carritos.size());
		
		
//		cookie = new Cookie("username", "Jovan"+carritos.size());

	    //add cookie to response
//	    response.addCookie(cookie);
		Cookie [] cookies = request.getCookies();
		boolean existecarrito=false;
		for (Cookie cookie: cookies){
			
			if(cookie.getName().equals("inicio")){
				
			
				System.out.println(cookie.getName());
				System.out.println(cookie.getValue());
			}
			if(cookie.getName().equals("carrito")){
				existecarrito = true;
			}
		}
		if(existecarrito) {
			
		}else {
			
		}
		
		System.out.println(request.getParameter("inicio"));
		if(request.getParameter("inicio")!=null) {
			String json = new Gson().toJson(carritos);
			cookie = new Cookie("json", json);
			response.addCookie(cookie);
		}
	    
		
		return new ResponseEntity<List<CarritoBean>>(carritos, HttpStatus.OK);
	}
	
	@PostMapping("/eliminarCarritos")
	public ResponseEntity<List<CarritoBean>> eliminarCarritos(@RequestBody CarritoBean carrito) throws Exception {
		System.out.println("ENTRO ELIMINAR");
		List<CarritoBean> carritos = carritoService.eliminarCarrito(carrito, listaCarrito);
		return new ResponseEntity<List<CarritoBean>>(carritos, HttpStatus.OK);
	}
	
//	@GetMapping("somos")
//	public String somos() {
//		return "somos";
//	}
//	
//	@GetMapping("productos")
//	public String productos() {
//		return "productos";
//	}
//	
//	@GetMapping("contacto")
//	public String contacto(Model model) {
//		model.addAttribute("contacto", new ContactoBean());
//		model.addAttribute("mensaje", new MensajeBean());
//		
//		return "contacto";
//	}
//	
//	@PostMapping("/enviarEmailContacto")
//	public String enviarEmailContacto(@ModelAttribute ContactoBean contacto, BindingResult result, Model model, RedirectAttributes rm) throws Exception {
//		log.info("Inicio enviarEmailContacto");
//		
//		MensajeBean mensaje = new MensajeBean();
////		mensaje.setMensaje1("incicio verifica");
//		
//		
//		if(!contacto.getCorreo().isEmpty() && !contacto.getMensaje().isEmpty() && !contacto.getCelular().isEmpty()) {
//			emailService.enviarEmailContacto(contacto);
//			model.addAttribute("contacto", contacto);
//			model.addAttribute("mensaje", mensaje);
//			log.info("Fin enviarEmailContacto");
//			return "redirect:/contacto";
//		}else {
//			mensaje.setMensaje1("Por favor ingrese todos los campos");
//			model.addAttribute("mensaje", mensaje);
//			model.addAttribute("contacto", contacto);
//			log.info("Fin error campos enviarEmailContacto");
//			return "contacto";
//		}
//		
//	}
//	
//	@GetMapping(value="/precios")
//	public String listarProductos(@RequestParam("categoria") String categoria, Model model) throws Exception {
//		List<CategoriaBean> categorias = categoriaService.listarCategoria(new CategoriaBean());
//		CategoriaBean categoriaObtener = new CategoriaBean();
//		categoriaObtener.setIdCategoria(Integer.parseInt(categoria));
//		CategoriaBean categoriaSel = categoriaService.obtenerCategoriaXId(categoriaObtener);
//		ProductoBean productoBean = new ProductoBean();
//		productoBean.setIdCategoria(Integer.parseInt(categoria));
//		List<ProductoBean> productos = productoService.listarProductosXCategoria(productoBean);
//		model.addAttribute("categoriaSel", categoriaSel);
//		model.addAttribute("categorias", categorias);
//		model.addAttribute("productos", productos);   
//	    return "precios";
//	}
//	
//	@PostMapping(value="/precios")
//	public String verProducto(@RequestParam("categoria") String categoria, @RequestParam("producto") String producto, Model model) throws Exception {
//		List<CategoriaBean> categorias = categoriaService.listarCategoria(new CategoriaBean());
//		CategoriaBean categoriaObtener = new CategoriaBean();
//		categoriaObtener.setIdCategoria(Integer.parseInt(categoria));
//		CategoriaBean categoriaSel = categoriaService.obtenerCategoriaXId(categoriaObtener);
//		ProductoBean productoBean = new ProductoBean();
//		productoBean.setIdCategoria(Integer.parseInt(categoria));
//		List<ProductoBean> productos = productoService.listarProductosXCategoria(productoBean);
//		model.addAttribute("categoriaSel", categoriaSel);
//		model.addAttribute("categorias", categorias);
//		model.addAttribute("productos", productos);   
//	    return "precios";
//	} 
	
	
}
