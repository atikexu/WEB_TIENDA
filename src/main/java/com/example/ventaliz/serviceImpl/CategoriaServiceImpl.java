package com.example.ventaliz.serviceImpl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ventaliz.bean.CategoriaBean;
import com.example.ventaliz.service.CategoriaService;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class CategoriaServiceImpl implements CategoriaService{

	@Override
	public List<CategoriaBean> listarCategoria(CategoriaBean categoriaBean) throws Exception {
		List<CategoriaBean> lista = new ArrayList<>();
		
		ObjectMapper mapper = new ObjectMapper();
        String json = "["
        		+ "{\"idCategoria\":1, \"nombre\":\"Eventos Especiales\", \"descripcion\":\"Para los eventos especiales el mejor detalle para la mejor ocasión.\"},"
        		+ "{\"idCategoria\":2, \"nombre\":\"Cumpleaños\", \"descripcion\":\"Para los cumpleaños el mejor detalle para la mejor ocasión.\"},"
        		+ "{\"idCategoria\":3, \"nombre\":\"Para él\", \"descripcion\":\"Para consentir con los mejores detalle para la mejor ocasión.\"},"
        		+ "{\"idCategoria\":4, \"nombre\":\"Para ella\", \"descripcion\":\"Para consentir con los mejores detalle para la mejor ocasión.\"}"
        		+ "]";
        try {
        	lista = Arrays.asList(mapper.readValue(json, CategoriaBean[].class));
        } catch (IOException e) {
            e.printStackTrace();
        }

		return lista;
	}

	@Override
	public CategoriaBean obtenerCategoriaXId(CategoriaBean categoriaBean) throws Exception {
		List<CategoriaBean> lista = new ArrayList<>();
		CategoriaBean categoria = new CategoriaBean();
		ObjectMapper mapper = new ObjectMapper();
		String json = "["
        		+ "{\"idCategoria\":1, \"nombre\":\"Eventos Especiales\", \"descripcion\":\"Para los eventos especiales el mejor detalle para la mejor ocasión.\"},"
        		+ "{\"idCategoria\":2, \"nombre\":\"Cumpleaños\", \"descripcion\":\"Para los cumpleaños el mejor detalle para la mejor ocasión.\"},"
        		+ "{\"idCategoria\":3, \"nombre\":\"Para él\", \"descripcion\":\"Para consentir con los mejores detalle para la mejor ocasión.\"},"
        		+ "{\"idCategoria\":4, \"nombre\":\"Para ella\", \"descripcion\":\"Para consentir con los mejores detalle para la mejor ocasión.\"}"
        		+ "]";
		lista = Arrays.asList(mapper.readValue(json, CategoriaBean[].class));
		for (CategoriaBean cat : lista) {
            if(categoriaBean.getIdCategoria().equals(cat.getIdCategoria())) {
            	categoria = cat;
            }
        }
		return categoria;
	}
}
