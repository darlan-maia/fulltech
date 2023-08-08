package com.capgemini.panteranegra.controllers;

import com.capgemini.panteranegra.models.CustumerNameInputDTO;
import com.capgemini.panteranegra.services.ChairService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/api/chair")
public class ChairController {
    @Autowired
    private ChairService service;

    @GetMapping("/{id}")
    public ModelAndView findById(@PathVariable("id") Long id) {
        return service.findById(id);
    }

    @GetMapping("")
    public ModelAndView findAll() {
        return service.findAll();
    }

    @PostMapping("")
    public ModelAndView findByCustumerName(@RequestBody CustumerNameInputDTO cliente) {
        return service.findByCustomerName(cliente.getNomeCliente());
    }

    @GetMapping("/assign/{id}")
    public ModelAndView assignChairToCustomer(@PathVariable("id") Long id, @RequestBody CustumerNameInputDTO cliente) {
        return service.assignChairToCustomer(id, cliente.getNomeCliente());
    }
}