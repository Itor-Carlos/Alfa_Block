package com.tyto.alfa_block.exceptions.moradorExceptions;

import org.springframework.web.bind.annotation.ResponseStatus;

import com.tyto.alfa_block.exceptions.ExceptionDetails;

import java.time.LocalDateTime;




public class MoradorNotFoundException extends RuntimeException{
   public MoradorNotFoundException(){
      
   }
}