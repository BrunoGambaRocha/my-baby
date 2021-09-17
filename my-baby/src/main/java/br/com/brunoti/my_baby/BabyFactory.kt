package br.com.brunoti.my_baby

object BabyFactory {
    fun getBaby(type: BabyStage): Baby {
        return when (type) {
            BabyStage.NEWBORN -> NewbornBaby()
            BabyStage.TODDLER -> ToddlerBaby()
        }
    }
}