package com.example.demo.service.mapper;

import com.example.demo.entity.BillboardEntity;
import com.example.demo.service.dto.BillboardDto;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Service;

//@Mapper(componentModel = "spring" ,uses={BillboardMapper.class})
@Service
@Mapper(componentModel = "spring")
public interface BillboardMapper {

    BillboardEntity toBillboardEntity(BillboardDto dto);
    BillboardDto toBillboardDto(BillboardEntity entity);
}
