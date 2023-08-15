package com.example.instagram

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class RegisterActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        initView1()


    }

    private fun initView1() {
        var tvLanguage=findViewById<TextView>(R.id.tv_lahguage)
        var etUsername=findViewById<EditText>(R.id.et_username)
        var etPassword=findViewById<EditText>(R.id.et_password)
        var bNext=findViewById<Button>(R.id.b_next)
        var tvForgotPassword=findViewById<TextView>(R.id.tv_forgot_password)
        var bCreatAccount=findViewById<Button>(R.id.b_creat_account)
        tvLanguage.setOnClickListener {
            tvLanguage.text="English"
            etUsername.hint="Username, email or mobile phone"
            etPassword.hint="Password"
            bNext.text="Sign in"
            tvForgotPassword.text="Forgot password?"
            bCreatAccount.text="Create new account"
            tvLanguage.setOnClickListener {
                tvLanguage.text = "Русский"
                etUsername.hint = "Имя пользователя, эл. адрес или мобильн..."
                etPassword.hint = "Пароль"
                bNext.text = "Войти"
                tvForgotPassword.text = "Забыли пароль?"
                bCreatAccount.text = "Создать новый аккаунт"
            }


        }
    }

}