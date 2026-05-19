package oop_00000092947_EugeniusKevanKusuma_Week01.SubPackage

fun main() {
    val studentName = "Kevan"
    val score = 85

    val grade = when {
        score >= 85 -> "A"
        score >= 70 -> "B"
        score >= 60 -> "C"
        score >= 50 -> "D"
        else -> "E"
    }

    val status = calculateStatus(score)

    val note: String? = null
    val finalNote = note?.uppercase() ?: "No note available"

    println("Student: $studentName")
    println("Score: $score")
    println("Grade: $grade")
    println("Status: $status")
    println("Note: $finalNote")
}

fun calculateStatus(score: Int) =
    if (score >= 60) "Passed" else "Failed"