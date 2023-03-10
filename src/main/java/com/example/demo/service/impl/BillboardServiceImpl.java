package com.example.demo.service.impl;

import com.example.demo.entity.BillboardEntity;
import com.example.demo.repository.BillboardRepository;
import com.example.demo.service.BillboardService;
import com.example.demo.service.dto.BillboardDto;
import com.example.demo.service.mapper.BillboardMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor //todo lo que sea final
public class BillboardServiceImpl implements BillboardService {

    final BillboardRepository billboardRepository;
    final BillboardMapper billboardMapper;

    @Override
    public List<BillboardDto> getAllBillboard() {
        List<BillboardDto> billboards= billboardRepository.findAll().stream().map(entities->entityToDto(entities)).collect(Collectors.toList()); //siempre retorna la entity no el dto, se debe mapear
        //billboards.stream().map(entity->entityToDto((entity))).toL;
        return billboards;
    }

    @Override
    public BillboardDto getBillboardById() {
        return null;
    }

    @Override
    public BillboardDto createBillboard() {
        return null;
    }

    @Override
    public BillboardDto updateBillboard() {
        return null;
    }

    @Override
    public void deleteBillboard() {

    }

    private BillboardDto entityToDto(BillboardEntity entity){
        return billboardMapper.toBillboardDto(entity);
    }

    private BillboardEntity dtoToEntity(BillboardDto dto){
        return billboardMapper.toBillboardEntity(dto);
    }
}
