package com.example.ventaliz.service;

import java.util.List;

import com.example.ventaliz.bean.CategoriaBean;

public interface LoginService {
	public List<CategoriaBean> listarCategoria(CategoriaBean categoriaBean) throws Exception;
	public CategoriaBean obtenerCategoriaXId(CategoriaBean categoriaBean) throws Exception;
}
