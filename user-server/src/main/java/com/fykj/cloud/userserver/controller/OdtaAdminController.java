package com.fykj.cloud.userserver.controller;

import com.fykj.cloud.model.root.ResponseObj;
import com.fykj.cloud.userserver.service.OdtaAdminService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lis
 * @date 2018/12/25
 */
@RestController
@Api(value = "商铺分类conroller", tags = {"商铺分类"})
@RequestMapping("/odtaAdmin")
public class OdtaAdminController {
    @Autowired
    private OdtaAdminService odtaAdminService;

    @GetMapping("/selectByIdFroMysql")
    @ApiOperation(value = "商铺分类列表")
    public ResponseObj selectByIdFroMysql(@RequestParam(value = "id") Integer id) {
        return ResponseObj.createSuccessResponse(odtaAdminService.selectOdtaAdminById(id));
    }

    @GetMapping("/testSaveToRedis")
    @ApiOperation(value = "商铺分类列表")
    public ResponseObj testSaveToRedis() {
        return ResponseObj.createSuccessResponse(odtaAdminService.testSaveToRedis());
    }
}
