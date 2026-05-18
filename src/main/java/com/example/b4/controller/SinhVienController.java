package com.example.b4.controller;

import com.example.b4.model.SinhVien;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class SinhVienController {

    @GetMapping(value = "/sinhvien", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
    public List<SinhVien> getDanhSachSinhVien() {
        List<SinhVien> ds = new ArrayList<>();
        ds.add(new SinhVien("SV001", "Phan Thuận Thành", 9.5));
        ds.add(new SinhVien("SV002", "Nguyễn Văn A", 7.8));
        ds.add(new SinhVien("SV003", "Trần Thị B", 8.2));
        return ds;
    }
}