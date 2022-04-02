package com.devsuperior.dsclient.services.excepitons;

public class ResourceNotFoundExecepiton extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public ResourceNotFoundExecepiton(String msg) {
		super(msg);
	}

}
