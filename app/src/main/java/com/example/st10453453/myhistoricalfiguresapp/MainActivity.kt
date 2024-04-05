package com.example.st10453453.myhistoricalfiguresapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val processButton = findViewById<Button>(R.id.processButton)
        val clearButton =  findViewById<Button>(R.id.clearButton)
        val  ageTextNumber = findViewById<EditText>(R.id.ageTextNumber)
        val  reasonTextView = findViewById<TextView>(R.id.reasonTextView)
        processButton.setOnClickListener{

            val age = ageTextNumber.text.toString().toIntOrNull()
            if (age == null) {
                reasonTextView.text = "PLease eneter valid age"

            } else {

                if (age < 20 || age > 100) {
                    reasonTextView.text = "please enter valid age between 20 and 100 years"
                    ageTextNumber.text.clear()
                } else {
                    val result = when (age) {
                        95 -> "Nelson Rolihlahla Mandela was a South African anti-apartheid activist and politician who served as the first president of South Africa from 1994 to 1999"
                        30 -> "Steve Biko was a medical student, he founded a black student organisation in 1969 and created a national 'black consciousness' movement"
                        90 -> "Desmond Tutu was a South African Anglican bishop and theologian, known for his work as an anti-apartheid and human rights activist"
                        85 -> "Frederik Willem de Klerk was a South African politician who served as state president of South Africa from 1989 to 1994 and as deputy president from 1994 to 1996"
                        57 -> "Johan Anthoniszoon Jan van Riebeeck was a Dutch navigator and colonial administrator of the Dutch East India Company"
                        92 -> "Mama Albertina Nontsikelelo Sisulu was a political activist, nurse and community activist, and also one of the high-profile leaders of anti-apartheid resistance in South Africa"
                        48 -> "Cecil John Rhodes was an English mining magnate and politician in southern Africa who served as Prime Minister of the Cape Colony from 1890 to 1896"
                        78 -> "Christiaan Neethling Barnard was a South African cardiac surgeon who performed the world's first human-to-human heart transplant operation"
                        56 -> "Louis Botha was a South African politician who was the first prime minister of the Union of South Africa – the forerunner of the modern South African state"
                        45 -> "David Webster was an academic and anti-apartheid activist. He worked as an anthropologist at the University of the Witwatersrand"

                        else -> "Theres no historical figuer who died at that age,try another age!"

                    }
                    reasonTextView.text = result
                }
            }
            clearButton.setOnClickListener{
                ageTextNumber.text.clear()
                reasonTextView.text = ""
        }}}}

