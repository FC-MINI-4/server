package com.toy4.domain.department.exception;

import com.toy4.global.response.type.ErrorCode;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class DepartmentException extends RuntimeException {

  private ErrorCode errorCode;
  private String errorMessage;
  private HttpStatus httpStatus;

  public DepartmentException(ErrorCode errorCode) {
    this.errorCode = errorCode;
    this.errorMessage = errorCode.getMessage();
    this.httpStatus = errorCode.getHttpStatus();
  }

}
