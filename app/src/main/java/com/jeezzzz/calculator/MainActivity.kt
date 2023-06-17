package com.jeezzzz.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jeezzzz.calculator.databinding.ActivityMainBinding
import net.objecthunter.exp4j.ExpressionBuilder

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnClear.setOnClickListener {
            binding.inputTxt.text=""
            binding.outputTxt.text=""

        }
        binding.btn0.setOnClickListener {
            binding.inputTxt.append("0")
        }
        binding.btn1.setOnClickListener {
            binding.inputTxt.append("1")
        }
        binding.btn2.setOnClickListener {
            binding.inputTxt.append("2")
        }
        binding.btn3.setOnClickListener {
            binding.inputTxt.append("3")
        }
        binding.btn4.setOnClickListener {
            binding.inputTxt.append("4")
        }
        binding.btn5.setOnClickListener {
            binding.inputTxt.append("5")
        }
        binding.btn6.setOnClickListener {
            binding.inputTxt.append("6")
        }
        binding.btn7.setOnClickListener {
            binding.inputTxt.append("7")
        }
        binding.btn8.setOnClickListener {
            binding.inputTxt.append("8")
        }
        binding.btn9.setOnClickListener {
            binding.inputTxt.append("9")
        }
        binding.btnDot.setOnClickListener {
            binding.inputTxt.append(".")
        }
        binding.btnPlus.setOnClickListener {
            binding.inputTxt.append(" + ")
        }
        binding.btnMinus.setOnClickListener {
            binding.inputTxt.append(" - ")
        }
        binding.btnX.setOnClickListener {
            binding.inputTxt.append(" * ")
        }
        binding.btnDiv.setOnClickListener {
            binding.inputTxt.append(" / ")
        }
        binding.btnOpenbracket.setOnClickListener {
            binding.inputTxt.append(" ( ")
        }
        binding.btnClosebracket.setOnClickListener {
            binding.inputTxt.append(" ) ")
        }
        binding.btnEqual.setOnClickListener{
            val expression= ExpressionBuilder(binding.inputTxt.text.toString()).build()
            val result=expression.evaluate()
            val longResult=result.toLong()
            if(result==longResult.toDouble()){
                binding.outputTxt.text=longResult.toString()
            }
            else{
                binding.outputTxt.text=result.toString()
            }
        }
    }
}