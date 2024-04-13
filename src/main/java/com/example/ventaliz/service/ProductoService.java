package com.example.ventaliz.service;

import java.util.List;

import com.example.ventaliz.bean.ProductoBean;

public interface ProductoService {
	public List<ProductoBean> listarProducto(ProductoBean productoBean) throws Exception;
	public ProductoBean obtenerProductoXId(ProductoBean productoBean) throws Exception;
	public List<ProductoBean> listarProductosXCategoria(ProductoBean productoBean) throws Exception;
}
