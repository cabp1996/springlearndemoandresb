package com.example.demo.controller;

import com.example.demo.service.BillboardService;
import com.example.demo.service.dto.BillboardDto;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/billboard")
@AllArgsConstructor
public class BillboardController {

    private BillboardService billboardService;

    @GetMapping
    public ResponseEntity<List<BillboardDto>> getBillboards(){
        return ResponseEntity.ok(billboardService.getAllBillboard());
    }
}
