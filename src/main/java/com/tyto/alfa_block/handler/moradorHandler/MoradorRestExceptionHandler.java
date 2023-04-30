package com.tyto.alfa_block.handler.moradorHandler;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.tyto.alfa_block.exceptions.moradorExceptions.MoradorNotFoundException;

@RestControllerAdvice(basePackages = "com.tyto.alfa_block.controllersjava")
public class MoradorRestExceptionHandler {
   
   public String formattedDate(LocalDateTime localDateTime){
      DateTimeFormatter myFormatObject = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

      return localDateTime.format(myFormatObject);
   }

   @ExceptionHandler(MoradorNotFoundException.class)
   public ResponseEntity<MoradorNotFoundException> moradorNotFound(MoradorNotFoundException moradorNotFoundException){

      MoradorNotFoundException moradorNotFoundExceptionResponse = new MoradorNotFoundException(HttpStatus.NOT_FOUND.value(), formattedDate(LocalDateTime.now()), "Morador Not Found", "Morador não encontrado com o cpf registrado.");

      System.out.println(formattedDate(LocalDateTime.now()));

      return new ResponseEntity<>(moradorNotFoundExceptionResponse, HttpStatus.NOT_FOUND);

   }

}
