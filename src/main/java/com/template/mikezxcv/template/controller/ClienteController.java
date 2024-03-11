package com.template.mikezxcv.template.controller;

import com.template.mikezxcv.template.model.entity.Cliente;
import com.template.mikezxcv.template.service.ICliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/")
public class ClienteController {

    @Autowired
    private ICliente clienteService;

    @PostMapping("cliente")
    public Cliente create(@RequestBody Cliente cliente){
        return clienteService.save(cliente);
    }

    @PutMapping("cliente")
    public Cliente update(@RequestBody Cliente cliente){
        return clienteService.save(cliente);
    }

    @DeleteMapping("cliente")
    public void delete(Integer idCliente){
        Cliente clienteDelete = clienteService.findById(idCliente);
        this.clienteService.delete(clienteDelete);
    }

    @GetMapping("cliente/{id}")
    public Cliente showById(@PathVariable Integer id){
        return clienteService.findById(id);
    }
}
