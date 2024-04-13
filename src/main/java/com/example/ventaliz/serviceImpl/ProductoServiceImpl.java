package com.example.ventaliz.serviceImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ventaliz.bean.CategoriaBean;
import com.example.ventaliz.bean.ProductoBean;
import com.example.ventaliz.service.ProductoService;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class ProductoServiceImpl implements ProductoService{

	@Override
	public List<ProductoBean> listarProducto(ProductoBean productoBean) throws Exception {
		List<ProductoBean> lista = new ArrayList<>();
		ObjectMapper mapper = new ObjectMapper();
		String json = "["
        		+ "{\"idProducto\":1, \"idCategoria\":1, \"nombre\":\"Eventos Especiales\", \"descripcion\":\"Para los eventos especiales el mejor detalle para la mejor ocasión.\",\"precio\":45.00, \"nombreImagen\":\"../assets/images/producto_peluches.jpeg\"},"
        		+ "{\"idProducto\":2, \"idCategoria\":1, \"nombre\":\"Eventos Especiales\", \"descripcion\":\"Para los eventos especiales el mejor detalle para la mejor ocasión.\",\"precio\":45.00, \"nombreImagen\":\"../assets/images/producto_otros.jpeg\"},"
        		+ "{\"idProducto\":3, \"idCategoria\":1, \"nombre\":\"Feliz día del niño\", \"descripcion\":\"Para los eventos especiales el mejor detalle para la mejor ocasión para el día del niño.\",\"precio\":45.00, \"nombreImagen\":\"../assets/images/producto_nino.jpeg\"},"
        		+ "{\"idProducto\":4, \"idCategoria\":1, \"nombre\":\"Feliz día de la enfermera\", \"descripcion\":\"Para los eventos especiales el mejor detalle para la mejor ocasión para el día de la enfermera.\",\"precio\":45.00, \"nombreImagen\":\"../assets/images/producto_enfermera.jpeg\"},"
        		
				+ "{\"idProducto\":5, \"idCategoria\":2, \"nombre\":\"Cumpleaños\", \"descripcion\":\"Para los cumpleaños el mejor detalle para la mejor ocasión.\",\"precio\":45.00, \"nombreImagen\":\"../assets/images/producto_cumpleanos.jpeg\"},"
				+ "{\"idProducto\":6, \"idCategoria\":2, \"nombre\":\"Cumpleaños\", \"descripcion\":\"Para los cumpleaños el mejor detalle para la mejor ocasión.\",\"precio\":45.00, \"nombreImagen\":\"../assets/images/producto_cumpleanos2.jpeg\"},"
				+ "{\"idProducto\":7, \"idCategoria\":2, \"nombre\":\"Cumpleaños\", \"descripcion\":\"Para los cumpleaños el mejor detalle para la mejor ocasión.\",\"precio\":45.00, \"nombreImagen\":\"../assets/images/producto_cumpleanos3.jpeg\"},"
				+ "{\"idProducto\":8, \"idCategoria\":2, \"nombre\":\"Cumpleaños\", \"descripcion\":\"Para los cumpleaños el mejor detalle para la mejor ocasión.\",\"precio\":45.00, \"nombreImagen\":\"../assets/images/producto_cumpleanos4.jpeg\"}"
        		+ "]";
		lista = Arrays.asList(mapper.readValue(json, ProductoBean[].class));
		return lista;
	}

	@Override
	public ProductoBean obtenerProductoXId(ProductoBean productoBean) throws Exception {
		List<ProductoBean> lista = new ArrayList<>();
		ProductoBean producto = new ProductoBean();
		ObjectMapper mapper = new ObjectMapper();
		String json = "["
        		+ "{\"idProducto\":1, \"idCategoria\":1, \"nombre\":\"Eventos Especiales\", \"descripcion\":\"Para los eventos especiales el mejor detalle para la mejor ocasión.\",\"precio\":45.00, \"nombreImagen\":\"../assets/images/producto_peluches.jpeg\"},"
        		+ "{\"idProducto\":2, \"idCategoria\":1, \"nombre\":\"Eventos Especiales\", \"descripcion\":\"Para los eventos especiales el mejor detalle para la mejor ocasión.\",\"precio\":45.00, \"nombreImagen\":\"../assets/images/producto_otros.jpeg\"},"
        		+ "{\"idProducto\":3, \"idCategoria\":1, \"nombre\":\"Feliz día del niño\", \"descripcion\":\"Para los eventos especiales el mejor detalle para la mejor ocasión para el día del niño.\",\"precio\":45.00, \"nombreImagen\":\"../assets/images/producto_nino.jpeg\"},"
        		+ "{\"idProducto\":4, \"idCategoria\":1, \"nombre\":\"Feliz día de la enfermera\", \"descripcion\":\"Para los eventos especiales el mejor detalle para la mejor ocasión para el día de la enfermera.\",\"precio\":45.00, \"nombreImagen\":\"../assets/images/producto_enfermera.jpeg\"},"
        		
				+ "{\"idProducto\":5, \"idCategoria\":2, \"nombre\":\"Cumpleaños\", \"descripcion\":\"Para los cumpleaños el mejor detalle para la mejor ocasión.\",\"precio\":45.00, \"nombreImagen\":\"../assets/images/producto_cumpleanos.jpeg\"},"
				+ "{\"idProducto\":6, \"idCategoria\":2, \"nombre\":\"Cumpleaños\", \"descripcion\":\"Para los cumpleaños el mejor detalle para la mejor ocasión.\",\"precio\":45.00, \"nombreImagen\":\"../assets/images/producto_cumpleanos2.jpeg\"},"
				+ "{\"idProducto\":7, \"idCategoria\":2, \"nombre\":\"Cumpleaños\", \"descripcion\":\"Para los cumpleaños el mejor detalle para la mejor ocasión.\",\"precio\":45.00, \"nombreImagen\":\"../assets/images/producto_cumpleanos3.jpeg\"},"
				+ "{\"idProducto\":8, \"idCategoria\":2, \"nombre\":\"Cumpleaños\", \"descripcion\":\"Para los cumpleaños el mejor detalle para la mejor ocasión.\",\"precio\":45.00, \"nombreImagen\":\"../assets/images/producto_cumpleanos4.jpeg\"}"
        		+ "]";
		lista = Arrays.asList(mapper.readValue(json, ProductoBean[].class));
		for (ProductoBean prod : lista) {
            if(productoBean.getIdProducto().equals(prod.getIdProducto())) {
            	producto = prod;
            }
        }
		return producto;
	}
	
	@Override
	public List<ProductoBean> listarProductosXCategoria(ProductoBean productoBean) throws Exception {
		List<ProductoBean> listaporcategoria = new ArrayList<>();
		List<ProductoBean> lista = new ArrayList<>();
		ObjectMapper mapper = new ObjectMapper();
		String json = "["
        		+ "{\"idProducto\":1, \"idCategoria\":1, \"nombre\":\"Eventos Especiales\", \"descripcion\":\"Para los eventos especiales el mejor detalle para la mejor ocasión.\",\"precio\":45.00, \"nombreImagen\":\"../assets/images/producto_peluches.jpeg\"},"
        		+ "{\"idProducto\":2, \"idCategoria\":1, \"nombre\":\"Eventos Especiales\", \"descripcion\":\"Para los eventos especiales el mejor detalle para la mejor ocasión.\",\"precio\":45.00, \"nombreImagen\":\"../assets/images/producto_otros.jpeg\"},"
        		+ "{\"idProducto\":3, \"idCategoria\":1, \"nombre\":\"Feliz día del niño\", \"descripcion\":\"Para los eventos especiales el mejor detalle para la mejor ocasión para el día del niño.\",\"precio\":45.00, \"nombreImagen\":\"../assets/images/producto_nino.jpeg\"},"
        		+ "{\"idProducto\":4, \"idCategoria\":1, \"nombre\":\"Feliz día de la enfermera\", \"descripcion\":\"Para los eventos especiales el mejor detalle para la mejor ocasión para el día de la enfermera.\",\"precio\":45.00, \"nombreImagen\":\"../assets/images/producto_enfermera.jpeg\"},"
        		
				+ "{\"idProducto\":5, \"idCategoria\":2, \"nombre\":\"Cumpleaños\", \"descripcion\":\"Para los cumpleaños el mejor detalle para la mejor ocasión.\",\"precio\":45.00, \"nombreImagen\":\"../assets/images/producto_cumpleanos.jpeg\"},"
				+ "{\"idProducto\":6, \"idCategoria\":2, \"nombre\":\"Cumpleaños\", \"descripcion\":\"Para los cumpleaños el mejor detalle para la mejor ocasión.\",\"precio\":45.00, \"nombreImagen\":\"../assets/images/producto_cumpleanos2.jpeg\"},"
				+ "{\"idProducto\":7, \"idCategoria\":2, \"nombre\":\"Cumpleaños\", \"descripcion\":\"Para los cumpleaños el mejor detalle para la mejor ocasión.\",\"precio\":45.00, \"nombreImagen\":\"../assets/images/producto_cumpleanos3.jpeg\"},"
				+ "{\"idProducto\":8, \"idCategoria\":2, \"nombre\":\"Cumpleaños\", \"descripcion\":\"Para los cumpleaños el mejor detalle para la mejor ocasión.\",\"precio\":45.00, \"nombreImagen\":\"../assets/images/producto_cumpleanos4.jpeg\"},"
				
				+ "{\"idProducto\":9, \"idCategoria\":3, \"nombre\":\"Para él\", \"descripcion\":\"Para consentir a la persona con el mejor detalle para la mejor ocasión.\",\"precio\":45.00, \"nombreImagen\":\"../assets/images/producto_peluches.jpeg\"},"
				
				+ "{\"idProducto\":10, \"idCategoria\":4, \"nombre\":\"Para ella\", \"descripcion\":\"Para consentir a la persona con el mejor detalle para la mejor ocasión.\",\"precio\":45.00, \"nombreImagen\":\"../assets/images/producto_peluches.jpeg\"}"
        		+ "]";
		lista = Arrays.asList(mapper.readValue(json, ProductoBean[].class));
		for (ProductoBean prod : lista) {
            if(productoBean.getIdCategoria().equals(prod.getIdCategoria())) {
            	listaporcategoria.add(prod);
            }
        }
		return listaporcategoria;
	}
}
