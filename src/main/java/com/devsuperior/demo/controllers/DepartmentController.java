package com.devsuperior.demo.controllers;


import com.devsuperior.demo.dto.DepartmentDTO;
import com.devsuperior.demo.services.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
@RequestMapping(value = "/departments")
public class DepartmentController {


        @Autowired
        private DepartmentService service;


    @GetMapping
    public ResponseEntity<List<DepartmentDTO>> findAll() {
        List<DepartmentDTO> list = (List<DepartmentDTO>) service.findAll();
        return ResponseEntity.ok(list);
    }
}
