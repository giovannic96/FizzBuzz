package io

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import java.io.ByteArrayOutputStream
import java.io.PrintStream
import kotlin.test.assertEquals

internal class ConsolePrinterTest {

    private lateinit var outputStreamCaptor: ByteArrayOutputStream
    private lateinit var standardOut: PrintStream
    private lateinit var consolePrinter: ConsolePrinter

    @BeforeEach
    fun setUp() {
        outputStreamCaptor = ByteArrayOutputStream()
        standardOut = System.out
        consolePrinter = ConsolePrinter()
        System.setOut(PrintStream(outputStreamCaptor))
    }

    @AfterEach
    fun tearDown() {
        System.setOut(standardOut)
    }

    @Test
    internal fun `should not display anything on standard output when print an empty string`() {
        consolePrinter.print("")

        assertEquals("", outputStreamCaptor.toString().trim())
    }

    @Test
    internal fun `should display the given string on standard output when print a non empty string`() {
        consolePrinter.print("fizzBuzz")

        assertEquals("fizzBuzz", outputStreamCaptor.toString().trim())
    }
}
