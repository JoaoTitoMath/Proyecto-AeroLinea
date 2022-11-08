package com.proyecto.aerolinea.utils;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Codigo No Existe")
public class NotFoundException extends RuntimeException {

}
