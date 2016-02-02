// 1
val sky = "sunny"
val fahrenheit = 100
sky == "sunny" && fahrenheit > 80

// 2
(sky == "sunny" || sky == "partly cloudy") && fahrenheit > 80

// 3
(sky == "sunny" || sky == "partly cloudy") && (fahrenheit > 80 || fahrenheit < 20)
// 4
val celsius = (fahrenheit - 32) * (5.0/9)

// 5
val fahrenheitConverted = celsius * (9.0/5) + 32
