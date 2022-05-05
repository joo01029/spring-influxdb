package com.influx.spring_influxdb

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringInfluxdbApplication

fun main(args: Array<String>) {
    runApplication<SpringInfluxdbApplication>(*args)
}
