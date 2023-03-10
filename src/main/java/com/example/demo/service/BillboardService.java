package com.example.demo.service;

import com.example.demo.service.dto.BillboardDto;

import java.util.List;

public interface BillboardService {

    List<BillboardDto> getAllBillboard();

    BillboardDto getBillboardById();

    BillboardDto createBillboard();

    BillboardDto updateBillboard();

    void deleteBillboard();
}
