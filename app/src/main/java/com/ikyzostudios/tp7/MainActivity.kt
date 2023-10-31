package com.ikyzostudios.tp7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.ikyzostudios.tp7.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(
            this, R.layout.activity_main
        )



        binding.button6.setOnClickListener {
            if (binding.num1.text.toString().isNotEmpty() &&
                binding.num2.text.toString().isNotEmpty()
            ) {

                binding.result.setText(
                    (binding.num1.text.toString().toInt() + binding.num2.text.toString()
                        .toInt()).toString()
                )
            }


        }

        binding.button7.setOnClickListener {
            if (binding.num1.text.toString().isNotEmpty() &&
                binding.num2.text.toString().isNotEmpty()
            ) {

                binding.result.setText(
                    (binding.num1.text.toString().toInt() - binding.num2.text.toString()
                        .toInt()).toString()
                )
            }


        }
        binding.button8.setOnClickListener {
            if (binding.num1.text.toString().isNotEmpty() &&
                binding.num2.text.toString().isNotEmpty()
            ) {

                binding.result.setText(
                    (binding.num1.text.toString().toInt() * binding.num2.text.toString()
                        .toInt()).toString()
                )
            }


        }
        binding.button9.setOnClickListener {
            if (binding.num1.text.toString().isNotEmpty() &&
                binding.num2.text.toString().isNotEmpty() &&
                binding.num2.text.toString() != "0"
            ) {

                binding.result.setText(
                    (binding.num1.text.toString().toInt() / binding.num2.text.toString()
                        .toInt()).toString()
                )
            } else {

                val text = "hil 3inik!"
                val duration = Toast.LENGTH_SHORT

                val toast = Toast.makeText(this, text, duration)
                toast.show()
            }


        }

        binding.clear.setOnClickListener {
            binding.num1.text = null
            binding.num2.text = null
        }

    }
}