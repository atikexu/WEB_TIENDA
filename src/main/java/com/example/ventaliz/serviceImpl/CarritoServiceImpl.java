package com.example.ventaliz.serviceImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ventaliz.bean.CarritoBean;
import com.example.ventaliz.bean.CategoriaBean;
import com.example.ventaliz.bean.ProductoBean;
import com.example.ventaliz.service.CarritoService;
import com.example.ventaliz.service.ProductoService;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class CarritoServiceImpl implements CarritoService{

	@Override
	public List<CarritoBean> listarCarrito(CarritoBean carritoBean) throws Exception {
		List<CarritoBean> lista = new ArrayList<>();
		ObjectMapper mapper = new ObjectMapper();
		String json = "["
        		+ "{\"idProducto\":1, \"idCategoria\":1, \"nombre\":\"Eventos Especiales\", \"descripcion\":\"Para los eventos especiales el mejor detalle para la mejor ocasión.\",\"precio\":45.00, \"nombreImagen\":\"../assets/images/producto_peluches.jpeg\", \"cantidad\":2},"
//        		+ "{\"idProducto\":2, \"idCategoria\":1, \"nombre\":\"Eventos Especiales\", \"descripcion\":\"Para los eventos especiales el mejor detalle para la mejor ocasión.\",\"precio\":45.00, \"nombreImagen\":\"../assets/images/producto_otros.jpeg\"},"
//        		+ "{\"idProducto\":3, \"idCategoria\":1, \"nombre\":\"Feliz día del niño\", \"descripcion\":\"Para los eventos especiales el mejor detalle para la mejor ocasión para el día del niño.\",\"precio\":45.00, \"nombreImagen\":\"../assets/images/producto_nino.jpeg\"},"
//        		+ "{\"idProducto\":4, \"idCategoria\":1, \"nombre\":\"Feliz día de la enfermera\", \"descripcion\":\"Para los eventos especiales el mejor detalle para la mejor ocasión para el día de la enfermera.\",\"precio\":45.00, \"nombreImagen\":\"../assets/images/producto_enfermera.jpeg\"},"
//        		
//				+ "{\"idProducto\":5, \"idCategoria\":2, \"nombre\":\"Cumpleaños\", \"descripcion\":\"Para los cumpleaños el mejor detalle para la mejor ocasión.\",\"precio\":45.00, \"nombreImagen\":\"../assets/images/producto_cumpleanos.jpeg\"},"
//				+ "{\"idProducto\":6, \"idCategoria\":2, \"nombre\":\"Cumpleaños\", \"descripcion\":\"Para los cumpleaños el mejor detalle para la mejor ocasión.\",\"precio\":45.00, \"nombreImagen\":\"../assets/images/producto_cumpleanos2.jpeg\"},"
//				+ "{\"idProducto\":7, \"idCategoria\":2, \"nombre\":\"Cumpleaños\", \"descripcion\":\"Para los cumpleaños el mejor detalle para la mejor ocasión.\",\"precio\":45.00, \"nombreImagen\":\"../assets/images/producto_cumpleanos3.jpeg\"},"
				+ "{\"idProducto\":8, \"idCategoria\":2, \"nombre\":\"Cumpleaños\", \"descripcion\":\"Para los cumpleaños el mejor detalle para la mejor ocasión.\",\"precio\":45.00, \"nombreImagen\":\"../assets/images/producto_cumpleanos4.jpeg\", \"cantidad\":1}"
        		+ "]";
		lista = Arrays.asList(mapper.readValue(json, CarritoBean[].class));
		return lista;
	}
	
	@Override
	public List<CarritoBean> agregarCarrito(CarritoBean carritoBean, List<CarritoBean> listaTodos) throws Exception {
		List<CarritoBean> lista = new ArrayList<>();
		ObjectMapper mapper = new ObjectMapper();
		String json = "["
        		+ "{\"idProducto\":1, \"idCategoria\":1, \"nombre\":\"Eventos Especiales\", \"descripcion\":\"Para los eventos especiales el mejor detalle para la mejor ocasión.\",\"precio\":45.00, \"nombreImagen\":\"../assets/images/producto_peluches.jpeg\", \"cantidad\":2},"
//        		+ "{\"idProducto\":2, \"idCategoria\":1, \"nombre\":\"Eventos Especiales\", \"descripcion\":\"Para los eventos especiales el mejor detalle para la mejor ocasión.\",\"precio\":45.00, \"nombreImagen\":\"../assets/images/producto_otros.jpeg\"},"
//        		+ "{\"idProducto\":3, \"idCategoria\":1, \"nombre\":\"Feliz día del niño\", \"descripcion\":\"Para los eventos especiales el mejor detalle para la mejor ocasión para el día del niño.\",\"precio\":45.00, \"nombreImagen\":\"../assets/images/producto_nino.jpeg\"},"
//        		+ "{\"idProducto\":4, \"idCategoria\":1, \"nombre\":\"Feliz día de la enfermera\", \"descripcion\":\"Para los eventos especiales el mejor detalle para la mejor ocasión para el día de la enfermera.\",\"precio\":45.00, \"nombreImagen\":\"../assets/images/producto_enfermera.jpeg\"},"
//        		
//				+ "{\"idProducto\":5, \"idCategoria\":2, \"nombre\":\"Cumpleaños\", \"descripcion\":\"Para los cumpleaños el mejor detalle para la mejor ocasión.\",\"precio\":45.00, \"nombreImagen\":\"../assets/images/producto_cumpleanos.jpeg\"},"
//				+ "{\"idProducto\":6, \"idCategoria\":2, \"nombre\":\"Cumpleaños\", \"descripcion\":\"Para los cumpleaños el mejor detalle para la mejor ocasión.\",\"precio\":45.00, \"nombreImagen\":\"../assets/images/producto_cumpleanos2.jpeg\"},"
//				+ "{\"idProducto\":7, \"idCategoria\":2, \"nombre\":\"Cumpleaños\", \"descripcion\":\"Para los cumpleaños el mejor detalle para la mejor ocasión.\",\"precio\":45.00, \"nombreImagen\":\"../assets/images/producto_cumpleanos3.jpeg\"},"
				+ "{\"idProducto\":8, \"idCategoria\":2, \"nombre\":\"Cumpleaños\", \"descripcion\":\"Para los cumpleaños el mejor detalle para la mejor ocasión.\",\"precio\":45.00, \"nombreImagen\":\"../assets/images/producto_cumpleanos4.jpeg\", \"cantidad\":1}"
        		+ "]";
		lista = Arrays.asList(mapper.readValue(json, CarritoBean[].class));
		
		listaTodos.add(carritoBean);
		
		return listaTodos;
	}
	
	@Override
	public List<CarritoBean> eliminarCarrito(CarritoBean carritoBean, List<CarritoBean> listaTodos) throws Exception {
		List<CarritoBean> lista = new ArrayList<>();
		ObjectMapper mapper = new ObjectMapper();
		String json = "["
        		+ "{\"idProducto\":1, \"idCategoria\":1, \"nombre\":\"Eventos Especiales\", \"descripcion\":\"Para los eventos especiales el mejor detalle para la mejor ocasión.\",\"precio\":45.00, \"nombreImagen\":\"../assets/images/producto_peluches.jpeg\", \"cantidad\":2},"
//        		+ "{\"idProducto\":2, \"idCategoria\":1, \"nombre\":\"Eventos Especiales\", \"descripcion\":\"Para los eventos especiales el mejor detalle para la mejor ocasión.\",\"precio\":45.00, \"nombreImagen\":\"../assets/images/producto_otros.jpeg\"},"
//        		+ "{\"idProducto\":3, \"idCategoria\":1, \"nombre\":\"Feliz día del niño\", \"descripcion\":\"Para los eventos especiales el mejor detalle para la mejor ocasión para el día del niño.\",\"precio\":45.00, \"nombreImagen\":\"../assets/images/producto_nino.jpeg\"},"
//        		+ "{\"idProducto\":4, \"idCategoria\":1, \"nombre\":\"Feliz día de la enfermera\", \"descripcion\":\"Para los eventos especiales el mejor detalle para la mejor ocasión para el día de la enfermera.\",\"precio\":45.00, \"nombreImagen\":\"../assets/images/producto_enfermera.jpeg\"},"
//        		
//				+ "{\"idProducto\":5, \"idCategoria\":2, \"nombre\":\"Cumpleaños\", \"descripcion\":\"Para los cumpleaños el mejor detalle para la mejor ocasión.\",\"precio\":45.00, \"nombreImagen\":\"../assets/images/producto_cumpleanos.jpeg\"},"
//				+ "{\"idProducto\":6, \"idCategoria\":2, \"nombre\":\"Cumpleaños\", \"descripcion\":\"Para los cumpleaños el mejor detalle para la mejor ocasión.\",\"precio\":45.00, \"nombreImagen\":\"../assets/images/producto_cumpleanos2.jpeg\"},"
//				+ "{\"idProducto\":7, \"idCategoria\":2, \"nombre\":\"Cumpleaños\", \"descripcion\":\"Para los cumpleaños el mejor detalle para la mejor ocasión.\",\"precio\":45.00, \"nombreImagen\":\"../assets/images/producto_cumpleanos3.jpeg\"},"
				+ "{\"idProducto\":8, \"idCategoria\":2, \"nombre\":\"Cumpleaños\", \"descripcion\":\"Para los cumpleaños el mejor detalle para la mejor ocasión.\",\"precio\":45.00, \"nombreImagen\":\"../assets/images/producto_cumpleanos4.jpeg\", \"cantidad\":1}"
        		+ "]";
		lista = Arrays.asList(mapper.readValue(json, CarritoBean[].class));
		
		for (CarritoBean carritos : listaTodos) {
			if(!carritos.getIdProducto().equals(carritoBean.getIdProducto())) {
				lista.add(carritos);
			}
		}
		
		return lista;
	}

//	@Override
//	public CarritoBean obtenerProductoXId(CarritoBean productoBean) throws Exception {
//		List<CarritoBean> lista = new ArrayList<>();
//		CarritoBean producto = new CarritoBean();
//		ObjectMapper mapper = new ObjectMapper();
//		String json = "["
//        		+ "{\"idProducto\":1, \"idCategoria\":1, \"nombre\":\"Eventos Especiales\", \"descripcion\":\"Para los eventos especiales el mejor detalle para la mejor ocasión.\",\"precio\":45.00, \"nombreImagen\":\"../assets/images/producto_peluches.jpeg\"},"
//        		+ "{\"idProducto\":2, \"idCategoria\":1, \"nombre\":\"Eventos Especiales\", \"descripcion\":\"Para los eventos especiales el mejor detalle para la mejor ocasión.\",\"precio\":45.00, \"nombreImagen\":\"../assets/images/producto_otros.jpeg\"},"
//        		+ "{\"idProducto\":3, \"idCategoria\":1, \"nombre\":\"Feliz día del niño\", \"descripcion\":\"Para los eventos especiales el mejor detalle para la mejor ocasión para el día del niño.\",\"precio\":45.00, \"nombreImagen\":\"../assets/images/producto_nino.jpeg\"},"
//        		+ "{\"idProducto\":4, \"idCategoria\":1, \"nombre\":\"Feliz día de la enfermera\", \"descripcion\":\"Para los eventos especiales el mejor detalle para la mejor ocasión para el día de la enfermera.\",\"precio\":45.00, \"nombreImagen\":\"../assets/images/producto_enfermera.jpeg\"},"
//        		
//				+ "{\"idProducto\":5, \"idCategoria\":2, \"nombre\":\"Cumpleaños\", \"descripcion\":\"Para los cumpleaños el mejor detalle para la mejor ocasión.\",\"precio\":45.00, \"nombreImagen\":\"../assets/images/producto_cumpleanos.jpeg\"},"
//				+ "{\"idProducto\":6, \"idCategoria\":2, \"nombre\":\"Cumpleaños\", \"descripcion\":\"Para los cumpleaños el mejor detalle para la mejor ocasión.\",\"precio\":45.00, \"nombreImagen\":\"../assets/images/producto_cumpleanos2.jpeg\"},"
//				+ "{\"idProducto\":7, \"idCategoria\":2, \"nombre\":\"Cumpleaños\", \"descripcion\":\"Para los cumpleaños el mejor detalle para la mejor ocasión.\",\"precio\":45.00, \"nombreImagen\":\"../assets/images/producto_cumpleanos3.jpeg\"},"
//				+ "{\"idProducto\":8, \"idCategoria\":2, \"nombre\":\"Cumpleaños\", \"descripcion\":\"Para los cumpleaños el mejor detalle para la mejor ocasión.\",\"precio\":45.00, \"nombreImagen\":\"../assets/images/producto_cumpleanos4.jpeg\"}"
//        		+ "]";
//		lista = Arrays.asList(mapper.readValue(json, CarritoBean[].class));
//		for (CarritoBean prod : lista) {
//            if(productoBean.getIdProducto().equals(prod.getIdProducto())) {
//            	producto = prod;
//            }
//        }
//		return producto;
//	}
	
//	@Override
//	public List<CarritoBean> listarProductosXCategoria(CarritoBean productoBean) throws Exception {
//		List<ProductoBean> listaporcategoria = new ArrayList<>();
//		List<ProductoBean> lista = new ArrayList<>();
//		ObjectMapper mapper = new ObjectMapper();
//		String json = "["
//        		+ "{\"idProducto\":1, \"idCategoria\":1, \"nombre\":\"Eventos Especiales\", \"descripcion\":\"Para los eventos especiales el mejor detalle para la mejor ocasión.\",\"precio\":45.00, \"nombreImagen\":\"../assets/images/producto_peluches.jpeg\"},"
//        		+ "{\"idProducto\":2, \"idCategoria\":1, \"nombre\":\"Eventos Especiales\", \"descripcion\":\"Para los eventos especiales el mejor detalle para la mejor ocasión.\",\"precio\":45.00, \"nombreImagen\":\"../assets/images/producto_otros.jpeg\"},"
//        		+ "{\"idProducto\":3, \"idCategoria\":1, \"nombre\":\"Feliz día del niño\", \"descripcion\":\"Para los eventos especiales el mejor detalle para la mejor ocasión para el día del niño.\",\"precio\":45.00, \"nombreImagen\":\"../assets/images/producto_nino.jpeg\"},"
//        		+ "{\"idProducto\":4, \"idCategoria\":1, \"nombre\":\"Feliz día de la enfermera\", \"descripcion\":\"Para los eventos especiales el mejor detalle para la mejor ocasión para el día de la enfermera.\",\"precio\":45.00, \"nombreImagen\":\"../assets/images/producto_enfermera.jpeg\"},"
//        		
//				+ "{\"idProducto\":5, \"idCategoria\":2, \"nombre\":\"Cumpleaños\", \"descripcion\":\"Para los cumpleaños el mejor detalle para la mejor ocasión.\",\"precio\":45.00, \"nombreImagen\":\"../assets/images/producto_cumpleanos.jpeg\"},"
//				+ "{\"idProducto\":6, \"idCategoria\":2, \"nombre\":\"Cumpleaños\", \"descripcion\":\"Para los cumpleaños el mejor detalle para la mejor ocasión.\",\"precio\":45.00, \"nombreImagen\":\"../assets/images/producto_cumpleanos2.jpeg\"},"
//				+ "{\"idProducto\":7, \"idCategoria\":2, \"nombre\":\"Cumpleaños\", \"descripcion\":\"Para los cumpleaños el mejor detalle para la mejor ocasión.\",\"precio\":45.00, \"nombreImagen\":\"../assets/images/producto_cumpleanos3.jpeg\"},"
//				+ "{\"idProducto\":8, \"idCategoria\":2, \"nombre\":\"Cumpleaños\", \"descripcion\":\"Para los cumpleaños el mejor detalle para la mejor ocasión.\",\"precio\":45.00, \"nombreImagen\":\"../assets/images/producto_cumpleanos4.jpeg\"},"
//				
//				+ "{\"idProducto\":9, \"idCategoria\":3, \"nombre\":\"Para él\", \"descripcion\":\"Para consentir a la persona con el mejor detalle para la mejor ocasión.\",\"precio\":45.00, \"nombreImagen\":\"../assets/images/producto_peluches.jpeg\"},"
//				
//				+ "{\"idProducto\":10, \"idCategoria\":4, \"nombre\":\"Para ella\", \"descripcion\":\"Para consentir a la persona con el mejor detalle para la mejor ocasión.\",\"precio\":45.00, \"nombreImagen\":\"../assets/images/producto_peluches.jpeg\"}"
//        		+ "]";
//		lista = Arrays.asList(mapper.readValue(json, ProductoBean[].class));
//		for (ProductoBean prod : lista) {
//            if(productoBean.getIdCategoria().equals(prod.getIdCategoria())) {
//            	listaporcategoria.add(prod);
//            }
//        }
//		return listaporcategoria;
//	}
}
