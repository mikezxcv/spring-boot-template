package com.template.mikezxcv.template.service.implementation;

import com.template.mikezxcv.template.model.dao.ClienteDao;
import com.template.mikezxcv.template.model.entity.Cliente;
import com.template.mikezxcv.template.service.ICliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ClienteImplementation implements ICliente {

    @Autowired
    private ClienteDao clienteDao;

    @Transactional
    @Override
    public Cliente save(Cliente cliente) {
        System.out.println("cliente:");
        System.out.println(cliente);

        return clienteDao.save(cliente);
    }

    @Transactional(readOnly = true)
    @Override
    public Cliente findById(Integer id) {
        return clienteDao.findById(id).orElse(null);
    }

    @Transactional
    @Override
    public void delete(Cliente cliente) {
    clienteDao.delete(cliente);
    }
}
