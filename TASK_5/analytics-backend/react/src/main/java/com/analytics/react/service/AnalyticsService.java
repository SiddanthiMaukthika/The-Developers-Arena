package com.analytics.react.service;

import java.time.Duration;
import java.util.Random;

import org.springframework.stereotype.Service;

import com.analytics.react.model.Alert;
import com.analytics.react.model.DataEvent;
import com.analytics.react.model.Prediction;

import reactor.core.publisher.Flux;

@Service
public class AnalyticsService {

    private final Random random = new Random();

    public Flux<DataEvent> metricsStream() {
        return Flux.interval(Duration.ofSeconds(1))
                .map(i -> new DataEvent("METRICS", random.nextInt(100)));
    }

    public Flux<DataEvent> logsStream() {
        return Flux.interval(Duration.ofSeconds(2))
                .map(i -> new DataEvent("LOG", "User activity " + i));
    }

    public Flux<DataEvent> businessStream() {
        return Flux.interval(Duration.ofSeconds(3))
                .map(i -> new DataEvent("BUSINESS", "Sales: " + (100 + random.nextInt(50))));
    }

    public Flux<DataEvent> combinedStream() {
        return Flux.merge(
                metricsStream(),
                logsStream(),
                businessStream()
        );
    }
    public Flux<DataEvent> search(String keyword) {
    return combinedStream()
            .filter(event -> event.getValue().toString().toLowerCase().contains(keyword.toLowerCase()));
    }
    public Flux<DataEvent> filterBySource(String source) {
    return combinedStream()
            .filter(event -> event.getSource().equalsIgnoreCase(source));
    }
    public Prediction predict() {

    int value = random.nextInt(100);

    if (value > 70) {
        return new Prediction("High growth expected", 85);
    } else if (value > 40) {
        return new Prediction("Stable trend expected", 65);
    } else {
        return new Prediction("Possible decline", 55);
    }
    }
    public Flux<Alert> alertStream() {
    return Flux.interval(Duration.ofSeconds(1))
            .map(i -> {
                int value = random.nextInt(100);

                if (value > 80) {
                    return new Alert("HIGH", "High spike detected: " + value);
                } else if (value < 20) {
                    return new Alert("LOW", "Low drop detected: " + value);
                } else {
                    return null;
                }
            })
            .filter(alert -> alert != null);
    }
}