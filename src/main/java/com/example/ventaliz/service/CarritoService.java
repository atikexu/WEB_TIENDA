package com.example.ventaliz.service;

import java.util.List;

import com.example.ventaliz.bean.CarritoBean;

public interface CarritoService {
	public List<CarritoBean> listarCarrito(CarritoBean carritoBean) throws Exception;
	public List<CarritoBean> agregarCarrito(CarritoBean carritoBean, List<CarritoBean> listaTodos) throws Exception;
	public List<CarritoBean> eliminarCarrito(CarritoBean carritoBean, List<CarritoBean> listaTodos) throws Exception;
//	public CarritoBean obtenerProductoXId(CarritoBean carritoBean) throws Exception;
//	public List<CarritoBean> listarProductosXCategoria(CarritoBean carritoBean) throws Exception;
}
