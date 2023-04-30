package com.tyto.alfa_block.exceptions;

import java.time.LocalDateTime;

public class ExceptionDetails extends RuntimeException{
   
   private int httpStatus;
   private String timeStamp;
   private String exception;
   private String message;

   public ExceptionDetails(){

   }

   public ExceptionDetails(int httpStatus, String timeStamp, String exception, String message) {
      this.httpStatus = httpStatus;
      this.timeStamp = timeStamp;
      this.exception = exception;
      this.message = message;
   }

   public int getHttpStatus() {
      return httpStatus;
   }

   public void setHttpStatus(int httpStatus) {
      this.httpStatus = httpStatus;
   }

   public String getTimeStamp() {
      return timeStamp;
   }

   public void setTimeStamp(String timeStamp) {
      this.timeStamp = timeStamp;
   }

   public String getException() {
      return exception;
   }

   public void setException(String exception) {
      this.exception = exception;
   }

   public String getMessage() {
      return message;
   }

   public void setMessage(String message) {
      this.message = message;
   }
}
