package com.example.demo.service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Data //getters ans setters
@AllArgsConstructor //constructor con todos los argumentos
@NoArgsConstructor
public class BillboardDto {
    Integer id;
    Boolean status;
    LocalDateTime date;
    LocalDateTime endTime;
    LocalDateTime starTime;
}
