/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.drone2Receiver.drone2Receiver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

/**
 *
 * @author rafde
 */
@RestController
public class SseController {
    private final SseEmitter emitter = new SseEmitter(Long.MAX_VALUE);

    @GetMapping("/events")
    public SseEmitter stream() {
        return emitter;
    }

    public SseEmitter getEmitter() {
        return emitter;
    }


}
