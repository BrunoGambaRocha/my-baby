package br.com.brunoti.my_baby

class ToddlerBaby : Baby {

    private var _state = ""

    override val state: String
        get() = _state

    init {
        sleep()
    }

    override fun sleep() {
        _state = "Seu Bebê está dormindo"
    }

    override fun wakeUp() {
        _state = "Seu Bebê acordou"
    }

    override fun smile() {
        _state = "Seu Bebê sorriu"
    }

    override fun calm() {
        _state = "Seu Bebê está calmo"
    }

    override fun cry() {
        _state = "Seu Bebê está chorando"
    }

    override fun suckle() {
        _state = "Seu Bebê quer mamar"
    }

    override fun thirst() {
        _state = "Seu Bebê está com sede"
    }

    override fun colic() {
        _state = "Seu Bebê está com cólica"
    }

    override fun poop() {
        _state = "Seu Bebê fez cocô"
    }

    override fun pee() {
        _state = "Seu Bebê fez xixi"
    }

    override fun heat() {
        _state = "Seu Bebê está com calor"
    }

    override fun cold() {
        _state = "Seu Bebê está com frio"
    }

}
