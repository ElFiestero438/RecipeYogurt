package com.elfiestero438.demo.dto;

import com.elfiestero438.demo.domain.model.TemperatureLog;

import lombok.Data;

@Data
public class TemperatureRecordDTO {
    private Double temperature;
    private TemperatureLog.LogType type;
}

