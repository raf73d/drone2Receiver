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

    private SseEmitter emitter;

    @GetMapping("/events")
    public synchronized SseEmitter stream() {

        // Als er al een emitter bestaat → sluiten en vervangen
        if (emitter != null) {
            try {
                emitter.complete();
            } catch (Exception ignored) {}
        }

        emitter = new SseEmitter(Long.MAX_VALUE);

        emitter.onCompletion(() -> emitter = null);
        emitter.onTimeout(() -> emitter = null);
        emitter.onError(e -> emitter = null);

        return emitter;
    }

    public synchronized void send(Object data) {
        if (emitter != null) {
            try {
                emitter.send(SseEmitter.event().data(data));
            } catch (Exception e) {
                emitter = null; // emitter is dood → resetten
            }
        }
    }
}
