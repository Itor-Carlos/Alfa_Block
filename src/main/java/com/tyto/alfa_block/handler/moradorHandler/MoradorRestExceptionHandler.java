package com.tyto.alfa_block.handler.moradorHandler;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.tyto.alfa_block.exceptions.moradorExceptions.MoradorNotFoundException;
import com.tyto.alfa_block.exceptions.moradorExceptions.MoradorNotFoundExceptionDetails;

@RestControllerAdvice(basePackages = "com.tyto.alfa_block.controllers")
public class MoradorRestExceptionHandler {
   
   public String formattedDate(LocalDateTime localDateTime){
      DateTimeFormatter myFormatObject = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

      return localDateTime.format(myFormatObject);
   }

   @ExceptionHandler(MoradorNotFoundException.class)
   public ResponseEntity<MoradorNotFoundExceptionDetails> moradorNotFound(MoradorNotFoundException moradorNotFoundException){

      MoradorNotFoundExceptionDetails moradorNotFoundExceptionResponse = new MoradorNotFoundExceptionDetails(HttpStatus.NOT_FOUND.value(), formattedDate(LocalDateTime.now()), "Morador Not Found", "Morador não encontrado com o cpf registrado.");

      System.out.println("rodou");

      return new ResponseEntity<MoradorNotFoundExceptionDetails>(moradorNotFoundExceptionResponse, HttpStatus.NOT_FOUND);

   }

}
