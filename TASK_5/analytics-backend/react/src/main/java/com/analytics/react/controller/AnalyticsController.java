package com.analytics.react.controller;

import java.time.Duration;
import java.util.Random;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.analytics.react.model.Alert;
import com.analytics.react.model.DataEvent;
import com.analytics.react.model.Prediction;
import com.analytics.react.service.AnalyticsService;

import reactor.core.publisher.Flux;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/analytics")
public class AnalyticsController {

    private final AnalyticsService service;
    private final Random random = new Random();

    public AnalyticsController(AnalyticsService service) {
        this.service = service;
    }

    @GetMapping("/metrics")
    public Flux<Integer> getMetrics() {
        return Flux.range(1, 10)
                   .map(i -> random.nextInt(100));
    }

    @GetMapping(value = "/stream", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<Integer> streamMetrics() {
        return Flux.interval(Duration.ofSeconds(1))
                   .map(i -> random.nextInt(100));
    }

    @GetMapping(value = "/multi-stream", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<DataEvent> multiStream() {
        return service.combinedStream();
    }
    @GetMapping(value = "/search", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<DataEvent> search(@RequestParam String keyword) {
        return service.search(keyword);
    }
    @GetMapping(value = "/filter", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<DataEvent> filter(@RequestParam String source) {
        return service.filterBySource(source);
    }
    @GetMapping("/predict")
    public Prediction predict() {
        return service.predict();
    }
    @GetMapping(value = "/alerts", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<Alert> alerts() {
        return service.alertStream();
    }
}