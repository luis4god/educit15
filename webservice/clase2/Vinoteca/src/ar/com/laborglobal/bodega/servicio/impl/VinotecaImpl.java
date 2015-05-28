package ar.com.laborglobal.bodega.servicio.impl;

import javax.jws.WebService;

import ar.com.laborglobal.bodega.servicio.Vinoteca;
@WebService
public class VinotecaImpl implements Vinoteca {

	@Override
	public String obtenerBodega(String bodega) {
		return bodega;
	}

}
