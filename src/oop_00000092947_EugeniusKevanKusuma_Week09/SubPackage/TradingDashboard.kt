package oop_00000092947_EugeniusKevanKusuma_Wekk09.SubPackage

fun main() {

    val tradeHistory = listOf(

        TradeLog("BTCUSDT", "LONG", 20, 15.5, "CLOSED"),
        TradeLog("ETHUSDT", "SHORT", 10, -5.2, "CLOSED"),
        TradeLog("SOLUSDT", "LONG", 15, 8.3, "OPEN"),
        TradeLog("BTCUSDT", "SHORT", 25, -10.5, "CLOSED"),
        TradeLog("ETHUSDT", "LONG", 15, 12.8, "CLOSED"),
        TradeLog("BNBUSDT", "LONG", 20, 3.4, "OPEN"),
        TradeLog("XRPUSDT", "SHORT", 30, -2.1, "CLOSED")

    )

    // Pipeline 1

    val closedTrades = tradeHistory.filter {

        it.status == "CLOSED"

    }

    // Pipeline 2

    val winningTrades = closedTrades.filter {

        it.roe > 0

    }

    // Pipeline 3

    val losingTrades = closedTrades.filter {

        it.roe <= 0

    }

    // Pipeline 4

    val topPerformersString = winningTrades

        .sortedByDescending {

            it.roe

        }

        .map {

            "WIN [${it.pair} - ${it.position}]: +${it.roe}% ROE (Lev: ${it.leverage}x)"

        }

    // Pipeline 5

    val worstPerformersString = losingTrades

        .sortedBy {

            it.roe

        }

        .map {

            "LOSS [${it.pair} - ${it.position}]: ${it.roe}% ROE (Lev: ${it.leverage}x)"

        }

    // Pipeline tambahan

    val uniquePairs = tradeHistory

        .map {

            it.pair

        }

        .toSet()

    println("=== CRYPTO TRADING DASHBOARD ===")

    println()

    println("TOP PERFORMERS")

    topPerformersString.forEach {

        println(it)

    }

    println()

    println("WORST PERFORMERS")

    worstPerformersString.forEach {

        println(it)

    }

    println()

    println("UNIQUE PAIRS")

    println(uniquePairs)

}