package br.com.brunoti.my_baby

class NewbornBaby : Baby {

    private var _state = ""

    override val state: String
        get() = _state

    init {
        sleep()
    }

    override fun sleep() {
        _state = "Seu Recém Nascido está dormindo"
    }

    override fun wakeUp() {
        _state = "Seu Recém Nascido acordou"
    }

    override fun smile() {
        _state = "Seu Recém Nascido sorriu"
    }

    override fun calm() {
        _state = "Seu Recém Nascido está calmo"
    }

    override fun cry() {
        _state = "Seu Recém Nascido está chorando"
    }

    override fun suckle() {
        _state = "Seu Recém Nascido quer mamar"
    }

    override fun thirst() {
        _state = "Seu Recém Nascido está com sede"
    }

    override fun colic() {
        _state = "Seu Recém Nascido está com cólica"
    }

    override fun poop() {
        _state = "Seu Recém Nascido fez cocô"
    }

    override fun pee() {
        _state = "Seu Recém Nascido fez xixi"
    }

    override fun heat() {
        _state = "Seu Recém Nascido está com calor"
    }

    override fun cold() {
        _state = "Seu Recém Nascido está com frio"
    }

}