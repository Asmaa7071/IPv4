package org.example

fun isValidIPv4(ip: String): Boolean {
    // Ensure there are no leading or trailing spaces
    if (ip.trim() != ip) return false

    // Ensure no consecutive dots, and that the address doesn't start or end with a dot
    if (ip.startsWith(".") || ip.endsWith(".") || ip.contains("..")) return false

    //split each ip for segments
    val segments = ip.split(".")

    // Ensure exactly 4 segments
    if (segments.size != 4) return false

    for (segment in segments) {
        // Ensure each segment contains only digits
        if (!segment.all { it.isDigit() }) return false

        // Ensure no leading zeros (except for "0" itself)
        if (segment.length > 1 && segment.startsWith("0")) return false

        // Convert to integer and ensure it's within the valid range (0-255)
        val number = segment.toIntOrNull() ?: return false
        if (number !in 0..255) return false
    }
    return true
}