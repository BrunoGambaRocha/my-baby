package com.example.mycompany

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.brunoti.my_baby.*
import com.example.mycompany.databinding.*
import java.util.*
import kotlin.random.Random.Default.nextInt

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private lateinit var currentBaby: Baby

    private lateinit var timer: Timer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initialStatus()

        with(binding) {
            btBabyToddler.setOnClickListener {
                startActionsWith(BabyFactory.getBaby(BabyStage.TODDLER))
            }
            btBabyNewborn.setOnClickListener {
                startActionsWith(BabyFactory.getBaby(BabyStage.NEWBORN))
            }
            btBabySleep.setOnClickListener {
                timer.cancel()
                initialStatus()
            }
        }
    }

    private fun initialStatus() {
        changeSleepButtonStatus(enable = false)
        changeBabyButtonsStatus(enable = true)
        binding.tvBabyState.text = "zZzZzZzZ"
    }

    override fun onDestroy() {
        super.onDestroy()
        timer.cancel()
    }

    private fun startActionsWith(baby: Baby) {
        currentBaby = baby
        changeSleepButtonStatus(enable = true)
        changeBabyButtonsStatus(enable = false)
        initTask()
    }

    private fun initTask() {
        timer = Timer().apply {
            schedule(
                object : TimerTask() {
                    override fun run() {
                        performRandomAction()
                    }
                },
                1000,
                1500
            )
        }
    }

    private fun changeBabyButtonsStatus(enable: Boolean) {
        with(binding) {
            btBabyNewborn.isEnabled = enable
            btBabyToddler.isEnabled = enable
        }
    }

    private fun changeSleepButtonStatus(enable: Boolean) {
        with(binding) {
            btBabySleep.isEnabled = enable
        }
    }

    private fun performRandomAction() {

        when (nextInt(13)) {
            0 -> currentBaby.sleep()
            1 -> currentBaby.wakeUp()
            2 -> currentBaby.smile()
            3 -> currentBaby.calm()
            4 -> currentBaby.cry()
            5 -> currentBaby.suckle()
            6 -> currentBaby.thirst()
            7 -> currentBaby.colic()
            8 -> currentBaby.poop()
            9 -> currentBaby.pee()
            10 -> currentBaby.heat()
            11 -> currentBaby.cold()
        }

        runOnUiThread {
            binding.tvBabyState.text = currentBaby.state
        }
    }
}
