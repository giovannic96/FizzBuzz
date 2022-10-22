package io

import core.Printer

class ConsolePrinter: Printer {
    override fun print(data: Any) {
        println(data)
    }
}
