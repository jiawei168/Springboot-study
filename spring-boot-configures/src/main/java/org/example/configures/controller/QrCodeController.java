package org.example.configures.controller;

import lombok.AllArgsConstructor;
import org.example.configures.service.QrCodeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class QrCodeController {
    private final QrCodeService qrCodeService;

    @GetMapping("/qrcode")
    public String qrcode() {
        qrCodeService.generateQrCode();
        return "";
    }
}
