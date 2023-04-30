package com.tyto.alfa_block.exceptions.moradorExceptions;

import org.springframework.web.bind.annotation.ResponseStatus;

import com.tyto.alfa_block.exceptions.ExceptionDetails;
import org.springframework.http.HttpStatus;


@ResponseStatus(HttpStatus.NOT_FOUND)
public class MoradorNotFoundExceptionDetails extends ExceptionDetails{
   
   public MoradorNotFoundExceptionDetails(){
      super();
   }

   public MoradorNotFoundExceptionDetails(int httpStatus, String timeStamp, String exception, String message){
      super(httpStatus,timeStamp,exception,message);
   }

}
