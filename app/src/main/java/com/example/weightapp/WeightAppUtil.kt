package WeightAppUtil

import kotlin.math.round

    fun WeightRounder(weight: Float):Float {
        if (weight <= 45.0) {
            return 45.toFloat()
        }
        else
            return ((Math.round(weight/5))*5).toFloat()
    }
    fun PlatesPerSide(totalWeight: Float):String {
        var weightPerSide:Float = (totalWeight - 45)/2
        val plateWeight: FloatArray = floatArrayOf(45.toFloat(), 35.toFloat(), 25.toFloat(), 10.toFloat(), 5.toFloat(), 2.5.toFloat())
        var platesPerSide: IntArray = intArrayOf(0, 0, 0, 0, 0, 0)
        var totalPlates = ""

        while (weightPerSide > 0) {
            if (weightPerSide >= plateWeight[0]) {
                platesPerSide[0]++
                weightPerSide -= plateWeight[0]
            }
            else if (weightPerSide >= plateWeight[1]) {
                platesPerSide[1]++
                weightPerSide -= plateWeight[1]
            }
            else if (weightPerSide >= plateWeight[2]) {
                platesPerSide[2]++
                weightPerSide -= plateWeight[2]
            }
            else if (weightPerSide >= plateWeight[3]) {
                platesPerSide[3]++
                weightPerSide -= plateWeight[3]
            }
            else if (weightPerSide >= plateWeight[4]) {
                platesPerSide[4]++
                weightPerSide -= plateWeight[4]
            }
            else if (weightPerSide >= plateWeight[5]) {
                platesPerSide[5]++
                weightPerSide -= plateWeight[5]
            }
        }

        if(platesPerSide[0] != 0) {
            totalPlates += platesPerSide[0].toInt().toString() + "x" + plateWeight[0].toInt().toString() + " "
        }
        if(platesPerSide[1] != 0) {
            totalPlates += platesPerSide[1].toInt().toString() + "x" + plateWeight[1].toInt().toString() + " "
        }
        if(platesPerSide[2] != 0) {
            totalPlates += platesPerSide[2].toInt().toString() + "x" + plateWeight[2].toInt().toString() + " "
        }
        if(platesPerSide[3] != 0) {
            totalPlates += platesPerSide[3].toInt().toString() + "x" + plateWeight[3].toInt().toString() + " "
        }
        if(platesPerSide[4] != 0) {
            totalPlates += platesPerSide[4].toInt().toString() + "x" + plateWeight[4].toInt().toString() + " "
        }
        if(platesPerSide[5] != 0) {
            totalPlates += platesPerSide[5].toInt().toString() + "x" + plateWeight[5].toString() + " "
        }
        if (totalPlates == "") {
           totalPlates = "None"
        }
        return totalPlates
    }

