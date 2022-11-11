package com.example.registration

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var saxeli:EditText
    private lateinit var gvari:EditText
    private lateinit var email:EditText
    private lateinit var paroli:EditText
    private lateinit var check:CheckBox
    private lateinit var button:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        saxeli=findViewById(R.id.saxeli)
        gvari=findViewById(R.id.gvari)
        email=findViewById(R.id.email)
        paroli=findViewById(R.id.paroli)
        check=findViewById(R.id.check)
        button=findViewById(R.id.button)
        button.setOnClickListener {
            if (saxeli.text.toString() == "" || saxeli.text.toString().length<3 ){
                Toast.makeText(this, "გთხოვთ,შეიყვანოთ სახელი", Toast.LENGTH_SHORT).show()
            } else if (gvari.text.toString() == "" || gvari.text.toString().length<5){
                Toast.makeText(this, "გთხოვთ,შეიყვანოთ გვარი", Toast.LENGTH_SHORT).show()
            } else if (email.text.toString() == "" || !(email.text.toString().contains("@") && email.text.toString().contains("."))){
                Toast.makeText(this, "გთხოვთ,შეიყვანეთ მეილი", Toast.LENGTH_SHORT).show()
            }else if (paroli.text.toString() == ""){
                Toast.makeText(this, "გთოხვთ,შეიყვანეთ პაროლი", Toast.LENGTH_SHORT).show()
            }else if (paroli.text.toString().length<8) {
                Toast.makeText(this, "პაროლი უნდა შედგებოდეს მინიმუმ 8 სიმბოლოსგან", Toast.LENGTH_SHORT).show()
            }else if (!(paroli.text.toString().contains("[0-9]".toRegex()))){
                Toast.makeText(this, "პაროლი უნდა შედგებოდეს მინიმუმ 1 ციფრისგან", Toast.LENGTH_SHORT).show()
            }else if (!check.isChecked){
                Toast.makeText(this, "გთხოვთ,დათანმხდეთ წესებს", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "თქვენ წარმატებით გაიარეთ რეგისტარცია", Toast.LENGTH_SHORT).show()
            }




        }

    }
}