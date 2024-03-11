package com.template.mikezxcv.template.service;

import com.template.mikezxcv.template.model.entity.Cliente;

public interface ICliente {
    Cliente save(Cliente cliente);
    Cliente findById(Integer id);
    void delete(Cliente cliente);
}
