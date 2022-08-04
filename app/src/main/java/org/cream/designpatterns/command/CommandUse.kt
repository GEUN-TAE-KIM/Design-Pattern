package org.cream.designpatterns.command

fun main() {
    CommandProcessor()
        .addToQueue(OrderAddCommand(1))
        .addToQueue(OrderAddCommand(2))
        .addToQueue(OrderPayCommand(2))
        .addToQueue(OrderPayCommand(1))
        .processCommands()
}