package br.com.luancf.todolist.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MinhaPrimeiraController {
  @GetMapping("/")
  public String primeiraMensagem() {
    return "Funcionou!";
  }
}
