package com.poc.organization.exception;

import com.poc.organization.data.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * Common Exception Handler
 */
@RestControllerAdvice
public class OrganizationExceptionHandler {

    @ExceptionHandler(RecordNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ResponseBody
    public ErrorResponse handleRecordNotFoundException(RecordNotFoundException e)
    {
        ErrorResponse errorResponse = new ErrorResponse();
        errorResponse.setMessage("No Record(s) Found");
        return errorResponse;
    }

    @ExceptionHandler(DaoException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ResponseBody
    public ErrorResponse handleDaoException(DaoException e) {
        ErrorResponse response = new ErrorResponse();
        response.setMessage(e.getMessage());
        return response;
    }
}
