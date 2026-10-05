package com.rays.ctl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.dto.VehicleDTO;
import com.rays.form.VehicleForm;
import com.rays.service.VehicleServiceInt;

@RestController
@RequestMapping(value = "Vehicle")
public class VehicleCtl extends BaseCtl<VehicleForm, VehicleDTO, VehicleServiceInt>{

}
